package org.way2it.oop.lesson2.mycalculator.second;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        MyCalculator calc = new MyCalculator();
        calc.a = a;
        calc.b = b;

        System.out.printf("a + b = %.3f\n", calc.plus());
        System.out.printf("a - b = %.3f\n", calc.minus());
        System.out.printf("a * b = %.3f\n", calc.multiply());
        System.out.printf("a / b = %.3f\n", calc.divide());
    }
}
