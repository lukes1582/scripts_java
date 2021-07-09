import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.*;

/***
l0m1s
lukes1582@gmail.com
 */

public class Generatore_password{
    public static void main(String[] args) throws IOException {
        int NUM_PASS = 40;
        int NUM_CHAR_PASS = 16;
	
        String[] numeri = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
        String[] minuscoli = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "l", "m", "n", "o", "p", "q", "r", "s", "t","u", "v", "z", "x", "y", "w", "k", "j" };
        String[] maiuscoli = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "L", "M", "N", "O", "P", "Q", "R", "S", "T","U", "V", "Z", "X", "Y", "W", "K", "J" };
        String[] car_spec = {"!","£","$","%","&","(",")","=","?","*","-","_","+",".",":"};

        List all = new ArrayList(Arrays.asList(numeri)); 
        all.addAll(Arrays.asList(minuscoli));
        all.addAll(Arrays.asList(maiuscoli));
        all.addAll(Arrays.asList(car_spec));     
        Object[] total = all.toArray(); 
        
        FileWriter fw = new FileWriter("O:\\xxx\\generatore_password.txt", true);
        String str = "";
        
        for(int a1 = 0; a1<NUM_PASS;a1++){
            for(int a2 = 0; a2<NUM_CHAR_PASS;a2++){
                int rand = (int)(Math.random() * 501);
                int valX = (rand%total.length);
                str += total[valX];
            }
            fw.write(str+"\n");
            str="";
        }

        fw.close();
        


	}
}