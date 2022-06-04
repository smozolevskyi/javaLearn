package org.way2it.oop.lesson2.salary;

public class EmployeeFixedSalary  implements Salary {
    public double salary;

    @Override
    public double salary() {
        return salary;
    }
}
