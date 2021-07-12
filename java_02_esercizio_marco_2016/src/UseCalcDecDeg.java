import java.util.Scanner;

public class UseCalcDecDeg {

/***
l0m1s
lukes1582@gmail.com
05/05/2016
 */


	public static void main(String[] args) {

		Calculator calc = new Calculator();
		String xVal = "";
		boolean zVal = true;

	
		calc.start();
		Scanner input = new Scanner(System.in);
		xVal = input.next();
		char xChar = xVal.charAt(0);

		while(zVal && (xVal.length()>0)){
			switch(xChar){
			case 'x': System.exit(0);
			break;
			case'1':
				calc.startDecimal();
				Scanner input1 = new Scanner(System.in);
				xVal = input1.next();
				char zChar = xVal.charAt(0);
				switch(zChar){
				case 'x': 
					zVal = false;
					System.exit(0);
				break;
				case 'a':
					calc.sumDec();
				break;
				case 'b':
					calc.subDec();
				break;
				case 'c':
					calc.multDec();
				break;
				case 'd':
					calc.divDec();
				break;
				case 'e':
					calc.convertInDegree();
				break;
				case 'r':
					calc.start();
					Scanner inputR = new Scanner(System.in);
					xVal = inputR.next();
					xChar = xVal.charAt(0);
				break;
				}
			break;
			case'2':
				calc.startDegree();
				Scanner input2 = new Scanner(System.in);
				xVal = input2.next();
				char wChar = xVal.charAt(0);
				switch(wChar){
				case 'x': 
					zVal = false;
					System.exit(0);
				break;
				case 'f':
					calc.sumDeg();
				break;
				case 'g':
					calc.subDeg();
				break;
				case 'h':
					calc.multDeg();
				break;
				case 'i':
					calc.divDeg();
				break;
				case 'l':
					calc.convertInDecimal();
				break;
				case 'r':
					calc.start();
					Scanner inputR = new Scanner(System.in);
					xVal = inputR.next();
					xChar = xVal.charAt(0);
				break;
				}
			break;
			}
		}
		
	}

}
