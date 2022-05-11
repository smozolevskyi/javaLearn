package learnMetod;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int param = sc.nextInt();
        System.out.println(Sign(param));
    }

    private static int Sign(int x){
        if (x < 0) {
            return -1;
        } else if (x > 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
