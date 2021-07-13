package pan;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class panMultiScC extends JPanel{
	/**
	* l0m1s
	* lukes1582@gmail.com
	* 09/01/2016
	 */
	private static final long serialVersionUID = 1L;
	private panScMod zCampi[] = new panScMod[6];
	
	public panMultiScC(){
		this.setLayout(new GridLayout(2, 5,10,10));
		zCampi[0]= new panScMod("  Valore di A :",8);
		zCampi[1]= new panScMod("  Valore di X0 :",8);
		zCampi[2]= new panScMod("  Valore di C :",8);
		zCampi[3]= new panScMod("  Valore di M :",8);
		zCampi[4]= new panScMod("  Output Sequenza :");
		zCampi[5]= new panScMod("  Media Dist. Exp :");
		
		for(int i=0;i<zCampi.length;i++){
			zCampi[i].setNoEdit();
			this.add(zCampi[i]);
		}
	}
	
	public String getInfoCampo_0(){
		return (zCampi[0]).getInfo();
	}
	public String getInfoCampo_1(){
		return (zCampi[1]).getInfo();
	} 
	public String getInfoCampo_2(){
		return (zCampi[2]).getInfo();
	} 
	public String getInfoCampo_3(){
		return (zCampi[3]).getInfo();
	}
	public void reset(){
		for(int i=0;i<zCampi.length;i++){
			zCampi[i].reset();
		}
	}

	

}
