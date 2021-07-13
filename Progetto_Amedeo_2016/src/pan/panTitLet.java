package pan;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class panTitLet extends JPanel {
	/**
	* l0m1s
	* lukes1582@gmail.com
	* 09/01/2016
	 */
	private JLabel zLabTit_1, zLabTit_2, zTit1, zTit2;
		
	public panTitLet(){
		this.setLayout(new GridLayout(1, 4));
		zLabTit_1 = new JLabel("");
		zTit1 = new JLabel("");
		zLabTit_2 = new JLabel("");
		zTit2 = new JLabel("");
		this.add(zLabTit_1);
		this.add(zTit1);
		this.add(zLabTit_2);
		this.add(zTit2);
	}
	public panTitLet(String tit1, String valStr){
		this.setLayout(new GridLayout(1, 4));
		zLabTit_1 = new JLabel(tit1);
		zTit1 = new JLabel(valStr);
		zLabTit_2 = new JLabel("");
		zTit2 = new JLabel("");
		this.add(zLabTit_1);
		this.add(zTit1);
		this.add(zLabTit_2);
		this.add(zTit2);
	}
	
	
	public panTitLet(String tit1, String valStr,String tit2, String valStr2){
		this.setLayout(new GridLayout(1, 4));
		zLabTit_1 = new JLabel(tit1);
		zTit1 = new JLabel(valStr);
		zLabTit_2 = new JLabel(tit2);
		zTit2 = new JLabel(valStr2);
		this.add(zLabTit_1);
		this.add(zTit1);
		this.add(zLabTit_2);
		this.add(zTit2);
	}
	


	public void setTit1(String str1){
		zTit1.setText(str1);
	}
	public String getTit1(){
		return zTit1.getText(); 
	}
	
	public void setTit2(String str1){
		zTit1.setText(str1);
	}
	public String getTit2(){
		return zTit1.getText(); 
	}
	
	
}
