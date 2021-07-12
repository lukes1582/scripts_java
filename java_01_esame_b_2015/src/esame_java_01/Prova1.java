package esame_java_01;

import java.util.Scanner;

/***
l0m1s
lukes1582@gmail.com
13/04/2016
 */

public class Prova1 {

	public static void main(String[] args) {
		
		Scanner z_val = new Scanner(System.in);
		
		System.out.println("Per piacere inserisci la striga da esaminare");
		
		String input = z_val.next();
		
		prova(input);

	}
	
	
	public static void prova(String input){
		char [] z_val = input.toCharArray();
		String str = "";
		for(int i = 0; i < z_val.length; i++){
			str += z_val[i]+" ";
		}
		System.out.println(str);
	}

}
