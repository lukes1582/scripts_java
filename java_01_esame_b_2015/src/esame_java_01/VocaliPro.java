package esame_java_01;

import java.util.Scanner;

/***
l0m1s
lukes1582@gmail.com
12/04/2016
 */

public class VocaliPro {

	public static void main(String[] args) {
		/***
		 * inizializzo un oggetto string per il supporto al programma
		 * **/
		String x;
		/***
		 * definisco l'oggetto scanner per l'input da passare al programma
		 * */
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		/**
		 * interagisco con l'utente per farmi dare la stringa di valori su cui eseguire il programma
		 * **/
		System.out.println("Inserisci una serie di caratteri");
		/***
		 * interagisco recependo la stringa passata
		 * */
		x=input.next();
		/**
		 * invoco il metodo che fara' l'analisi della stringa
		 * */
		contaVocali(x);
	}

	/**
	 * metodo che esegue l'algoritmo di ricerca delle vocali
	 * */
	static public void contaVocali(String x) {
		/***
		 * inizializzo una stringa dove all'interno pongo tutte le vocali conosciute
		 * **/
		String vocali = "aA�eE��iI^oO�uU�";
		/***
		 * creo una variabile booleana per un doppio controllo sulla ricerca
		 * */
		boolean word = true;
		/***
		 * creo un ciclo for che dovra' percorrere tutta la stringa in questione
		 * **/
		for(int i = 0; i<x.length();i++){
			/***
			 * Il controllo che fa il programma e' vedere se ogni singolo carattere (char convertiti in string)
			 * e' contenuto nella stringa chiamata vocali
			 * */
			if (vocali.contains(Character.toString(x.charAt(i)))){
				/**
				 * se viene trovata anche una singola vocale viene invocato il SYSO che interrompe la ricerca e 
				 * propone un esito della ricerca
				 * **/
				System.out.println("La stringa che mi hai passato contiene almeno una vocale");
				word = false;
				break;
			}
			else{

				/***
				 * qualora non venga trovata una vocale il programma imposta a true la variabile booleana
				 * che di fatto fa percorre (tramite il ciclo for) tutta la stringa per il controllo 
				 * */
				word = true;				
			}
		}
		/***
		 * ultimo controllo ovvero se non � stato rinvenuto nessuna vocale viene stampato a video 
		 * tramite il SYSO le frase sotto descritta
		 * */
		if(word){
			System.out.println("La stringa che mi hai passato non contiene vocali ");
		}

	}
}
