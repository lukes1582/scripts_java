package esame_java_01;

import java.util.Scanner;

/***
l0m1s
lukes1582@gmail.com
17/12/2015
 */

public class TestStringa {

	public static void main(String[] args) {
		String x;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa su cui fare il controllo");
		x = input.next();
		
		esisteG(x);
	}

	static public void esisteG(String x){
		char var1 = 'g';
		char var2 = 'G';
		
		if ((x.indexOf(var1)!=-1) ||(x.indexOf(var2)!=-1)){
			System.out.println("La stringa che mi hai passato contiene almeno una lettera G");
		}else{
			System.out.println("La stringa che mi hai passato non contiene lettere G ");
		}
	}
}
