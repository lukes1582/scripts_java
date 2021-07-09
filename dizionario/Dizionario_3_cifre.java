import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
l0m1s
lukes1582@gmail.com
 */

public class Dizionario_3_cifre {
    public static void main(String[] args) throws IOException {
	
        String[] numeri = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
        String[] minuscoli = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "l", "m", "n", "o", "p", "q", "r", "s", "t","u", "v", "z", "x", "y", "w", "k", "j" };
        String[] maiuscoli = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "L", "M", "N", "O", "P", "Q", "R", "S", "T","U", "V", "Z", "X", "Y", "W", "K", "J" };

        List all = new ArrayList(Arrays.asList(numeri)); 
        all.addAll(Arrays.asList(minuscoli));
        all.addAll(Arrays.asList(maiuscoli));     
        Object[] total = all.toArray(); 
        
        FileWriter fw = new FileWriter("O:\\xxx\\javaDizionario-a-3-cifre.txt", true);
        String str = "";
        
        for(int a1 = 0; a1<total.length;a1++){
            for(int a2 = 0; a2<total.length;a2++){
                for(int a3 = 0; a3<total.length;a3++){
                    str += total[a1]+""+total[a2]+""+total[a3];
                    System.out.println(str);
                    fw.write(str+"\n");
                    str="";
                }
            }
        }

        fw.close();
        


	}
}