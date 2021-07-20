package _scripts_dizionari;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class D0_gen_IP {
	/**
	 * l0m1s
	 * 
	 * lukes1582@gmail.com
	 * 
	 * */


	ArrayList<String> pandora;
	
	String str = "";
	
	
	File xfile;
	FileWriter wfile;
	BufferedWriter bfile;
	
	public D0_gen_IP() throws IOException{
		pandora = new ArrayList<String>();		
		xfile = new File("diz_IP.txt");
		wfile = new FileWriter(xfile);
		bfile = new BufferedWriter(wfile);
		creaCombinazioni();
		bfile.close();
	}
	
	public D0_gen_IP(String A, String B) throws IOException{
		pandora = new ArrayList<String>();		
		xfile = new File("diz_IP.txt");
		wfile = new FileWriter(xfile);
		bfile = new BufferedWriter(wfile);
		creaCombinazioni(A,B);
		bfile.close();
	}
	
	
	public void creaCombinazioni() throws IOException{
			
		for(int i = 0; i<256; i++){ // class a
			for(int h = 0; h<256; h++){ // class b
				for(int k = 0; k<256; k++){ // class c
					for(int x = 0; x<256; x++){	// class d					
						bfile.write(Integer.toString(i)+"."+Integer.toString(h)+"."+Integer.toString(k)+"."+Integer.toString(x)+"\n");
					}
				}
			}
		}		
	}
	
	
	public void creaCombinazioni(String A, String B) throws IOException{
		String[] valA = A.split(".");
		String[] valB = B.split(".");
		boolean xA,xB = false;
		
		for(int i = 0; 0<valA.length;i++){
			if(Integer.parseInt(valA[i])<256){
				xA = true;
			}else{
				System.out.println("ERROR!!!");
				System.exit(0);
			}
			
		}
		for(int i = 0; 0<valB.length;i++){
			if(Integer.parseInt(valB[i])<256){
				xB = true;
			}else{
				System.out.println("ERROR!!!");
				System.exit(0);
			}
		}
		
		for(int i = Integer.parseInt(valA[0]); i<Integer.parseInt(valB[0]); i++){ // class a
			for(int h = Integer.parseInt(valA[1]); h<Integer.parseInt(valB[1]); h++){ // class b
				for(int k = Integer.parseInt(valA[2]); k<Integer.parseInt(valB[2]); k++){ // class c
					for(int x = Integer.parseInt(valA[3]); x<Integer.parseInt(valB[3]); x++){	// class d					
						bfile.write(Integer.toString(i)+"."+Integer.toString(h)+"."+Integer.toString(k)+"."+Integer.toString(x)+"\n");
					}
				}
			}
		}		
	}
	
}
