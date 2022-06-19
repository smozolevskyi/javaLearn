package org.way2it.oop.lesson1;

public class Rectangle {
    private int width;
    private int height;

    public void DefRectangle() {
        width = 5;
        height = 10;
    }

    public void NewRectangle(int a, int b) {
        width = a;
        height = b;
    }

    public int Perimeter() {
        return (2 * width) + (2 * height);
    }
    public int square(){
        return width * height;
    }
}
