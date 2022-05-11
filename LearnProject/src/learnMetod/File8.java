package learnMetod;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File8 {

    public static void main(String[] args)throws IOException {
        FileInputStream file3 = new FileInputStream("D://filesTest/file3");
        FileOutputStream newFile = new FileOutputStream("D://filesTest/file_new");

        byte[] arrByte = file3.readAllBytes();
        newFile.write(arrByte[0]);
        newFile.write(arrByte[arrByte.length - 1]);

        file3.close();
        newFile.close();
    }
}
