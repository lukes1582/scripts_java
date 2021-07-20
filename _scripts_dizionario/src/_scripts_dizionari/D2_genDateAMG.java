package _scripts_dizionari;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class D2_genDateAMG {
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
	
	public D2_genDateAMG() throws IOException{
		pandora = new ArrayList<String>();		
		xfile = new File("G:\\prova\\dizionario2.txt");
		wfile = new FileWriter(xfile);
		bfile = new BufferedWriter(wfile);
		creaCombinazioniDueCaratteri();
		bfile.close();
	}
	
	public void creaCombinazioniDueCaratteri() throws IOException{
		String strG = "";
		String strM = "";
		String strA = "";
		
		for(int i = 1; i<32; i++){ // giorno
			for(int h = 1; h<13; h++){ // mese
				for(int k = 1900; k<2021; k++){ // anno
					strA+=k;
					if(i<10){
						strG+="0"+i;
					}else {
						strG+=i;
					}
					if(h<10){
						strG+="0"+h;
					}else {
						strG+=h;
					}
					if(i==29 && h==2){
						bfile.write(strA+strM+strG+"\n");
						break;
					}else{
						bfile.write(strA+strM+strG+"\n");
					}
					strG = "";
					strM = "";
					strA = "";
				}
			}
		}		
	}
}
