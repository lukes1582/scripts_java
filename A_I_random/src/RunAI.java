import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

/***
 * l0m1s
 * 
 * lukes1582@gmail.com
 */
	

public class RunAI {
	/**
	 * DEFINIZIONE DEI MODULI CHE SERVONO PER LA GESTIONE DELL'INTELLIGENZA
	 * ARTIFICIALE RANDOMICA
	 * 
	 * */

	/**
	 * Per definire tutte le azioni generate dalla R.A.I. e' stato implementato
	 * un logger per tenere traccia di tutto quello che e' stato fatto.
	 * Ovviamente la classe Logger e' all'inteno della applicazione e viene
	 * eseguita come prima istanza
	 * 
	 * **/
	Logger log;
	/**
	 * Come secondo step viene lanciata la parte del programma ReadSettings
	 * ovvero tutte le impostazioni piu' delicate vengono gestite da un file
	 * denominato settings.txt dove all'interno si puo' impostare a secondo
	 * delle proprie esigenze alcune impostazioni chiave come ad esempio dove
	 * scrivere i file di log etc.
	 * 
	 * */
	ReadSettings setts;
	/**
	 * Il programma lancia la creazione di una lista randomica di numeri interi
	 * a 4 cifre per i times out che verrano richiamati randomicamente
	 * */
	CalcTimesOut calc;
	/**
	 * creazione di un array list di supporto per i times out
	 * 
	 * */
	ArrayList<Integer> zTimes = new ArrayList<Integer>();

	/**
	 * creazione di un array list di supporto per le destinazioni che
	 * diventano a questo punto molteplici per aumentare la causalita
	 * dell'intelligienza artificiale randomica
	 * */
	ArrayList<String> zDestinations = new ArrayList<String>();

	public RunAI() throws IOException, InterruptedException {
		// calculate timeouts
		calc = new CalcTimesOut(10);
		
		// get times out
		zTimes = calc.getTimesOut();
		
		// read settings
		setts = new ReadSettings();
		
		// set the origins to cut or copy the files
		ArrayList<String> zOrigin = setts.getOrigins();
		
		// set a destination for example I:\\
		String zDestination = setts.getDestination();
		File fDestination = new File(zDestination);
		if(!(fDestination.exists())){
			fDestination.mkdir();
		}
		
		// set a destination to logger
		String zDestLog = setts.getDestLog();
		
		// set a destination to logger
		String zDestCut = setts.getDestCut();
		File fDestCut = new File(zDestCut);
		if(!(fDestCut.exists())){
			fDestCut.mkdir();
		}
		
		// active a logger for a actions
		log = new Logger(zDestLog);

	
		for (int elemetResources = 0; elemetResources < zOrigin.size(); elemetResources++) {
			Random numIterations = new Random();
			int elementIterations = numIterations.nextInt(10);
			for (int i = 0; i < elementIterations; i++) {
					
				// invoco il check folder per sapere quanti possibili destinazioni ho a disposizione
				zDestinations = checkFolders(zDestination);	
				zDestinations.add(zDestination);
				zDestinations.add(zDestCut);
				
				Random operation = new Random();
				int chooseOperation = ((int) (operation.nextInt() * (Math.pow(2, operation.nextInt(2)) - 1))) % 7; // because 7 are the operations
				switch (chooseOperation) {
				case 0:
					copyAllFiles(zOrigin.get(elemetResources), zDestination);
					System.out.println("copy all");
					break;
				case 1:
					Thread.sleep(randomTimesOut());
					System.out.println("sleep");
					break;
				case 2:
					randomCopyFiles(zOrigin.get(elemetResources), zDestination);
					System.out.println("copy random");
					break;
				case 3:
					randomCreateFolder(zDestination);
					System.out.println("create random folder");
					break;
				case 4:
					randomCreateFile(zDestination);
					System.out.println("create random file");
				case 5:
					Random rSize = new Random();
					randomCreateFile(zDestination,rSize.nextInt(20));
					System.out.println("create random file");
				default:
					Thread.sleep(randomTimesOut());
					System.out.println("sleep default 1");
					break;
				}
				
//				Thread.sleep(randomTimesOut());
				
				switch ((chooseOperation*11)%5) {
				case 1:
					deleteAllFiles(zDestination);
					System.out.println("delete all");
					break;
				case 2:
					cutAllFiles(zDestination, zDestCut);
					System.out.println("cut all");
					break;
				case 3:
					Thread.sleep(randomTimesOut());
					System.out.println("sleep random");
					break;
				case 4:
					randomDelete(zDestination);
					System.out.println("delete random");
					break;
				case 0:
					randomCut(zDestination, zDestCut);
					System.out.println("cut random");
					break;
				default:
					Thread.sleep(randomTimesOut());
					System.out.println("sleep default 2");
					break;
				}

//				Thread.sleep(randomTimesOut());
//				System.out.println("sleep");
				
			}
			zDestinations.clear();
		}
		
		log.closeLog();
	}

