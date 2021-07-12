package esame_java_01;

import java.util.Scanner;

/***
l0m1s
lukes1582@gmail.com
14/04/2016
 */

public class Prova5 {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str_input = "";
		
		System.out.println("Per piacere inserisci una stringa di caratteri");
		
		str_input = input.next();
		
		prova5(str_input);
	}
	
	public static void prova5(String str){
		char [] prova5 = str.toCharArray();
		for(int i = 0; i<prova5.length; i++){
			System.out.println(prova5[i]);
		}
		
		
		
	}
	
}
