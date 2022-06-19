package org.way2it.oop.lesson1;

public class DemonstrateMain {

    public static void main(String[] args) {

        //Home task Rectangle
        Rectangle recDefault = new Rectangle();
        recDefault.DefRectangle();
        System.out.printf("Rectangle area - %s\n", recDefault.square());
        System.out.printf("The perimeter of the rectangle - %s\n", recDefault.Perimeter());

        recDefault.NewRectangle(20, 40);
        System.out.printf("Rectangle area - %s\n", recDefault.square());
        System.out.printf("The perimeter of the rectangle - %s\n", recDefault.Perimeter());

        //Home task Circle
        Circle circle = new Circle();
        circle.SetRadius(15.3);
        System.out.println("Long of circle = "+ circle.Long());

        circle.SetDiameter(34);
        System.out.println("Square of circle = "+ circle.Square());

    }
}
