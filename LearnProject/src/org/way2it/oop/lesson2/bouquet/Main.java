package org.way2it.oop.lesson2.bouquet;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Flower roseRed = new Flower();
        roseRed.name = "rose";
        roseRed.colour = "red";
        roseRed.price = 35.90;

        Flower roseWhite = new Flower();
        roseWhite.name = "rose";
        roseWhite.colour = "white";
        roseWhite.price = 27.75;

        Flower chrysanthemums = new Flower();
        chrysanthemums.name = "chrysanthemums";
        chrysanthemums.colour = "blue";
        chrysanthemums.price = 50;

        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(roseRed);
        bouquet.addFlower(roseRed);
        bouquet.addFlower(roseRed);
        bouquet.addFlower(chrysanthemums);
        bouquet.addFlower(roseWhite);
        bouquet.addFlower(roseWhite);
        bouquet.addFlower(roseWhite);

        bouquet.getPrice();
    }
}
