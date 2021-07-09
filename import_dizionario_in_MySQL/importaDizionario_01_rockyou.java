import java.io.BufferedReader;
import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.security.*;

/***
l0m1s
lukes1582@gmail.com
 */

public class importaDizionario_01_rockyou {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/dizionari";

	static final String USER = "admin";
	static final String PASS = "1234";

	public static String MD5(String md5) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] array = md.digest(md5.getBytes());
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < array.length; ++i) {
				sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100)
						.substring(1, 3));
			}
			return sb.toString();
		} catch (java.security.NoSuchAlgorithmException e) {
		}
		return null;
	}

	public static String SHA1(String sha1) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			byte[] array = md.digest(sha1.getBytes());
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < array.length; ++i) {
				sb.append(Integer.toString((array[i] & 0xff) + 0x100, 16)
						.substring(1));
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException ex) {
		}
		return null;
	}

	public static String SHA256(String sha256) throws UnsupportedEncodingException {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
	//		System.out.println(md.getAlgorithm());
			md.update(sha256.getBytes());
			return byteToHex(md.digest());
		} catch (Exception ex) {
		}
		return "error";
	}
	
	private static String byteToHex(byte[] bytes){
		StringBuffer result = new StringBuffer();
		for(byte b :bytes) result.append(Integer.toString((b & 0xff)+ 0x100, 16).substring(1));
		return result.toString();
	}
	
	
	public static String SHA384(String sha384) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-384");
			//		System.out.println(md.getAlgorithm());
					md.update(sha384.getBytes());
					return byteToHex(md.digest());
		} catch (NoSuchAlgorithmException ex) {

		}
		return null;
	}
	

	public static String SHA512(String sha512) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			//		System.out.println(md.getAlgorithm());
					md.update(sha512.getBytes());
					return byteToHex(md.digest());
		} catch (NoSuchAlgorithmException ex) {

		}
		return null;
	}

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;

		try {
			// registrazione jdbc
			Class.forName("com.mysql.jdbc.Driver");

			// apro connessione
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// eseguo il pre query
			stmt = conn.createStatement();

			FileReader xFile = new FileReader("O:\\xxx\\rockyou.txt");

			BufferedReader bf = new BufferedReader(xFile);
			String s;
			while ((s = bf.readLine()) != null) {
				// Thread.sleep(1050); /**solo se ci sono problemi di rete perche' il DB non e' in locale */
				s.trim();
				String md5 = MD5(s);
				String sha1 = SHA1(s);
				String sha256 = SHA256(s);
				String sha384 = SHA384(s);
				String sha512 = SHA512(s);
				String sql = "INSERT INTO `dizionari`.`diz_01` (`id`, `dic_value`, `hash_md5`, `hash_sha1`, `hash_sha256`, `hash_sha384`, `hash_sha512`) VALUES (NULL,'"
						+ s
						+ "','"
						+ md5
						+ "','"
						+ sha1
						+ "','"
						+ sha256
						+ "','" 
						+ sha384
						+ "','" 
						+ sha512 + "');";
				stmt.executeUpdate(sql);
			}
			xFile.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}

			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}

		}
	}
}