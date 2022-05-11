package learnMetod;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class File3 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers A and D");
        int a = sc.nextInt();
        int d = sc.nextInt();

        FileOutputStream file3 = new FileOutputStream("D://filesTest/file3");
        file3.write(String.valueOf(a).getBytes(StandardCharsets.UTF_8));
        for (int i = 1; i<= 10; i++) {
            String result = ", " + a + (i * d);
            file3.write(result.getBytes(StandardCharsets.UTF_8));
        }

        file3.close();
    }
}
