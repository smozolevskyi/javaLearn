package learnMetod;
import java.util.Scanner;

public class Proc22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number A: ");
        int a = sc.nextInt();
        System.out.print("Enter the number B: ");
        int b = sc.nextInt();
        System.out.print("Enter number operation (1 -; 2 *; 3 /; other +): ");
        int op = sc.nextInt();
        System.out.printf("Result = %s", Calc(a, b, op));
    }

    public static double Calc(int A, int B, int Op){
        if (Op == 1) {
            return A - B;
        } else if(Op == 2) {
            return A * B;
        } else if(Op == 3) {
            return A / B;
        } else {
            return A + B;
        }
    }
}
