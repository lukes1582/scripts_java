import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;

/***
 * l0m1s
 * lukes1582@gmail.com
 * 
 */

public class importaDizionario13Pin_5cf {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/dizionari";
	
	static final String USER = "admin";
	static final String PASS = "1234";
	
	
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
		
		Connection conn = null;
		Statement stmt = null;
		
		try{
			// registrazione jdbc
			Class.forName("com.mysql.jdbc.Driver");
			
			// apro connessione
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			// eseguo il pre query
			stmt = conn.createStatement();
			
			FileReader xFile = new FileReader("O:\\xxx\\pin_5_cif.lst");
	
			BufferedReader bf = new BufferedReader(xFile);
			String s;
			while((s=bf.readLine())!=null){
				//Thread.sleep(1050);
				s.trim();
				String hash = MD5(s);
				String sql = "INSERT INTO `dizionari`.`diz_13Pin_5cf` (`id`, `dic_value`, `hash_value`) VALUES (NULL,'"+s+"','"+hash+"' );";
				stmt.executeUpdate(sql);
			}
			xFile.close();
		}
		catch (SQLException se){
			se.printStackTrace();
		}
		catch (Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(stmt!=null)
					conn.close();
			}catch (SQLException se){
					se.printStackTrace();
			}
			
			try{
				if(conn!=null)
					conn.close();
			}catch (SQLException se){
					se.printStackTrace();
			}
			
		}		
	}
}