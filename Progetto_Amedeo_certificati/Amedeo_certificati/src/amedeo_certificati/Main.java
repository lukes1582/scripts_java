package amedeo_certificati;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
	/**
	 * l0m1s
	 * lukes1582@gmail.com
	 * 2016
	 * 
	 */
	public static void main(String args[]) throws IOException {
		
		File lFile;
		FileReader rLfile;
		BufferedReader bRLFile;
		
		File lRicercaFile;
		FileReader rLRicercafile;
		BufferedReader bRLRicercaFile;
		
		File sFile;
		FileWriter wSFile;
		BufferedWriter bWSFile;
		
		ArrayList <String> lista = new ArrayList <String>();
		List <String> ricerca = new ArrayList<String>();
		
		String utente = "";
		/**path dei certificati */
		String path ="O:\\xxx\\yyy\\www\\certificati\\";
		File folder = new File(path+"certDaCaricare");


		try {

			File[] elencoDeiCert = folder.listFiles();  //leggo l'elenco dei file nella cartella e li inserisco in lista
			String [] nomeCert = new String[elencoDeiCert.length];
	
			//------------------------------------------------------------------------------------------------------------------------------------------------------
			/***
			 * file per la ricerca del numero di matricola
			 * **/
			lRicercaFile = new File(path+"utenti.txt");
			rLRicercafile = new FileReader(lRicercaFile);
			bRLRicercaFile = new BufferedReader(rLRicercafile);			
			//------------------------------------------------------------------------------------------------------------------------------------------------------
			/**
			 * scrittura file certificati
			 * */
			sFile = new File(path+"out\\out_luke.ldif");
			wSFile = new FileWriter(sFile);
			bWSFile = new BufferedWriter(wSFile);
			//------------------------------------------------------------------------------------------------------------------------------------------------------
			
			for(int i=0;  i < elencoDeiCert.length;i++ ){
				nomeCert[i] = elencoDeiCert[i].getName().substring(0,8).toUpperCase();
		
				/**
				 * LUKES1582@GMAIL.COM
				 * 
				 * */
					
				//------------------------------------------------------------------------------------------------------------------------------------------------------
				/***
				 * file da caricare CERTIFICATI
				 * */
				lFile = new File(path+"certDaCaricare\\"+nomeCert[i]+".cer");
				rLfile = new FileReader(lFile);
				bRLFile = new BufferedReader(rLfile);
				
				// stringa di sponda
				String strLinea = "";

				/**
				 * ciclo lettura linee certificati
				 * **/
				while((strLinea = bRLFile.readLine()) != null){
					lista.add(strLinea);
				}				
				
				//------------------------------------------------------------------------------------------------------------------------------------------------------
				//STRINGA DI SPONDA PER GLI UTENTI
				String strLineaUtenti = "";
				
				/**
				 * ciclo lettura utenti
				 * **/
				while((strLineaUtenti = bRLRicercaFile.readLine()) != null){
					ricerca.add(strLineaUtenti);
				}
				
				//---------------AVVIO RICERCA--------------------------------------------------------------------------------------------------------------------------
				
				utente = ricercaMatricola(ricerca,nomeCert[i]);
				String utenteFinale = utente.substring(0,utente.indexOf(nomeCert[i])+8);
				//------------------------------------------------------------------------------------------------------------------------------------------------------
				bWSFile.newLine();
				bWSFile.write("dn: cn=\""+utenteFinale+"\",cn=users,dc=hhh,dc=kkk,dc=ppp,dc=qqq");
				bWSFile.newLine();
				bWSFile.write("changetype: modify");
				bWSFile.write("replace: usercertificate"+"\n");
				bWSFile.write("usercertificate:");
								
				for(int zI = 0; zI<lista.size(); zI++){
					if(zI>0 && zI<lista.size()-1)
						bWSFile.write(lista.get(zI));
				}
				bWSFile.write("\n");
				lista.clear();
			}
			bWSFile.close();
		}
		/**
		* fine
		**/
	
		catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public static String ricercaMatricola(List<String> lista, String matricola){
		String str = "";
		
		for (int i = 0; i<lista.size(); i++){
			str = lista.get(i);
			if(str.matches(".*"+matricola+".*")){
				//System.out.println(str);
				return str;
			}else{
				str = "UTENTE NON TROVATO";
			}
		}
			
		return str;
	}
		
	
	
}

