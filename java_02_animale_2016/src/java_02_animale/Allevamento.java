package java_02_animale;

import java.util.ArrayList;
import java.util.Collections;

/***
l0m1s
lukes1582@gmail.com
10/05/2016
 */



public class Allevamento {
	private ArrayList<Animale> all;
	
	public Allevamento(){
		this.all = new ArrayList<Animale>(10);
	}
	
	public Allevamento(int arg0){
		this.all = new ArrayList<Animale>(arg0);
	}
	
	public Allevamento(ArrayList<Animale> all){
		this.all = all;
 	}
	
	public void addAnimale(Animale arg0){
		this.all.add(arg0);
	}
	
	public int sizeAllevamento(){
		return this.all.size();
	}
	
	public Animale getAnimale(int arg0){
		return this.all.get(arg0);
	}
	
	public void ordinaPerNome(){
		Collections.sort(this.all);
	}
	
	public void ordinaPerPeso(){
		Collections.sort(this.all,Animale.getComparatorPeso());
	}
	
	public void stampaTutto(){
		for(Animale animal : this.all){
			animal.scriviOutput();
		}
	}
	
	/***
	
	public void statistica(Allevamento arg0){
		double mag_di_10 = 0;
		double min_di_5 = 0;
		double tra_5_e_10 = 0;
		arg0.ordinaPerPeso();
		for(int i = 0; i < arg0.sizeAllevamento();i++){
			if(arg0.getAnimale(i).getPeso()>10){
				mag_di_10++;
			}else if(arg0.getAnimale(i).getPeso()<5){
				min_di_5++;
			}else if(arg0.getAnimale(i).getPeso()<10 && arg0.getAnimale(i).getPeso()>5){
				tra_5_e_10++;
			}
		}
		System.out.println("Gli animali che pesano piu' di 10kg sono "+mag_di_10+" in percentuale "+((mag_di_10/arg0.sizeAllevamento())*100)+"%");
		System.out.println("Gli animali che pesano tra 5 e 10kg sono "+tra_5_e_10+" in percentuale "+((tra_5_e_10/arg0.sizeAllevamento())*100)+"%");
		System.out.println("Gli animali che pesano meno di 5kg sono  "+min_di_5+" in percentuale "+((min_di_5/arg0.sizeAllevamento())*100)+"%");
	}
	**/
	public void statistica(){
		double mag_di_10 = 0;
		double min_di_5 = 0;
		double tra_5_e_10 = 0;
		for(int i = 0; i < this.all.size();i++){
			if(all.get(i).getPeso()>=10){
				mag_di_10++;
			}else if(all.get(i).getPeso()<=5){
				min_di_5++;
			}else if(all.get(i).getPeso()<10 && all.get(i).getPeso()>5){
				tra_5_e_10++;
			}
		}
		System.out.println("Gli animali che pesano piu' di 10kg sono "+mag_di_10+" in percentuale "+((mag_di_10/all.size())*100)+"%");
		System.out.println("Gli animali che pesano tra 5 e 10kg sono "+tra_5_e_10+" in percentuale "+((tra_5_e_10/all.size())*100)+"%");
		System.out.println("Gli animali che pesano meno di 5kg sono  "+min_di_5+" in percentuale "+((min_di_5/all.size())*100)+"%");

	}
	

}
