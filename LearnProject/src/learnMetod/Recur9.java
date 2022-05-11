package learnMetod;
import java.util.Scanner;

public class Recur9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers A, B, C, D:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.printf("NOD (A, B) = %s\n", nod(a, b));
        System.out.printf("NOD (A, C) = %s\n", nod(a, c));
        System.out.printf("NOD (A, D) = %s\n", nod(a, d));
    }

    private static int nod(int A, int B) {
        if (B == 0) {
            return A;
        } else {
            return nod(B, A % B);
        }
    }
}
