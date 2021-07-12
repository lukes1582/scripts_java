package esame_java_01;

import java.util.Scanner;

/***
l0m1s
lukes1582@gmail.com
13/04/2016
 */

public class Prova2 {

	public static void main(String[] args) {
		String z_val;

		Scanner input = new Scanner(System.in);

		System.out.println("Per piacere inserisci il testo");

		z_val=input.next();

		prova2(z_val);

	}


	public static void prova2(String z_val){
		char [] prova2 = z_val.toCharArray();
		String str_prova2 = "";

		for(int i = 0; i<prova2.length; i++){
			for (int j = 0; j<i;j++){
				str_prova2 += prova2[j]+" ";
			}
			System.out.println(str_prova2);
			str_prova2 = "";
		}

	} 

}
