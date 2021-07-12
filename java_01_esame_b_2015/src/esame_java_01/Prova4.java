package esame_java_01;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/***
l0m1s
lukes1582@gmail.com
14/04/2016
 */

public class Prova4 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		String str_input = "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Per piacere inserisci una stringa");
		
		str_input = input.next();
		
		prova4(str_input);
	}
	
	public static void prova4(String str) throws NoSuchAlgorithmException{
		String plainText = str;

		MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
		
		byte[] hash = messageDigest.digest( plainText.getBytes() );

		System.out.println("Result: " + new String(bytesToHex(hash)));
	}
	
	final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();
	
	public static String bytesToHex(byte[] bytes) {
	    char[] hexChars = new char[bytes.length * 2];
	    for ( int j = 0; j < bytes.length; j++ ) {
	        int v = bytes[j] & 0xFF;
	        hexChars[j * 2] = hexArray[v >>> 4];
	        hexChars[j * 2 + 1] = hexArray[v & 0x0F];
	    }
	    return new String(hexChars);
	}
	
	

}
