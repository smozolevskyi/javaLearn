package org.way2it.oop.lesson2.bouquet;

import java.util.ArrayList;

public class Bouquet {
    private ArrayList<Flower> bouquet;
    public void addFlower(Flower flower){
        if (bouquet == null) {
            bouquet = new ArrayList<Flower>();
        } else {
            bouquet.add(flower);
        }
    }

    public void getPrice(){
        double sum = 0;
        for (Flower element: bouquet) {
            System.out.printf("Bouquet have %s %s\n", element.colour, element.name);
            sum += element.price;
        }
        System.out.printf("Price of bouquet: %.2f", sum);
    }
}
