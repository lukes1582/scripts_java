package _scripts_dizionari;

import java.io.IOException;
import java.util.Scanner;

public class use_gen_IP {
	/**
	 * l0m1s
	 * 
	 * lukes1582@gmail.com
	 * 
	 * */

	public static void main(String[] args) throws IOException {
	
		@SuppressWarnings("unused")
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first subnet mask : ");
        String inputA = scanner.nextLine();
        
        System.out.print("Enter the second subnet mask : ");
        String inputB = scanner.nextLine();
        if ("q".equals(inputA)||"q".equals(inputB)) {
        	System.out.println("Exit!");
        }
    	D0_gen_IP_pro kkk = new D0_gen_IP_pro(inputA, inputB);

        scanner.close();
		
		
		
	}

}
