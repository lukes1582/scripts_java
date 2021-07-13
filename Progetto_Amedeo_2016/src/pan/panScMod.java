package pan;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class panScMod extends JPanel {
	/**
	* l0m1s
	* lukes1582@gmail.com
	* 09/01/2016
	 */	
	private JTextField zTex;
	private JLabel zLab;
	private JPanel zPan;
	private JComboBox arr_cmb;
	final String[] arrStr = {" ","Modifica","Conferma"};

	public panScMod(){
		this.setLayout(new GridLayout(1,2,10,10));
		this.add(zLab=new JLabel(""));
		zTex = new JTextField(20);
		zPan = new JPanel();
		zPan.setLayout(new BorderLayout());
		arr_cmb = new JComboBox(arrStr);
		arr_cmb.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				String cbItem = (String)cb.getSelectedItem();
				if(cbItem.equals("Modifica")){
					zTex.setEditable(true);
					zTex.setBackground(new Color(129,212,243));
				}else{
					if(cbItem.equals("Conferma")){
						zTex.setEditable(false);
						zTex.setBackground(new Color(238, 238, 238));
					}
				}
			}
		});
		zPan.add(zTex, BorderLayout.CENTER);
		zPan.add(arr_cmb, BorderLayout.EAST);
		this.add(zPan);
	}
	public panScMod(String str){
		this.setLayout(new GridLayout(1,2,10,10));
		zLab = new JLabel(str);
		this.add(zLab);
		zTex = new JTextField(20); 
		zPan = new JPanel();
		zPan.setLayout(new BorderLayout());
		arr_cmb = new JComboBox(arrStr);
		arr_cmb.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				String cbItem = (String)cb.getSelectedItem();
				if(cbItem.equals("Modifica")){
					zTex.setEditable(true);
					zTex.setBackground(new Color(129,212,243));
				}else{
					if(cbItem.equals("Conferma")){
						zTex.setEditable(false);
						zTex.setBackground(new Color(238, 238, 238));
					}
				}
			}
		});
		zPan.add(zTex, BorderLayout.CENTER);
		zPan.add(arr_cmb, BorderLayout.EAST);
		this.add(zPan);
	}
	public panScMod(String str, int ch){
		this.setLayout(new GridLayout(1,2,10,10));
		zLab = new JLabel(str);
		this.add(zLab);
		zTex = new JTextField(ch); 
		zPan = new JPanel();
		zPan.setLayout(new BorderLayout());
		arr_cmb = new JComboBox(arrStr);
		arr_cmb.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				String cbItem = (String)cb.getSelectedItem();
				if(cbItem.equals("Modifica")){
					zTex.setEditable(true);
					zTex.setBackground(new Color(129,212,243));
				}else{
					if(cbItem.equals("Conferma")){
						zTex.setEditable(false);
						zTex.setBackground(new Color(238, 238, 238));
					}
				}
			}
		});
		zPan.add(zTex, BorderLayout.CENTER);
		zPan.add(arr_cmb, BorderLayout.EAST);
		this.add(zPan);
	}
	
	public void setEdit(){
		zTex.setEditable(true);
	}
	public void setNoEdit(){
		zTex.setEditable(false);
		zTex.setBackground(new Color(238, 238, 238));
	}
	public void setColor(){
		zTex.setBackground(new Color(255, 255, 0));
	}
	public void setColor(int r, int g, int b){
		zTex.setBackground(new Color(r, g, b));
	}
	public void setNoColor(){
		zTex.setBackground(new Color(255, 255, 255));
	}
	public void reset(){
		zTex.setText("");
	}
	public String getInfo(){
		return zTex.getText();
	}



}
