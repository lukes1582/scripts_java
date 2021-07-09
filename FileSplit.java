package codice;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/***
l0m1s
lukes1582@gmail.com
 */


class FileSplit {
    public static void splitFile(File f) throws IOException {
        @SuppressWarnings("resource")
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
        FileOutputStream out;
        String str = f.getName();
        String name = str.substring(0, str.length()-4);        
        String ext = str.substring(str.length()-4, str.length());
        int partCounter = 1;
        int sizeOfFiles = 1024*262144;
        //1024 * 1024; 1MB
        // 1024*2060924 = 2GB
        // 1024*1030462 = 1GB
        // 1024*524288 = 500MB
        
        
        byte[] buffer = new byte[sizeOfFiles];
        int tmp = 140;
        while ((tmp = bis.read(buffer)) > 0) {
            File newFile=new File(f.getParent()+"\\"+name+"_"+String.format("%,d", partCounter++)+ext);
            newFile.createNewFile();
            out = new FileOutputStream(newFile);
            out.write(buffer,0,tmp);
            out.close();
        }
    }

    public static void main(String[] args) throws IOException {
        splitFile(new File("O:\\xxx\\file.264"));
    }
}