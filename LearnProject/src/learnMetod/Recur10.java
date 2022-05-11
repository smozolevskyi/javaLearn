package learnMetod;

import java.util.Scanner;

public class Recur10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        System.out.println(digitSum(sc.nextInt()));
        System.out.println(digitSum(sc.nextInt()));
        System.out.println(digitSum(sc.nextInt()));
        System.out.println(digitSum(sc.nextInt()));
        System.out.println(digitSum(sc.nextInt()));
    }

    private static int digitSum(int K) {
        if (K == 1){
            return 1;
        } else {
            return K + digitSum(K - 1);
        }
    }
}
