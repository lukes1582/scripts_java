import java.util.ArrayList;
import java.util.*;

public class CalcTimesOut {
	/***
	 * l0m1s
	 * 
	 * lukes1582@gmail.com
	 */
	
	static long NUM = 33554431;
	int x = 0;
	Random ran = new Random();
	ArrayList<Integer> listTimeOuts = new ArrayList <Integer>();
	
	public CalcTimesOut(){
		for(int i = 0 ; i<8000; i++){
			x = (int)((((ran.nextInt()+10000)*NUM)%9999));
			if(x>1){
				listTimeOuts.add(x);
			}else{
				listTimeOuts.add(x*(-1));
			}
		}
			
	}
	
	public CalcTimesOut(int number){
		for(int i = 0 ; i<number; i++){
			x = (int)((((ran.nextInt()+10000)*NUM)%9999));
			if(x>1){
				listTimeOuts.add(x);
			}else{
				listTimeOuts.add(x*(-1));
			}
		}
	}
	
	public void printTimesOut() {
		for (int i = 0 ; i<listTimeOuts.size();i++){
			System.out.println(listTimeOuts.get(i));
		}
	}

	public ArrayList<Integer> getTimesOut(){
		return listTimeOuts;
	}
	
}
