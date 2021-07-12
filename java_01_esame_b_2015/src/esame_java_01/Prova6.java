package esame_java_01;

import java.util.Scanner;

/***
l0m1s
lukes1582@gmail.com
14/04/2016
 */

 public class Prova6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str_input = "";
		
		System.out.println("Per piacere inserisci una stringa");
		
		str_input = input.next();
		
		prova6(str_input);

	}
	
	public static void prova6(String str){
		char MAN_J = 'J';
		char MIN_J = 'j';
		char [] prova6 = str.toCharArray();
		boolean var = true;
		for(int i = 0; i<prova6.length; i++){
			if((MAN_J==prova6[i]) || (MIN_J==prova6[i])){
				System.out.println("La stringa da te passata contiene almeno una J ");
				break;
			} else{
				var = false;
			}
		}
		if(!var){
			System.out.println("La stringa da te passata non contiene J ");
		}
		
	}

}
