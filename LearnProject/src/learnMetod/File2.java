package learnMetod;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File2 {

    public static void main(String[] args) throws IOException {
        String name = "D://filesTest/file2";
        int n = 8;
        String data = "( ";

        for (int i = 1; i<=n; i++) {
            if (i % 2 == 0) {
                data = data + (String) (i + ", ");
            }
        }
        data += ")";

        FileOutputStream file1 = new FileOutputStream(name);
        DataOutputStream dos = new DataOutputStream(file1);
        dos.writeUTF(data);

        dos.close();
        file1.close();

    }
}