	public ArrayList<String> checkFolders(String dst){
		ArrayList<String> fatalDestinations = new ArrayList<String>();
		File zDst = new File(dst);
		File[] zDestinations = zDst.listFiles();
		for(int i = 0;i<zDestinations.length;i++){
			if(zDestinations[i].isDirectory()){
				fatalDestinations.add(zDestinations[i].getPath());
			}
		}		
		return fatalDestinations;
	}
	

	
	
	public void randomCut(String origin, String destination) throws IOException {
		try {
			log.addLog(" -- CUT RANDOM in action --");
			File[] numFile = null;

			if (IsAFolder(origin)) {
				File zOrigin = new File(origin);
				numFile = zOrigin.listFiles();
			} else {
				JOptionPane.showMessageDialog(null,
						"Errore cartella non trovata", " ",
						JOptionPane.WARNING_MESSAGE);
			}

			if (numFile.length > 0) {
				Random rCut = new Random();
				for (int i = 0; i < rCut.nextInt(numFile.length); i++) {
					String zFile = numFile[i].getPath().toString();
					String nameFile = zFile.substring(12);
					String pOrigin = "" + numFile[i];
					File fOrigin = new File(pOrigin);
					File fDestination = new File(destination + "" + nameFile);
					Files.move(fOrigin.toPath(), fDestination.toPath());
					log.addLog("I cut this file [" + fOrigin.toPath()
							+ "] in this path [" + fDestination.toPath() + "]");
				}
			} else {
				log.addLog("ther isn't a file to move");
			}
		} catch (Exception e) {
			log.addLog(e.getMessage());
		
		}

	}

	/**
	 * 
	 * METODO RANDOM COPY FILES e' un metodo a cui vengono passati i parametri
	 * di origine e destinazione il metodo ha due scelte: - se all'interno della
	 * cartella di origine ci sono meno di 20 file li copia tutti e li incolla
	 * nella cartella di destinazione - se all'interno della cartella di origine
	 * ci sono piu' di 20 file allora in modo randomico calcola un numero di
	 * iterazioni da compiere e sempre in modo randomico copia e incolla dei
	 * file dalla cartella di origine alla cartella di destinazione
	 * 
	 * */
	public void randomCopyFiles(String origin, String destination) throws IOException {
		try{
			log.addLog("-- RANDOM COPY FILES --");
			File zOrigin = new File(origin);		
			File[] numFile = zOrigin.listFiles();
			if (numFile.length > 20) {
				log.addLog("-- MORE 20 FILES --");
				Random rCopy = new Random();
				int zIterations = (int) (numFile.length * 0.4);
				for (int j = 0; j < zIterations; j++) {
					int xCopy = rCopy.nextInt(numFile.length);
					File copyOrigin = numFile[xCopy];
					String nam = copyOrigin.getName();
					File copyDestination = new File(destination+nam);
					Files.copy(copyOrigin.toPath(),copyDestination.toPath(),StandardCopyOption.REPLACE_EXISTING);
					log.addLog("I copy this file ["+copyOrigin.toPath()+"] in this destination ["+copyDestination.toPath()+" ]");
				}
			} else {
				log.addLog("-- LESS 20 FILES i Copy All --");
				File fOrigin = new File(origin);
				File fDestination = new File(destination);
				copyFolder(fOrigin, fDestination);
				log.addLog("I copy this file ["+fOrigin.toPath()+"] in this destination ["+fDestination.toPath()+" ]");
			}
		} catch (Exception e){
			log.addLog(e.getMessage());
		}

	}

