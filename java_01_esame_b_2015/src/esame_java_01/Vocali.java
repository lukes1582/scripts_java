package esame_java_01;

import java.util.Scanner;

/***
l0m1s
lukes1582@gmail.com
12/04/2016
 */

public class Vocali {

	public static void main(String[] args) {
		String x;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una serie di caratteri");
		x=input.next();
		
		contaVocali(x);
	}

	
	static public void contaVocali(String x) {
				
		if ((x.contains("a"))||(x.contains("A"))||(x.contains("e"))||(x.contains("E"))||(x.contains("i"))||(x.contains("I"))
				||(x.contains("o"))||(x.contains("O"))||(x.contains("u"))||(x.contains("U"))){
			System.out.println("La stringa che mi hai passato contiene almeno una vocale");
		}else{
			System.out.println("La stringa che mi hai passato non contiene vocali ");
		}
		
		
		
	}
}
