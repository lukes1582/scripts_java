public class Specimen{
	
	/**
	* l0m1s
	* lukes1582@gmail.com
	* 09/10/2015
	 */

	private String name;
	private int cageNumber;
	private Species toa; // "Type Of Animal"

	public Specimen( String a, int c, Species s){ //esemplare
		setName(a);
		setCage(c);
		setTOA(s);
	}

	public void setName(String a){ 
		name = a; 
	}

	public void setCage(int c){ //gabbia
		cageNumber = c; 
	}

	public void setTOA(Species s){ 
		toa = s; 
	}

	public String getName(){ 
		return name; 
	}


	public Species getTOA(){
		return toa; 
	}

	public String toString(){ //metodo toString
		return name + " e' un " + getTOA() + " si trova nella gabbia nr.: " + cageNumber+ " toString di Specimen";

	
	}


/*	public int countSpecimens( Specimen[] animals, int s ){

		animals = new Specimen[2];
		
		int i;
		for(i=0;i<animals.length;i++){
			Specimen[setName(i),SetCage(i),];
			
			
			i++;
		}
		return i; 
		//return animals.length;
	} 

*/
	
	/**
	public static int countSpecimens(Specimen [] animali){
		return animali.length;
	} **/
	
	public static int countSpecimens(Specimen [] ciao){
		int x = 0;
		for ( int i = 0; i<ciao.length; i++){
			if(ciao[i]!=null){
				x++;
			}
		}
				
		return x;
	}

	

	public static void main (String[] args) {

		Species specie = new Species("Cane","Lupo");

		System.out.println(specie.toString()+"\n");

		Specimen s = new Specimen("Billy",2,specie);
		Specimen s1 = new Specimen("Ares",3,new Species("Cavallo","Pezzato"));


		System.out.println(s.toString()+"\n"+s1.toString());
		System.out.println(specie.toString()+"\n"+s1.toString());
		
		///---------------------------------------------------------------
		
		Specimen [] animaliStrani = new Specimen [5];
		
		animaliStrani[0] = s; 
		animaliStrani[1] = s1;
		
		System.out.println("quanti animali strani ci sono "+countSpecimens(animaliStrani));
		
	}

}