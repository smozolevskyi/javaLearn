package org.way2it.oop.lesson2.salary;

public class Main {
    public static void main(String[] args) {

        EmployeeFixedSalary ivan = new EmployeeFixedSalary();
        ivan.salary = 3652.97;

        EmployeeHoursSalary oleh = new EmployeeHoursSalary();
        oleh.prisePerHour = 12;

        EmployeeHoursSalary jason = new EmployeeHoursSalary();
        jason.hours = 90;
        jason.prisePerHour = 8;

        System.out.printf("Ivan`s salary = %.2f\n", ivan.salary());
        System.out.printf("Oleh`s salary = %.2f\n", oleh.salary());
        System.out.printf("Jason`s salary = %.2f\n", jason.salary());

    }
}
