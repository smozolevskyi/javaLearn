package org.way2it.oop.lesson3.exeptionNumbers;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MyExeption, IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        Methods calc = new Methods();

        System.out.print("Enter the number a: ");
        calc.a = sc.nextInt();

        System.out.print("Enter the number b: ");
        calc.b = sc.nextInt();

        System.out.printf("a + b = %s\n", calc.addition());
        System.out.printf("a - b = %s\n", calc.subtraction());
        System.out.printf("a * b = %s\n", calc.multiplication());
        System.out.printf("a / b = %s\n", calc.division());
    }

}
