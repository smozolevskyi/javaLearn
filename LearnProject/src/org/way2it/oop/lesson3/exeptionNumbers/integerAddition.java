package org.way2it.oop.lesson3.exeptionNumbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class integerAddition {

    public static void main(String[] args) throws InputMismatchException{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x (integer): ");
        int x = 0;
        int y = 0;

        try {
            x = sc.nextInt();
        } catch (InputMismatchException inExp) {
            System.out.println("Error number is not Integer! x = 0;");
        }

        System.out.print("Enter y (integer): ");
        try {
            y = sc.nextInt();
        } catch (InputMismatchException inExp) {
            System.out.println("Error number is not Integer! y = 0;");
        }

        System.out.printf("Sum (x+y) = %s", x + y);

    }
}
