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

public class CalcolaPunto2Punto extends JFrame{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JPanel jpan1, jpan2, jpan3;
	//----------------------------------------------------------------------------
	protected JRadioButton jrpan1_A,jrpan1_B,jrpan1_A1,jrpan1_B1;
	protected JTextField jtpan1_A,jtpan1_B,jtpan1_C,jtpan1_A1,jtpan1_B1,jtpan1_C1; 
	//----------------------------------------------------------------------------
	protected JRadioButton jrpan2_A,jrpan2_B;
	protected JTextField jtpan2_A,jtpan2_B,jtpan2_C,jtpan2_A1,jtpan2_B1,jtpan2_C1;
	//----------------------------------------------------------------------------
	protected JButton jbt_1,jbt_2;
	protected JTextField direction,speed;
	protected JLabel lab1;
	protected JLabel lab2;


	public CalcolaPunto2Punto(){
		this.setBounds(800, 100, 350, 500);
		this.setTitle("--- Calcola Distanza tra Punto e Punto ---");
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
		jpan2.setBorder(BorderFactory.createTitledBorder("Directione and Speed"));
		//----------------------------------------------------------------
		JLabel l2 = new JLabel("Direction: ");
		jpan2.add(l2);
		direction = new JTextField(6);
		direction.setText("0000");
		jpan2.add(direction);
		//-----------------------------------------------------------------
		jrpan2_A = new JRadioButton("Km/h");
		jrpan2_B = new JRadioButton("Mn/h");
		JPanel p2s = new JPanel();
		p2s.setLayout(new GridLayout(1,2));
		p2s.add(jrpan2_A);
		p2s.add(jrpan2_B);
		jpan2.add(p2s);
		speed = new JTextField(6);
		speed.setText("0000");
		jpan2.add(speed);
		//---------------------------------------------------------------
		
		
		
		
		/**
		 * Terzo panello
		 * **/
		jpan3 = new JPanel();
		jpan3.setLayout(new GridLayout(2, 1));
		jpan3.setBorder(BorderFactory.createTitledBorder("Result"));
		//----------------------------------------------------------------
		JPanel jpan3r = new JPanel();
		jpan3r.setLayout(new GridLayout(2, 4));
		lab1 = new JLabel("");
		jpan3r.add(lab1);		
		//---------------------------------------------------------------
		jtpan2_A = new JTextField(2);
		jtpan2_A.setText("00");
		jtpan2_A.setEditable(false);
		jpan3r.add(jtpan2_A);
		jtpan2_B = new JTextField(2);
		jtpan2_B.setText("00");
		jtpan2_B.setEditable(false);
		jpan3r.add(jtpan2_B);
		jtpan2_C = new JTextField(6);
		jtpan2_C.setText("00");
		jtpan2_C.setEditable(false);
		jpan3r.add(jtpan2_C);
		//----------------------------------------------------------------
		lab2 = new JLabel("");
		jpan3r.add(lab2);		
		//---------------------------------------------------------------
		jtpan2_A1 = new JTextField(2);
		jtpan2_A1.setText("00");
		jtpan2_A1.setEditable(false);
		jpan3r.add(jtpan2_A1);
		jtpan2_B1 = new JTextField(2);
		jtpan2_B1.setText("00");
		jtpan2_B1.setEditable(false);
		jpan3r.add(jtpan2_B1);
		jtpan2_C1 = new JTextField(6);
		jtpan2_C1.setText("00");
		jtpan2_C1.setEditable(false);
		jpan3r.add(jtpan2_C1);
		jpan3.add(jpan3r);
		//----------------------------------------------------------------
		JPanel jpan3b = new JPanel();
		jpan3b.setLayout(new GridLayout(2, 1));
		jbt_1 = new JButton(" Reset ");
		jbt_1.addActionListener(new ResetActionListener());
		jpan3b.add(jbt_1);
		jbt_2 = new JButton(" Calculate ");
		jbt_2.addActionListener(new CalculateActionListener());
		jpan3b.add(jbt_2);
		jpan3.add(jpan3b);
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
			direction.setText("0000");
			speed.setText("0000");
			jrpan1_A.setSelected(false);
			jrpan1_B.setSelected(false);
			jrpan1_A1.setSelected(false);
			jrpan1_B1.setSelected(false);
			jrpan2_A.setSelected(false);
			jrpan2_B.setSelected(false);
			//-------------------------------------------------
			jtpan2_A.setText("00");
			jtpan2_B.setText("00");
			jtpan2_C.setText("00");
			jtpan2_A1.setText("00");
			jtpan2_B1.setText("00");
			jtpan2_C1.setText("00");
			
			
			
		}
	}
	
	class CalculateActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String str1,str2,str3;
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
			
			System.out.println("la direzione inserita e' "+direction.getText());
						
			if(jrpan2_A.isSelected()){
				str3 = "KM/H";
			}else{
				str3 = "MN/H";
			}
						
			System.out.println("la velocita' inserita e' "+speed.getText()+" in "+str3);
			
			double x = Math.random();
			
			//--------------- imposto la direzione
			if(x>0.5){
				lab1.setText("North");
			} else {
				lab1.setText("South");
			}
			//-------------- imposto la direzione
			if(x>0.5){
				lab2.setText("West");
			} else {
				lab2.setText("East");
			}
			
			int a = Integer.parseInt(jtpan1_A.getText());
			int b = Integer.parseInt(jtpan1_B.getText());
			double c = Double.parseDouble(jtpan1_C.getText());
			
			int a1 = Integer.parseInt(jtpan1_A1.getText());
			int b1 = Integer.parseInt(jtpan1_B1.getText());
			double c1 = Double.parseDouble(jtpan1_C1.getText());
			
			int y = (int)((Math.random()*154654)%60);
					
			jtpan2_A1.setText(String.valueOf(((a1+y)%60)));
			jtpan2_B1.setText(String.valueOf(((b1+y)%60)));
			jtpan2_C1.setText(String.valueOf(((c1+y)%60)));
			
			
			jtpan2_A.setText(String.valueOf(((a+y)%60)));
			jtpan2_B.setText(String.valueOf(((b+y)%60)));
			jtpan2_C.setText(String.valueOf(((c+y)%60)));


			System.out.println("il risultato � ");
		//	System.out.println("il valore della longitudine  e' in gradi: "+l1.getText()+"  "+jtpan2_A1.getText()+" minuti "+jtpan2_B1.getText()+" e secondi "+jtpan2_C1.getText());
		//	System.out.println("il valore della latitudine  e' in gradi:  "+l2.getText()+"  "+jtpan2_A.getText()+" minuti "+jtpan2_B.getText()+" e secondi "+jtpan2_C.getText());
			
			
			System.out.println("dobbiamo trovare una soluzione per calcolare il secondo punto");
		}
	}



}
