import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.*;

/***
l0m1s
lukes1582@gmail.com
 */

public class importaDizionario3Caratteri {
	
	public static String MD5(String md5) {
		   try {
		        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
		        byte[] array = md.digest(md5.getBytes());
		        StringBuffer sb = new StringBuffer();
		        for (int i = 0; i < array.length; ++i) {
		          sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
		       }
		        return sb.toString();
		    } catch (java.security.NoSuchAlgorithmException e) {
		    }
		return null;
	}
	
	public static void main(String[] args){
		
		try{
			FileReader xFile = new FileReader("O:\\xxx\\javaDizionario-a-3-cifre.txt");
	
			BufferedReader bf = new BufferedReader(xFile);
			String s;
			FileWriter yFile = new FileWriter("O:\\xxx\\javaDizionario-a-3-cifre.sql");
					
			while((s=bf.readLine())!=null){
				s.trim();
				String hash = MD5(s);
				String sql = "INSERT INTO `dizionari`.`diz_03_car` (`id`, `dic_value`, `hash_value`) VALUES (NULL,'"+s+"','"+hash+"' );";
				yFile.write(sql);
				yFile.write("\n");				
			}
			yFile.close();
			xFile.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}		
	}
}