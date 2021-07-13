public class Species extends Genus {
	private String speciesName;
	
	/**
	* l0m1s
	* lukes1582@gmail.com
	* 09/10/2015
	 */
	
	public Species(){
		super ("");
		setSpeciesName("", "");
	}
	
	public Species(String g, String s){ //String g ){
		super(g);
		setSpeciesName(s,g);
	}
	
	public void setSpeciesName(String s, String g){ 
		speciesName = g+" "+s; 
		}
	
	public String getSpeciesName(){ 
		return speciesName; 
		}
	
	public String toString(){
		return getSpeciesName() + " toString di Species";
	}
	
	public boolean equals(Species s){
		return speciesName.equals(s.getSpeciesName());
	}
}
