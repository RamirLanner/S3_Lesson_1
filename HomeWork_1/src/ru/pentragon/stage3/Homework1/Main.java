package ru.pentragon.stage3.Homework1;

import ru.pentragon.stage3.Homework1.Fruit.Apple;
import ru.pentragon.stage3.Homework1.Fruit.Orange;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(twoElementsReplace(arr, 0, 4));
        System.out.println(Arrays.toString(arr));
        System.out.println("Задача 2");
        String[] arrStr = {"str1", "str2", "str3"};
        System.out.println(arrayToArrayList(arrStr).toString());

        System.out.println("Задача 3");

        Box<Apple> appleBoxOne = new Box<>();
        Box<Apple> appleBoxTwo = new Box<>();
        Box<Orange> orangeBoxOne = new Box<>();
        for (int i = 0; i < 10; i++) {
            appleBoxOne.addFruit(new Apple());
            appleBoxTwo.addFruit(new Apple());
            orangeBoxOne.addFruit(new Orange());
        }

        Apple apple = new Apple();
        Orange orange = new Orange();
        //orangeBoxOne.addFruit(apple); //компилятор указывает на ошибку, значит все сделано правильно. Фрукты смешивать нельзя.
        orangeBoxOne.addFruit(orange);
        outToConsole(appleBoxOne,appleBoxTwo,orangeBoxOne);
        System.out.println();
        System.out.println("Вес коробок 1 и 2 с яблоками равны? = " + appleBoxOne.compareBox(appleBoxTwo));
        System.out.println("Вес коробок 1 с яблоками и коробки 1 с апельсинами равны? = " + appleBoxOne.compareBox(orangeBoxOne));
        System.out.println();
        //appleBoxTwo.putFromAnotherBox(orangeBoxOne);//компилятор указывает на ошибку, значит все сделано правильно. Фрукты смешивать нельзя.
        appleBoxTwo.putFromAnotherBox(appleBoxOne);
        System.out.println("Пересыпаем из одной коробки в другую");
        outToConsole(appleBoxOne,appleBoxTwo,orangeBoxOne);

    }

    private static void outToConsole(Box... boxes) {
        for (Box box : boxes) {
            System.out.println(box.getFruits().toString() + " = " + box.getFruits().size());
        }
    }

    //меняем 2 элемента массива местами
    private static <T> boolean twoElementsReplace(T[] array, int el1, int el2) {
        if ((array.length > el1) && (array.length > el2) && (el1 >= 0) && (el2 >= 0)) {
            T obj = array[el1];
            array[el1] = array[el2];
            array[el2] = obj;
            return true;
        }
        return false;
    }

    //массив в ArrayList
    private static <T> ArrayList<T> arrayToArrayList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
}
