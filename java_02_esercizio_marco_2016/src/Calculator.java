import java.util.Scanner;

/***
l0m1s
lukes1582@gmail.com
05/05/2016
 */

public class Calculator {

	
	public Calculator(){
	}
	
	public void start(){
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("      calcolator decimal degree         ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" SELECT THE VALUE                       ");
		System.out.println(" [1] operation decimal                  ");
		System.out.println(" [2] operation degree                   ");
		System.out.println(" [x] exit program                       ");
	}

	/***
	 * 
	 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 * 
	 * **/

	public void startDecimal(){
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("      calcolator decimal                ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" SELECT THE VALUE                       ");
		System.out.println(" [a] operation decimal sum              ");
		System.out.println(" [b] operation decimal subtraction      ");
		System.out.println(" [c] operation decimal multiplication   ");
		System.out.println(" [d] operation decimal division         ");
		System.out.println(" [e] convertion decimal degree          ");
		System.out.println(" [r] return principal menu              ");
		System.out.println(" [x] exit program                       ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
	}
	
	public void startDegree(){
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("      calcolator degree                 ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" SELECT THE VALUE                       ");
		System.out.println(" [f] operation degree sum               ");
		System.out.println(" [g] operation degree subtraction       ");
		System.out.println(" [h] operation degree multiplication    ");
		System.out.println(" [i] operation degree division          ");
		System.out.println(" [l] convertion degree decimal          ");
		System.out.println(" [r] return principal menu              ");
		System.out.println(" [x] exit program                       ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
	}
	
	/***
	 * 
	 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 * 
	 * **/
	
	public void sumDec(){
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("      calcolator decimal  sum           ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" insert the first value                 ");
		Scanner input0 = new Scanner(System.in);
		Decimal arg0 = new Decimal(input0.nextFloat());
		System.out.println(" insert the secondo value               ");
		Scanner input1 = new Scanner(System.in);
		Decimal arg1 = new Decimal(input1.nextFloat());
		Decimal result = sumDecimal(arg0, arg1);
		System.out.println(" the result is                          ");
		System.out.println(result.getDeciaml());
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("  do you want convert in degree [y/n]   ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char xChar = str.charAt(0); 
		if((xChar == 'y') || (xChar == 'Y')){
			System.out.println(" the result is                          ");
			System.out.println(result.convertDecimalToDegree().defString());
		}	
	}
	
	public void subDec(){
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("      calcolator decimal  subtraction   ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" insert the first value                 ");
		Scanner input0 = new Scanner(System.in);
		Decimal arg0 = new Decimal(input0.nextFloat());
		System.out.println(" insert the secondo value               ");
		Scanner input1 = new Scanner(System.in);
		Decimal arg1 = new Decimal(input1.nextFloat());
		Decimal result = subDecimal(arg0, arg1);
		System.out.println(" the result is                          ");
		System.out.println(result.getDeciaml());
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("  do you want convert in degree [y/n]   ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char xChar = str.charAt(0); 
		if((xChar == 'y') || (xChar == 'Y')){
			System.out.println(" the result is                          ");
			System.out.println(result.convertDecimalToDegree().defString());
		}	
	}
	
	public void multDec(){
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("      calcolator decimal multiplication ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" insert the first value                 ");
		Scanner input0 = new Scanner(System.in);
		Decimal arg0 = new Decimal(input0.nextFloat());
		System.out.println(" insert the secondo value               ");
		Scanner input1 = new Scanner(System.in);
		Decimal arg1 = new Decimal(input1.nextFloat());
		Decimal result = multDecimal(arg0, arg1);
		System.out.println(" the result is                          ");
		System.out.println(result.getDeciaml());
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("  do you want convert in degree [y/n]   ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char xChar = str.charAt(0); 
		if((xChar == 'y') || (xChar == 'Y')){
			System.out.println(" the result is                          ");
			System.out.println(result.convertDecimalToDegree().defString());
		}	
	}
	
	public void divDec(){
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("      calcolator decimal  division      ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" insert the first value                 ");
		Scanner input0 = new Scanner(System.in);
		Decimal arg0 = new Decimal(input0.nextFloat());
		System.out.println(" insert the secondo value               ");
		Scanner input1 = new Scanner(System.in);
		Decimal arg1 = new Decimal(input1.nextFloat());
		Decimal result = divDecimal(arg0, arg1);
		System.out.println(" the result is                          ");
		System.out.println(result.getDeciaml());
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("  do you want convert in degree [y/n]   ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char xChar = str.charAt(0); 
		if((xChar == 'y') || (xChar == 'Y')){
			System.out.println(" the result is                          ");
			System.out.println(result.convertDecimalToDegree().defString());
		}	
	}
	
	public void convertInDegree(){
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("      convert decimal in degree         ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" insert the value                       ");
		Scanner input0 = new Scanner(System.in);
		Decimal arg0 = new Decimal(input0.nextFloat());
		System.out.println(" the result is                          ");
		System.out.println(arg0.convertDecimalToDegree().defString());
	}
	
	/***
	 * 
	 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 * 
	 * **/
	
	public void sumDeg(){
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("      calcolator degree  sum            ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" insert only the degree value           ");
		Scanner inputD = new Scanner(System.in);
		String strD = inputD.next();
		System.out.println(" insert only the minute value           ");
		Scanner inputM = new Scanner(System.in);
		String strM = inputM.next();
		System.out.println(" insert only the second value           ");
		Scanner inputS = new Scanner(System.in);
		String strS = inputS.next();
		Degree arg0 = new Degree(strD, strM, strS);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" insert only the degree value           ");
		Scanner inputD1 = new Scanner(System.in);
		String strD1 = inputD1.next();
		System.out.println(" insert only the minute value           ");
		Scanner inputM1 = new Scanner(System.in);
		String strM1 = inputM1.next();
		System.out.println(" insert only the second value           ");
		Scanner inputS1 = new Scanner(System.in);
		String strS1 = inputS1.next();
		Degree arg1 = new Degree(strD1, strM1, strS1);
		Degree result = sumDegree(arg0, arg1);
		System.out.println(" the result is                          ");
		result.printDegree();
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("  do you want convert in decimal [y/n]  ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char xChar = str.charAt(0); 
		if((xChar == 'y') || (xChar == 'Y')){
			System.out.println(" the result is                       ");
			System.out.println(result.convertDegreeToDecimalString());
		}	
	}
	
	public void subDeg(){
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("      calcolator degree  subtraction    ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" insert only the degree value           ");
		Scanner inputD = new Scanner(System.in);
		String strD = inputD.next();
		System.out.println(" insert only the minute value           ");
		Scanner inputM = new Scanner(System.in);
		String strM = inputM.next();
		System.out.println(" insert only the second value           ");
		Scanner inputS = new Scanner(System.in);
		String strS = inputS.next();
		Degree arg0 = new Degree(strD, strM, strS);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" insert only the degree value           ");
		Scanner inputD1 = new Scanner(System.in);
		String strD1 = inputD1.next();
		System.out.println(" insert only the minute value           ");
		Scanner inputM1 = new Scanner(System.in);
		String strM1 = inputM1.next();
		System.out.println(" insert only the second value           ");
		Scanner inputS1 = new Scanner(System.in);
		String strS1 = inputS1.next();
		Degree arg1 = new Degree(strD1, strM1, strS1);
		Degree result = subDegree(arg0, arg1);
		System.out.println(" the result is                          ");
		result.printDegree();
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("  do you want convert in decimal [y/n]  ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char xChar = str.charAt(0); 
		if((xChar == 'y') || (xChar == 'Y')){
			System.out.println(" the result is                       ");
			System.out.println(result.convertDegreeToDecimalString());
		}		
	}
	
	public void multDeg(){		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("      calcolator degree  multiplication ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" insert only the degree value           ");
		Scanner inputD = new Scanner(System.in);
		String strD = inputD.next();
		System.out.println(" insert only the minute value           ");
		Scanner inputM = new Scanner(System.in);
		String strM = inputM.next();
		System.out.println(" insert only the second value           ");
		Scanner inputS = new Scanner(System.in);
		String strS = inputS.next();
		Degree arg0 = new Degree(strD, strM, strS);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" insert only the degree value           ");
		Scanner inputD1 = new Scanner(System.in);
		String strD1 = inputD1.next();
		System.out.println(" insert only the minute value           ");
		Scanner inputM1 = new Scanner(System.in);
		String strM1 = inputM1.next();
		System.out.println(" insert only the second value           ");
		Scanner inputS1 = new Scanner(System.in);
		String strS1 = inputS1.next();
		Degree arg1 = new Degree(strD1, strM1, strS1);
		Degree result = multDegree(arg0, arg1);
		System.out.println(" the result is                          ");
		result.printDegree();
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("  do you want convert in decimal [y/n]  ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char xChar = str.charAt(0); 
		if((xChar == 'y') || (xChar == 'Y')){
			System.out.println(" the result is                       ");
			System.out.println(result.convertDegreeToDecimalString());
		}		

		
		
	}
	
	public void divDeg(){
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("      calcolator degree  division       ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" insert only the degree value           ");
		Scanner inputD = new Scanner(System.in);
		String strD = inputD.next();
		System.out.println(" insert only the minute value           ");
		Scanner inputM = new Scanner(System.in);
		String strM = inputM.next();
		System.out.println(" insert only the second value           ");
		Scanner inputS = new Scanner(System.in);
		String strS = inputS.next();
		Degree arg0 = new Degree(strD, strM, strS);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" insert only the degree value           ");
		Scanner inputD1 = new Scanner(System.in);
		String strD1 = inputD1.next();
		System.out.println(" insert only the minute value           ");
		Scanner inputM1 = new Scanner(System.in);
		String strM1 = inputM1.next();
		System.out.println(" insert only the second value           ");
		Scanner inputS1 = new Scanner(System.in);
		String strS1 = inputS1.next();
		Degree arg1 = new Degree(strD1, strM1, strS1);
		Degree result = divDegree(arg0, arg1);
		System.out.println(" the result is                          ");
		result.printDegree();
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("  do you want convert in decimal [y/n]  ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char xChar = str.charAt(0); 
		if((xChar == 'y') || (xChar == 'Y')){
			System.out.println(" the result is                       ");
			System.out.println(result.convertDegreeToDecimalString());
		}		
	
	}
	
	public void convertInDecimal(){
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("      convert degree in decimal         ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" insert the value                       ");
		Scanner inputD = new Scanner(System.in);
		String strD = inputD.next();
		System.out.println(" insert only the minute value           ");
		Scanner inputM = new Scanner(System.in);
		String strM = inputM.next();
		System.out.println(" insert only the second value           ");
		Scanner inputS = new Scanner(System.in);
		String strS = inputS.next();
		Degree arg0 = new Degree(strD, strM, strS);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" the result is                          ");
		System.out.println(arg0.convertDegreeToDecimalString());
	}
	
	/***
	 * 
	 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 * 
	 * **/
	
	protected Degree sumDegree(Degree arg0, Degree arg1){
		float x = arg0.convertDegreeToDecimal();
		float y = arg1.convertDegreeToDecimal();
		float result = ((x + y)%360);
		Decimal z = new Decimal(result); 
		return z.convertDecimalToDegree();	
	}
	/**
	 *  sommo due decimali
	 * **/
	protected Decimal sumDecimal(Decimal arg0,Decimal arg1){
		Decimal result = new Decimal();
		result.setDecimal((arg0.getDecimal() + arg1.getDecimal())%360);		
		return result;
		
	}

	protected Degree subDegree(Degree arg0, Degree arg1){
		float x = arg0.convertDegreeToDecimal();
		float y = arg1.convertDegreeToDecimal();
		float result = ((x - y)%360);
		Decimal z = new Decimal(result); 
		return z.convertDecimalToDegree();
	}
	/***
	 * sottraggo due decimali
	 * */
	protected Decimal subDecimal(Decimal arg0,Decimal arg1){
		Decimal result = new Decimal();
		result.setDecimal((arg0.getDecimal() - arg1.getDecimal())%360);		
		return result;
	}
	
	protected Degree multDegree(Degree arg0, Degree arg1){
		float x = arg0.convertDegreeToDecimal();
		float y = arg1.convertDegreeToDecimal();
		float result = ((x * y)%360);
		Decimal z = new Decimal(result); 
		return z.convertDecimalToDegree();	
	}
	/***
	 * moltiplico due decimali
	 * **/
	protected Decimal multDecimal(Decimal arg0,Decimal arg1){
		Decimal result = new Decimal();
		result.setDecimal((arg0.getDecimal() * arg1.getDecimal())%360);		
		return result;
		
	}
	
	protected Degree divDegree(Degree arg0, Degree arg1){
		float x = arg0.convertDegreeToDecimal();
		float y = arg1.convertDegreeToDecimal();
		float result = ((x / y)%360);
		Decimal z = new Decimal(result); 
		return z.convertDecimalToDegree();	
	}
	/**
	 * divido due decimali
	 * **/
	protected Decimal divDecimal(Decimal arg0,Decimal arg1){
		Decimal result = new Decimal();
		result.setDecimal((arg0.getDecimal() / arg1.getDecimal())%360);		
		return result;
	}
	
	
}
