import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import pan.panMultiSc;
import pan.panMultiScB;
import pan.panMultiScC;
import pan.panTitLet;
import pan.panPuls;


public class intAmedeo {
	
	/**
	* l0m1s
	* lukes1582@gmail.com
	* 09/01/2016
	 */
	
	public intAmedeo(){
		/**
		 *contenitore di tutto quanto 
		 */
		JFrame fram = new JFrame();
		JPanel pan = new JPanel();
		 
		  fram.setTitle("+++PROVA---Per Amedeo+++");
		  fram.setLocation(100, 100);
		 
		  fram.pack(); 
		  fram.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		  fram.getContentPane().setLayout(new BorderLayout());
		  
		  fram.setSize(800, 600);
		  
		  pan.setLayout(new GridLayout(8,1,10,10));

		  
		  
		  panTitLet zPan = new panTitLet("  SEQUENZA AL VARIARE DI : ","A");
		  panMultiSc zPanScA = new panMultiSc();
		  panTitLet zPan2 = new panTitLet("  SEQUENZA AL VARIARE DI : ","B");
		  panMultiScB zPanScB = new panMultiScB();			 
		  panTitLet zPan3 = new panTitLet("  SEQUENZE PSEUDOCASUALI : ","");
		  panMultiScC zPanScC = new panMultiScC();
		  panPuls zPanPuls = new panPuls();
		  
		  pan.add(zPan);
		  pan.add(zPanScA);
		  pan.add(zPan2);
		  pan.add(zPanScB);
		  pan.add(zPan3);
		  pan.add(zPanScC);
		  pan.add(zPanPuls);
		  
		  
		  fram.add(pan);
		  fram.setVisible(true);
		  }
		  
	

}

