package pan;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class panPuls extends JPanel {
	/**
	* l0m1s
	* lukes1582@gmail.com
	* 09/01/2016
	 */
	private JButton zBtn[] = new JButton[3];
	
	
	public panPuls(){
		this.setLayout(new FlowLayout());
		zBtn[0] = new JButton(" Sequenza di Interi");
		zBtn[1] = new JButton(" Sequenza di Reali");
		zBtn[2] = new JButton(" Sequenza Esponenziale");
		for(int i=0;i<zBtn.length;i++){
			this.add(zBtn[i]);
		}
	}
	


}
