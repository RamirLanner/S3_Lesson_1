package ru.pentragon.stage3.Homework1;

import ru.pentragon.stage3.Homework1.Fruit.Fruit;
import ru.pentragon.stage3.Homework1.Fruit.Orange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public void addFruit(T fruit) {
        this.fruits.add(fruit);
    }

    public float getWeight() {
        float weight = 0;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compareBox(Box box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.1;
    }

    public <V extends T> void putFromAnotherBox(Box<V> box){
        ArrayList<V> fromBox = box.getFruits();
        for (V fruit : fromBox) {
            this.addFruit(fruit);
        }
        box.getFruits().clear();
    }
}
