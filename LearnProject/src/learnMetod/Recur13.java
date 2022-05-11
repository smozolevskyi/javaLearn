package learnMetod;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;


public class Recur13 {

    public static void main(String[] args) {
        String st1 = new String("stfts");
        String st2 = "123321";
        String st3 = "hi my dear friend";
        String st4 = "gogogog";
        String st5 = "wwwqwqwwwwww";

        System.out.println(palindrom(st1));
        System.out.println(palindrom(st2));
        System.out.println(palindrom(st3));
        System.out.println(palindrom(st4));
        System.out.println(palindrom(st5));
    }

    private static Boolean palindrom(String newString) {
        byte[] massBytes = newString.getBytes(StandardCharsets.UTF_8);
        return checkBytes(0, massBytes.length-1, massBytes);
    }

    private static boolean  checkBytes( int first, int last, byte[] arr){
        if (arr.length == 0 | arr.length == 1) {
            return true;
        } else if(arr[first] != arr[last]) {
           return  false;
        } else {
            byte [] arrTest = Arrays.copyOfRange(arr, first + 1, last);
            return checkBytes(0, arrTest.length-1, arrTest);
        }
    }
}
