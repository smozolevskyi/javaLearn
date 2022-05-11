package learnMetod;
import java.util.Scanner;

public class Recur1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number N: ");
        int n = sc.nextInt();
        System.out.printf("Fact (N) = %s", Fact(n));
    }

    private static int Fact(int N) {
       if (N == 0) {
           return 0;
       } else if (N == 1) {
           return 1;
       } else {
           return N * Fact(N-1);
       }
    }
}
