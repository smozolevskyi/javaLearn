package learnMetod;
import java.util.Scanner;

public class Proc18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            double radius = sc.nextDouble();
            System.out.printf("Radius %s : %s\n", i, CircleS(radius));
        }
    }

    private static double  CircleS(double r) {
        return Math.PI * r *r;
    }
}
