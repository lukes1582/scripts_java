
public class Decimal {

/***
l0m1s
lukes1582@gmail.com
05/05/2016
 */

	/**
	 * dichiarazione della variabile che mi definisce l'oggetto di base
	 * **/
	private float val;
	
	/**
	 * costruttore anonimo dell'oggeto  che viene associato al valore 0
	 * **/
	public Decimal(){
		val = 0;
	}
	
	/**
	 *  costruttore con passaggio parametri un int
	 * **/
	public Decimal (int arg0){
		val = (float) arg0;
	}
	
	/**
	 * costruttore con passaggio parametri un double
	 * **/
	public Decimal (double arg0){
		val = (float)arg0;
	}
	
	/**
	 * costruttore con passaggio parametri un oggetto String
	 * **/
	public Decimal (String arg0){
		val = Float.parseFloat(arg0);
	}
	
	/**
	 * costruttore con passaggio parametri float
	 * **/
	public Decimal (float arg0){
		val = arg0;
	}
	
	/**
	 * Metodo Set con passaggio parametri un int
	 * **/
	public void setDecimal(int arg0){
		val = (float) arg0;
	}
	
	/**
	 *  Metodo Set con passaggio parametri un double
	 * **/
	public void setDecimal(double arg0){
		val = (float) arg0;
	}
	
	/**
	 *  Metodo Set con passaggio parametri un oggetto String
	 * **/
	public void setDecimal(String arg0){
		val = Float.parseFloat(arg0);
	}
	
	/**
	 *  Metodo Set con passaggio parametri un float
	 * **/
	public void setDecimal(float arg0){
		val = arg0;
	}
	
	/**
	 *  Metodo Get con restituzione valore un oggetto String
	 * **/
	public String getDeciaml(){
		return String.valueOf(val);
	}
	
	/**
	 *  Metodo Get con restituzione valore float
	 * **/
	public float getDecimal(){
		return val;
	}
	
	/**
	 * 
	 * **/
	
	public String convertDecimalToDegreeString(){
		int inter = (int)((this.val)%360);
		double var = this.val - inter;
		int deg = inter;
		int min = (int)(((var)*60)%60);
		float sec = (float)(((var)*3600)%60);
		Degree x = new Degree(deg, min, sec);				
		return x.defString();
	}
	
	public Degree convertDecimalToDegree(){
		int inter = (int)((this.val)%360);
		double var = this.val - inter;
		int deg = inter;
		int min = (int)(((var)*60)%60);
		float sec = (float)(((var)*3600)%60);
		Degree x = new Degree(deg, min, sec);				
		return x;
	}
	
	
	
}
