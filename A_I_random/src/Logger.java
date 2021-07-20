import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;



public class Logger {

	/***
	 * l0m1s
	 * 
	 * lukes1582@gmail.com
	 */
	
	
	File log;
	String nameFile = "_log";
	String extFile = ".txt";
	FileWriter wSFile;
	BufferedWriter bWSFile;
	String normal = "C:\\_log.txt";
	
	
	public Logger() throws IOException{
		
		log = new File(normal);
		wSFile = new FileWriter(log);
		bWSFile = new BufferedWriter(wSFile);
		bWSFile.newLine();
		
	}
	
	public Logger (String dest) throws IOException{
		File xFile = new File(dest+"\\"+nameFile+extFile);
		if(xFile.exists()){
			Random rNum = new Random();
			log = new File(dest+"\\"+nameFile+"_"+rNum.nextInt(9999)+extFile);
		}else{
			log = new File(dest+"\\"+nameFile+extFile);
		}
				
		wSFile = new FileWriter(log);
		bWSFile = new BufferedWriter(wSFile);
		bWSFile.newLine();
		
	}
	
	public void addLog(String str) throws IOException{
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
		Calendar cal = Calendar.getInstance();
		String zDate = dateFormat.format(cal.getTime());
		try{
			if(log.exists()){				
				bWSFile.write(zDate+"   "+str+"\n");
			}
		}catch(Exception ex){
			bWSFile.close();
			ex.getMessage();
		}
	}
	
	public void closeLog() throws IOException{
		bWSFile.close();
	}
	
	
	
	

}
