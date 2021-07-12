
public class Degree {

/***
l0m1s
lukes1582@gmail.com
05/05/2016
 */


	/**
	 * Definizione delle variabili che definiscono l'oggetto di tipo Degree
	 * **/
	private int deg;
	private int min;
	private float sec;
	
	
	
	/**
	 * costruttore anonimo dell'oggetto Degree
	 * **/
	public Degree(){
		this.deg = 0;
		this.min = 0;
		this.sec = 0;
	}
	
	/**
	 * costruttore con passaggio parametri String
	 * **/
	public Degree(String deg, String min, String sec){
		this.deg = Integer.parseInt(deg);
		this.min = Integer.parseInt(min);
		this.sec = Float.parseFloat(sec);
	}
	
	/**
	 * costruttore con passaggio parametri int e float
	 * **/
	public Degree(int deg, int min, float sec){
		this.deg = deg;
		this.min = min;
		this.sec = sec;
	}

	
	/**
	 * definizione metodi GET INT DEG
	 * */
	public int getDeg() {
		return deg;
	}
	
	/**
	 * definizione metodi GET STRING DEG
	 * */
	public String getDegString() {
		return String.valueOf(deg);
	}
	
	/**
	 * definizione metodi GET INT MIN
	 * */
	public int getMin() {
		return min;
	}
	
	/**
	 * definizione metodi GET STRING DEG
	 * */
	public String getMinString() {
		return String.valueOf(min);
	}
	
	/**
	 * definizione metodi GET FLOAT SEC
	 * */
	public float getSec() {
		return sec;
	}
	
	/**
	 * definizione metodi GET FLOAT String
	 * */
	public String getSecString() {
		return String.valueOf(sec);
	}
	
	/**
	 * definizione metodi SET int
	 * */

	public void setDeg(int deg) {
		this.deg = deg;
	}

	
	/**
	 * definizione metodi SET String
	 * */
	public void setDegString(String deg) {
		this.deg = Integer.parseInt(deg);
	}
		
	/**
	 * definizione metodi SET int
	 * */

	public void setMin(int min) {
		this.min = min;
	}

	
	/**
	 * definizione metodi SET String
	 * */
	public void setMinString(String min) {
		this.min = Integer.parseInt(min);
	}
	
	
	/**
	 * definizione metodi SET FLOAT
	 * */

	public void setSec(float sec) {
		this.sec = sec;
	}
	
	/**
	 * definizione metodi SET FLOAT String
	 * */
	public void setSecString(String sec) {
		this.sec = Float.parseFloat(sec);
	}
	
	
	
	public String defString(){
		String str = "";
		str += getDegString()+"�, "+getMinString()+"', "+getSecString()+"'' ;";
		return str;
	}
	
	
	public void printDegree(){
		System.out.println(defString());
	}
	

	public String convertDegreeToDecimalString(){
		int a = getDeg();
		int b = getMin();
		float c = getSec();
		
		float decimal = (((b*60)+c)/(60*60));
		float total = a+decimal;
		
		return Float.toString(total);
	}

	
	public float convertDegreeToDecimal(){
		int a = getDeg();
		int b = getMin();
		float c = getSec();
		
		float decimal = (((b*60)+c)/(60*60));
		float total = a+decimal;
		
		return total;
	}

	
	
}
