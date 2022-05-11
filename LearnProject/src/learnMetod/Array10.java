package learnMetod;
import java.util.Scanner;

public class Array10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int param = sc.nextInt();
            arr[i] = param;
        }
        for (int j : arr) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }

        for (int i = arr.length -1; i>=0; i--){
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
