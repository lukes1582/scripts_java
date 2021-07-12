package java_02_animale;

import java.util.Comparator;

/***
l0m1s
lukes1582@gmail.com
10/05/2016
 */



public class Animale implements Comparable<Animale>{
	private String nome;
	private int eta;
	private double peso;
	
	public Animale(){
		this.nome = "";
		this.eta = 1;
		this.peso = 1;
	}

	public Animale(String nome, int eta, double peso){
		this.nome = nome;
		this.eta = eta;
		this.peso = peso;
	}
	
	public void setAnimale(String nome, int eta, double peso){
		setNome(nome);
		setPeso(peso);
		setEta(eta);
	}
	
	public void scriviOutput(){
		System.out.println("[Nome animale: "+getNome()+" Eta': "+getEta()+" Peso: "+getPeso()+" ]");
	}
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public int compareTo(Animale arg0) {
		return this.nome.compareTo(arg0.getNome());
	}
	
	
	public static Comparator<Animale> getComparatorPeso(){   
	 Comparator<Animale> comp = new Comparator<Animale>(){
	     @Override
	     public int compare(Animale a1, Animale a2){
	         return String.valueOf(a1.getPeso()).compareTo(String.valueOf(a2.getPeso()));
	     }        
	 };
	 return comp;
	} 
	
	
	
}
