package org.way2it.oop.lesson2.mycalculator.second;

import org.way2it.oop.lesson2.mycalculator.first.Numerable;

public class MyCalculator implements Numerable {
    public double a;
    public double b;
    @Override
    public double plus() {
        return a + b;
    }

    @Override
    public double minus() {
        return a - b;
    }

    @Override
    public double multiply() {
        return a * b;
    }

    @Override
    public double divide() {
        return a / b;
    }
}
