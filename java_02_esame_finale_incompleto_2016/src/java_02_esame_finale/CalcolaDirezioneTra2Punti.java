package java_02_esame_finale;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/***
l0m1s
lukes1582@gmail.com
17/05/2016
 */

public class CalcolaDirezioneTra2Punti extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JPanel jpan1, jpan2, jpan3;
	//----------------------------------------------------------------------------
	protected JRadioButton jrpan1_A,jrpan1_B,jrpan1_A1,jrpan1_B1;
	protected JTextField jtpan1_A,jtpan1_B,jtpan1_C,jtpan1_A1,jtpan1_B1,jtpan1_C1; 
	//----------------------------------------------------------------------------
	protected JRadioButton jrpan2_A,jrpan2_B,jrpan2_A1,jrpan2_B1;
	protected JTextField jtpan2_A,jtpan2_B,jtpan2_C,jtpan2_A1,jtpan2_B1,jtpan2_C1;
	//----------------------------------------------------------------------------
	protected JButton jbt_1,jbt_2;
	protected JTextField result;


	public CalcolaDirezioneTra2Punti(){
		this.setBounds(450, 100, 350, 500);
		this.setTitle("--- Calcola Direzione Tra Due Punti ---");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().setLayout(new GridLayout(3,1));
		/**
		 * Primo panello
		 * **/
		jpan1 = new JPanel();
		jpan1.setLayout(new GridLayout(2, 4));
		jpan1.setBorder(BorderFactory.createTitledBorder("First Point"));
		//----------------------------------------------------------------
		jrpan1_A = new JRadioButton("N");
		jrpan1_B = new JRadioButton("S");
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1,2));
		p1.add(jrpan1_A);
		p1.add(jrpan1_B);
		jpan1.add(p1);
		//---------------------------------------------------------------
		jtpan1_A = new JTextField(2);
		jtpan1_A.setText("00");
		jpan1.add(jtpan1_A);
		jtpan1_B = new JTextField(2);
		jtpan1_B.setText("00");
		jpan1.add(jtpan1_B);
		jtpan1_C = new JTextField(6);
		jtpan1_C.setText("00");
		jpan1.add(jtpan1_C);
		//----------------------------------------------------------------
		jrpan1_A1 = new JRadioButton("W");
		jrpan1_B1 = new JRadioButton("E");
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1,2));
		p2.add(jrpan1_A1);
		p2.add(jrpan1_B1);
		jpan1.add(p2);
		//---------------------------------------------------------------
		jtpan1_A1 = new JTextField(2);
		jtpan1_A1.setText("00");
		jpan1.add(jtpan1_A1);
		jtpan1_B1 = new JTextField(2);
		jtpan1_B1.setText("00");
		jpan1.add(jtpan1_B1);
		jtpan1_C1 = new JTextField(6);
		jtpan1_C1.setText("00");
		jpan1.add(jtpan1_C1);
		/**
		 * Secondo panello
		 * **/
		jpan2 = new JPanel();
		jpan2.setLayout(new GridLayout(2, 4));
		jpan2.setBorder(BorderFactory.createTitledBorder("Second Point"));
		//----------------------------------------------------------------
		jrpan2_A = new JRadioButton("N");
		
		jrpan2_B = new JRadioButton("S");
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(1,2));
		p3.add(jrpan2_A);
		p3.add(jrpan2_B);
		jpan2.add(p3);
		//---------------------------------------------------------------
		jtpan2_A = new JTextField(2);
		jtpan2_A.setText("00");
		jpan2.add(jtpan2_A);
		jtpan2_B = new JTextField(2);
		jtpan2_B.setText("00");
		jpan2.add(jtpan2_B);
		jtpan2_C = new JTextField(6);
		jtpan2_C.setText("00");
		jpan2.add(jtpan2_C);
		//----------------------------------------------------------------
		jrpan2_A1 = new JRadioButton("W");
		jrpan2_B1 = new JRadioButton("E");
		JPanel p4 = new JPanel();
		p4.setLayout(new GridLayout(1,2));
		p4.add(jrpan2_A1);
		p4.add(jrpan2_B1);
		jpan2.add(p4);
		//---------------------------------------------------------------
		jtpan2_A1 = new JTextField(2);
		jtpan2_A1.setText("00");
		jpan2.add(jtpan2_A1);
		jtpan2_B1 = new JTextField(2);
		jtpan2_B1.setText("00");
		jpan2.add(jtpan2_B1);
		jtpan2_C1 = new JTextField(6);
		jtpan2_C1.setText("00");
		jpan2.add(jtpan2_C1);
		/**
		 * Terzo panello
		 * **/
		jpan3 = new JPanel();
		jpan3.setLayout(new GridLayout(2, 2));
		jpan3.setBorder(BorderFactory.createTitledBorder("Result"));
		//----------------------------------------------------------------
		JLabel l3 = new JLabel("Direction is: ");
		jpan3.add(l3);
		result = new JTextField(6);
		result.setText("0000");
		jpan3.add(result);
		//----------------------------------------------------------------
		jbt_1 = new JButton(" Reset ");
		jbt_1.addActionListener(new ResetActionListener());
		jpan3.add(jbt_1);
		jbt_2 = new JButton(" Calculate ");
		jbt_2.addActionListener(new CalculateActionListener());
		jpan3.add(jbt_2);
		/**
		 * gestione panelli
		 * **/

		this.add(jpan1);
		this.add(jpan2);
		this.add(jpan3);
		this.setVisible(true);
	}

	class ResetActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			jtpan1_A.setText("00");
			jtpan1_B.setText("00");
			jtpan1_C.setText("00");
			jtpan1_A1.setText("00");
			jtpan1_B1.setText("00");
			jtpan1_C1.setText("00");
			jtpan2_A.setText("00");
			jtpan2_B.setText("00");
			jtpan2_C.setText("00");
			jtpan2_A1.setText("00");
			jtpan2_B1.setText("00");
			jtpan2_C1.setText("00");
			result.setText("0000");
			jrpan1_A.setSelected(false);
			jrpan1_B.setSelected(false);
			jrpan1_A1.setSelected(false);
			jrpan1_B1.setSelected(false);
			jrpan2_A.setSelected(false);
			jrpan2_B.setSelected(false);
			jrpan2_A1.setSelected(false);
			jrpan2_B1.setSelected(false);
		}
	}
	
	class CalculateActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String str1,str2,str3,str4;
			
			if(jrpan1_A.isSelected()){
				str1 = "N";
			}else{
				str1 = "S";
			}
			if(jrpan1_A1.isSelected()){
				str2 = "W";
			}else{
				str2 = "E";
			}
						
			System.out.println("primo punto");
			System.out.println("il valore della longitudine  e' in gradi: "+str1+"  "+jtpan1_A1.getText()+" minuti "+jtpan1_B1.getText()+" e secondi "+jtpan1_C1.getText());
			System.out.println("il valore della latitudine  e' in gradi:  "+str2+"  "+jtpan1_A.getText()+" minuti "+jtpan1_B.getText()+" e secondi "+jtpan1_C.getText());
			
			if(jrpan2_A.isSelected()){
				str3 = "N";
			}else{
				str3 = "S";
			}
			if(jrpan2_A1.isSelected()){
				str4 = "W";
			}else{
				str4 = "E";
			}
			
			System.out.println("secondo punto");
			System.out.println("il valore della longitudine  e' in gradi: "+str3+"  "+jtpan2_A1.getText()+" minuti "+jtpan2_B1.getText()+" e secondi "+jtpan2_C1.getText());
			System.out.println("il valore della latitudine  e' in gradi:  "+str4+"  "+jtpan2_A.getText()+" minuti "+jtpan2_B.getText()+" e secondi "+jtpan2_C.getText());
			
			
			System.out.println("dobbiamo trovare una soluzione per calcolare la distanza");
		}
	}




}
