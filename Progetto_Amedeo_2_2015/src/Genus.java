public class Genus{
	private String setSpeciesName;
	
	/**
	* l0m1s
	* lukes1582@gmail.com
	* 09/10/2015
	 */

	public Genus(String g) {
		setGenusName(g);
	}


	public void setGenusName(String n){
		setSpeciesName =n;
	}

	public String getGenusName(){
		return setSpeciesName;		
	}

}
