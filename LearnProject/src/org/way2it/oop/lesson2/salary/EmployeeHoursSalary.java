package org.way2it.oop.lesson2.salary;

public class EmployeeHoursSalary implements Salary {
    public double hours = 164;
    public double prisePerHour = 5;

    @Override
    public double salary() {
        return hours * prisePerHour;
    }

}
