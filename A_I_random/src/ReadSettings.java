import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ReadSettings {
	/***
	 * l0m1s
	 * 
	 * lukes1582@gmail.com
	 */
	

	ArrayList<String> alpha = new ArrayList<String>();

	static File leggiFile;
	static FileReader rLFile;
	static BufferedReader bLFile;

	static File leggiFileOrigins;
	static FileReader rLFileOrigins;
	static BufferedReader bLFileOrigins;
	
		
	public ReadSettings() throws IOException{
	    boolean bool = false;
	    String classPath = ReadSettings.class.getProtectionDomain().getCodeSource().getLocation().getPath();
	    String path = classPath.substring(1, (classPath.length()-4));
	    try{
	         // create new files
	    	leggiFile = new File(path+"src/settings.txt");
	        // returns true if the file exists
	        bool = leggiFile.exists();
	        // if file exists
	        
	        if(bool){
	        	// get absolute path
	            path = leggiFile.getAbsolutePath();
	            // prints
	         //   System.out.print("Absolute Pathname "+ path);   ///check
	            rLFile = new FileReader(leggiFile);
	    		bLFile = new BufferedReader(rLFile);
	    		
	    		String linea = "";
	    		// read file
	    		while ((linea = bLFile.readLine()) != null) {
	    			if((!(linea.startsWith("#")))&&(linea.length()>0)){
	    				alpha.add(linea);
	    			}
	    		}	    		
	         } 
	      //  System.out.println("size "+alpha.size());  ///check
	      //  System.out.println("origin is a file "+originIsAFile());
	     }catch(Exception e){
	         e.printStackTrace();
	     }
	}
	
	protected ArrayList<String> getSettings(){
		return alpha;
	}
	protected String getOrigin(){
		return alpha.get(0);
	}
	protected String getDestination(){
		return alpha.get(1);
	}
	protected String getDestLog(){
		return alpha.get(2);
	}
	protected String getDestCut(){
		return alpha.get(3);
	}
	
	protected boolean isAFile(String str){
		boolean x = false;
		String ext = str.substring(str.length()-4, str.length());
		if(ext.equals(".txt")){
			x = true;
		}
		return x;
	}	
	protected boolean originIsAFile(){
		boolean x = false;
		String str = alpha.get(0);
		String ext = str.substring(str.length()-4, str.length());
		if(ext.equals(".txt")){
			x = true;
		}
		return x;
	}
	protected ArrayList<String> getOrigins() throws IOException{
		ArrayList<String> zOrigins = new ArrayList<String>();
		
		if(originIsAFile()){
			boolean bool = false;
			String classPath = ReadSettings.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			String path = classPath.substring(1, (classPath.length()-4));
			try{
				// create new files
				leggiFileOrigins = new File(path+"src/"+getOrigin());
				// returns true if the file exists
				bool = leggiFileOrigins.exists();
				// if file exists
				if(bool){
					// get absolute path
					path = leggiFileOrigins.getAbsolutePath();
					// prints
					//System.out.print("Absolute Pathname "+ path);   ///check
					rLFileOrigins = new FileReader(leggiFileOrigins);
					bLFileOrigins = new BufferedReader(rLFileOrigins);
	    	   		String linea = "";
	    	   		// read file
	    	   		while ((linea = bLFileOrigins.readLine()) != null) {
	    	   			zOrigins.add(linea);
	    	   		}	    		
				} 
				//System.out.println("size "+zOrigins.size());  ///check
			}catch(Exception e){
				e.printStackTrace();
			}

		}
		return zOrigins;
	}
	
}
