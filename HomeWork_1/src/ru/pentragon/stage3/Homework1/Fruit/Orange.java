package ru.pentragon.stage3.Homework1.Fruit;

public class Orange extends Fruit{

    private static final float ORANGE_WEIGHT = 1.5f;

    public float getWeight() {
        return ORANGE_WEIGHT;
    }

    @Override
    public String toString() {
        return "Orange";
    }
}
