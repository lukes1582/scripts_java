package esame_java_01;

import java.util.Scanner;


/***
l0m1s
lukes1582@gmail.com
14/04/2016
 */


public class Tabellina {

	public static void main(String[] args) {
		int numero = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci numero per la tabellina:\n");
		numero = input.nextInt();
		calcolaTabellina(numero);

	}

	static public void calcolaTabellina(int x){
		System.out.println("Ecco la tabellina del "+x);
		for(int i = 0; i<=10; i++){
			System.out.println(x+" x "+i+" = "+x*i);
		}
		System.out.println("Fine della tabellina");
	}
}
