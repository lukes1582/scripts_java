package pan;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class panMultiSc extends JPanel{
	/**
	* l0m1s
	* lukes1582@gmail.com
	* 09/01/2016
	 */
	private static final long serialVersionUID = 1L;
	private panScMod zCampi[] = new panScMod[6];
	
	public panMultiSc(){
		this.setLayout(new GridLayout(2, 6,10,10));
		zCampi[0]= new panScMod("  Valore di X :",8);
		
		zCampi[1]= new panScMod("  Valore di Y :",8);
		zCampi[2]= new panScMod("  Num. Elem. A :",8);
		zCampi[3]= new panScMod("  Valore di B :",8);
		zCampi[4]= new panScMod("  Valore di X0 :",8);
		zCampi[5]= new panScMod("  Media Dist. Exp :",8);
		for(int i=0;i<6;i++){
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
	public String getInfoCampo_4(){
		return (zCampi[4]).getInfo();
	} 
	public String getInfoCampo_5(){
		return (zCampi[5]).getInfo();
	} 
	public void reset(){
		for(int i=0;i<zCampi.length;i++){
			zCampi[i].reset();
		}
	}

	

}
