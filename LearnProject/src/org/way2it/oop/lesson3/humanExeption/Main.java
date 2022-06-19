package org.way2it.oop.lesson3.humanExeption;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) throws UnderAgeExeption, IncorrectEmailException {
        Scanner sc = new Scanner(System.in);
        Human newHuman = new Human();

        System.out.print("Enter the name: ");
        newHuman.name = sc.next();

        System.out.print("Enter the age: ");
        newHuman.age = sc.nextInt();
        try {
            if (newHuman.age < 18) throw new UnderAgeExeption("Your`s age are under 18!");
        } catch (UnderAgeExeption ageExp) {
            System.out.println("Your`s age are under 18!");
        } finally {
            System.out.println("You can`t pass!");
        }

        System.out.print("Enter the email: ");
        newHuman.email = sc.next();
        try {
            if (!newHuman.email.contains("@")) throw new IncorrectEmailException("Incorrect email address!");
        } catch (IncorrectEmailException emailExp){
            System.out.println("Incorrect email address!");
        } finally {
            System.out.println("You can`t register!");
        }

    }
}