	// ------------------------------------------------------------------------------------------------------------------------------------

	/***
	 * 
	 * METODO RANDOM DELETE metodo che agisce SOLO sulla cartella di
	 * destinazione, il metodo crea una lista dei file contenuti nella cartella
	 * di destinazione in modo randomico determina un numero di iterazioni, e
	 * sempre in modo casuale cancella un certo numero di file
	 * 
	 * 
	 */
	public void randomDelete(String dst) throws IOException {
		try{
			log.addLog(" -- RANDOM DELETE --");
			File zDestination = new File(dst);
			File[] numFile = zDestination.listFiles();
			Random rIterDelete = new Random();
			if (numFile.length > 0) {
				for (int i = 0; i < rIterDelete.nextInt(23); i++) {
					Random rDelete = new Random();
					int xDelete = rDelete.nextInt(numFile.length);
					Files.deleteIfExists(numFile[xDelete].toPath());
					log.addLog("I delete this file [" + numFile[xDelete].toPath()+ "]");
				}
			}
		}  catch (Exception e){
			log.addLog(e.getMessage());
		}

	}

	// ------------------------------------------------------------------------------------------------------------------------------------
	/***
	 * 
	 * METODO RANDOM TIMES OUT una volta calcolati i times out (vedi prima
	 * istruzione del programma) il metodo sceglie in modo casuale un tempo di
	 * pausa per la R.A.I.
	 * 
	 * */
	public int randomTimesOut() throws IOException {
		log.addLog(" -- RANDOM TIMES OUT -- ");
		int zSize = zTimes.size();
		Random rTimes = new Random();
		int yTimes = zTimes.get(rTimes.nextInt(zSize));
		log.addLog("Thread Sleep for millisconds " + yTimes);
		return yTimes;
	}
	// ------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * METODO RANDOM CREATE FOLDER
	 * un metodo che come passaggio parametri ha il solo URL di destinazione
	 * in automatico viene creata una cartella con un nome puramente randomic
	 * 
	 * */
	
	public void randomCreateFolder(String dst) throws IOException{
		try{
			log.addLog("-- CREATE RANDOM FOLDER --");
			Random rFolder = new Random();
			String sFolder = new BigInteger(130, rFolder).toString(32);
			File xFolder = new File (dst+"\\"+sFolder);
			xFolder.mkdir();
		} catch (Exception e){
			log.addLog(e.getMessage());
		}
	}
	// ------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * @throws IOException 
	 * 
	 * */
	public void randomCreateFile(String dst) throws IOException{
		try{
			log.addLog("-- CREATE RANDOM FILE --");
			Random rFile = new Random();
			String sFile = new BigInteger(130, rFile).toString(32);
			@SuppressWarnings("resource")
			RandomAccessFile f = new RandomAccessFile(dst+"\\"+sFile+".txt", "rw");
            f.setLength(10 * 1024 * 1024);
           // if(f.hashCode()!=0){
           // 	System.out.println("File exist");
           // }
		}catch (Exception e){
			log.addLog(e.getMessage());
		}
		
	}
	
	// ------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * @throws IOException 
	 * 
	 * */
	public void randomCreateFile(String dst, int size) throws IOException{
		try{
			log.addLog("-- CREATE RANDOM FILE WITH A SIZE "+size+" --");
			Random rFile = new Random();
			String sFile = new BigInteger(130, rFile).toString(32);
			@SuppressWarnings("resource")
			RandomAccessFile f = new RandomAccessFile(dst+"\\"+sFile+".txt", "rw");
            f.setLength(size * 1024 * 1024);
            
		}catch (Exception e){
			log.addLog(e.getMessage());
	
		}
	}
	
	
	
	// ------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * METODO COPY ALL FILES Il metodo una volta lanciato copia tutti i file e
	 * le cartelle contenute nella cartella di origine e le incolla nella
	 * cartella di destinazione
	 * 
	 * */
	public void copyAllFiles(String origin, String destination) throws IOException {
		try{
			log.addLog(" -- COPY ALL -- ");
			File fOrigin = new File(origin);
			File fDestination = new File(destination);
			copyFolder(fOrigin, fDestination);
		} catch (Exception e){
			log.addLog(e.getMessage());
		}
	}

