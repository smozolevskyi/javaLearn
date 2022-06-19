package org.way2it.oop.lesson3.exeptionNumbers;

public class Methods {
    public int a;
    public int b;

    public int addition() throws MyExeption, IllegalAccessException {
        setExeption();
        return a + b;
    }

    public int subtraction() throws MyExeption, IllegalAccessException {
        setExeption();
        return a - b;
    }

    public int multiplication() throws MyExeption, IllegalAccessException {
        setExeption();
        return a * b;
    }

    public int division() throws MyExeption, IllegalAccessException {
        setExeption();
        return a / b;
    }

    private void setExeption() throws IllegalAccessException, MyExeption {
        if (a < 0 & b > 0) throw new IllegalArgumentException();
        if ((a == 0 & b != 0) || (a != 0 & b == 0)) throw new ArithmeticException();
        if (a == 0 & b == 0) throw new IllegalAccessException();
        if (a > 0 & b > 0) throw new MyExeption("There is my exeption!");
    }
}
