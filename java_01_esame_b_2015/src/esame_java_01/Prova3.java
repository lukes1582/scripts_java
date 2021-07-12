package esame_java_01;

import java.util.Scanner;


/***
l0m1s
lukes1582@gmail.com
13/04/2016
 */

public class Prova3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String str_input = "";
		
		System.out.println("Per piacere inserisci una stringa");
		
		str_input = input.next();
		
		prova3(str_input);	

	}
	
	public static void prova3(String str){
		char [] prova3 = str.toCharArray();
		String str_prova3 = "";
		
		for (int i = 0; i < prova3.length; i++){
			for (int j = prova3.length-1; j>i; j--){
				str_prova3 += prova3[j] + " ";
			}
			System.out.println(str_prova3);
			str_prova3 = "";
		}
		
		
		
	}

}