	// ------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * METODO DELETE ALL FILES Il metodo una volta lanciato cancella tutti i
	 * file contenuti nella cartella di destinzione
	 * 
	 * */

	public void deleteAllFiles(String destination) throws IOException, InterruptedException {
		try{
			log.addLog("-- DELETE  ALL in action --");
			File zDestination = new File(destination);
			File[] numFile = zDestination.listFiles();
			if (numFile.length > 0) {
				for (int i = 0; i < numFile.length; i++) {
					Files.deleteIfExists(numFile[i].toPath());
					//System.out.println("I delete this file " + numFile[i].toPath());
					log.addLog("I delete this file [" + numFile[i].toPath() + "]");
					if (i % 70 == 0) {
						Thread.sleep(1000);
					}
				}
			} else {
				//JOptionPane.showMessageDialog(null, "Errore cartella vuota", " ",JOptionPane.WARNING_MESSAGE);
				log.addLog("Error in the folder, it is empty");
			}
		} catch (Exception e){
			log.addLog(e.getMessage());
		}

	}

	// ------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * METODO COPY FOLDER metodo che divide la possibilita' di copiare o un file
	 * o una cartella e in modo ricorsivo copia tutto quello che gli viene
	 * passato come parametro
	 * */

	public void copyFolder(File src, File dest) throws IOException {
		if (src.isDirectory()) {
			// if directory not exists, create it
			if (!dest.exists()) {
				dest.mkdir();
				log.addLog("Directory copied from [" + src + "]  to [" + dest
						+ "]");
			}

			// list all the directory contents
			String files[] = src.list();

			for (String file : files) {
				// construct the src and dest file structure

				File srcFile = new File(src, file);
				File destFile = new File(dest, file);
				// recursive copy
				copyFolder(srcFile, destFile);
			}

		} else {
			// if file, then copy it
			// Use bytes stream to support all file types
			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dest);

			byte[] buffer = new byte[1024];

			int length;
			// copy the file content in bytes
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}

			in.close();
			out.close();
			log.addLog("File copied from [" + src + "] to [" + dest + "]");
		}
	}

	// ------------------------------------------------------------------------------------------------------------------------------------

	/**
	 * METODO CUT ALL FILES dati una cartella di destinazione e una di origine
	 * taglia tutti i file in origine e li incolla in quella di destinazione
	 * */

	public void cutAllFiles(String origin, String destination) throws IOException { 
		try {
			log.addLog(" -- CUT ALL in action --");
			File[] numFile = null;

			if (IsAFolder(origin)) {
				File zOrigin = new File(origin);
				numFile = zOrigin.listFiles();
			} else {
				//JOptionPane.showMessageDialog(null, "Errore cartella non trovata"," ", JOptionPane.WARNING_MESSAGE);
				log.addLog("Error in the folder, it is empty");
			}

			if (numFile.length > 0) {
				for (int i = 0; i < numFile.length; i++) {
					String zFile = numFile[i].getPath().toString();
					String nameFile = zFile.substring(12);
					String pOrigin = "" + numFile[i];
					File fOrigin = new File(pOrigin);
					File fDestination = new File(destination + "" + nameFile);
					Files.move(fOrigin.toPath(), fDestination.toPath());
					log.addLog("I cut this file [" + fOrigin.toPath() + "] in this path [" + fDestination.toPath() + "]");
				}
			} else {
				//JOptionPane.showMessageDialog(null, "Errore cartella non trovata"," ", JOptionPane.WARNING_MESSAGE);
				log.addLog("Error in the folder, it is empty");
			} 
		}  catch (Exception e){
			log.addLog(e.getMessage());
		}

	}

	// ------------------------------------------------------------------------------------------------------------------------------------

	/**
	 * 
	 * METODO che determina se la stringa passata come parametro e' una cartella
	 * 
	 * */

	public boolean IsAFolder(String folderFiles) {
		File zA = new File(folderFiles);
		return zA.isDirectory();
	}

	// ------------------------------------------------------------------------------------------------------------------------------------

	/**
	 * 
	 * METODO che determina se la stringa passata come parametro e' un file
	 * 
	 * */

	public boolean IsAFile(String file) {
		File zB = new File(file);
		return zB.isFile();
	}
	// ------------------------------------------------------------------------------------------------------------------------------------

}
