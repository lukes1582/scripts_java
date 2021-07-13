import javax.swing.UIManager;


public class interfacciAmedeo {

	/**
	* l0m1s
	* lukes1582@gmail.com
	* 09/01/2016
	 */
	public static void main(String[] args) {
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch (Exception ex){
			System.out.println("Failed loading L&F: ");
			System.out.println(ex);
		}
		
		
		
		
		intAmedeo xxx = new intAmedeo();

	}

}
