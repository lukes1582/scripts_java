package java_02_animale;

import java.util.Scanner;

/***
l0m1s
lukes1582@gmail.com
10/05/2016
 */

public class UsaAllevamento {

	public static void main(String[] args) {
		
		String nome = "";
		int eta;
		double peso;
		
		Scanner inputAllevamento = new Scanner(System.in);
		System.out.println("Inserisci il valore degli animali da inserire nell'allevamento:");
		int valAll = inputAllevamento.nextInt();
		Allevamento all = new Allevamento(valAll);	
		
		for(int i = 0; i<valAll; i++){
			int j = i+1;
			System.out.println("Benvenuto/a nel tuo allevamento");
			Scanner inputNome = new Scanner(System.in);
			Scanner inputEta = new Scanner(System.in);
			Scanner inputPeso = new Scanner(System.in);
			System.out.println("Inserisci il nome dell'animale nr: "+j);
			nome = inputNome.next();
			System.out.println("Inserisci il eta' dell'animale nr: "+j);
			eta = inputEta.nextInt();
			System.out.println("Inserisci il peso dell'animale nr: "+j);
			peso = inputPeso.nextDouble();
			Animale bestia = new Animale(nome, eta, peso);
			all.addAnimale(bestia);
		}
		
		all.ordinaPerNome();
		all.stampaTutto();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		all.ordinaPerPeso();
		all.stampaTutto();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		all.statistica();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		

	}

}
