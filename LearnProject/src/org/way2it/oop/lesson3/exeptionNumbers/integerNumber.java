package org.way2it.oop.lesson3.exeptionNumbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class integerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the (integer) number: ");
        try{
            int a = sc.nextInt();
        } catch (InputMismatchException inExp) {
            System.out.println("Error number is not Integer!");
        }

    }
}
