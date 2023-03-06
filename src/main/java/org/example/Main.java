package org.example;

public class Main {
    public static void print(String firstWord, String secondWord, String thirdWord){
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);
    }

    public static void positiveSum(int firstInt, int secondInt){
        if(firstInt+secondInt>=0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    public static void trafficLight(int a){
        int lightInt = a;
        if(lightInt<=0)
            System.out.println("Красный");
        else if(lightInt>0&&lightInt<=100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
    }

    public static void main(String[] args) {
        System.out.println("Первый пункт:");
        print("Привет", "мир", "!");

        System.out.println("\nВторой пункт:");
        System.out.println("Первое число: 5, второе число: 10");
        positiveSum(5, 10);
        System.out.println("Первое число: 5, второе число: -10");
        positiveSum(5, -10);

        System.out.println("\nТретий пункт:");
        System.out.println("Число: -3");
        trafficLight(-3);
        System.out.println("Число: 0");
        trafficLight(0);
        System.out.println("Число: 3");
        trafficLight(3);
        System.out.println("Число: 100");
        trafficLight(100);
        System.out.println("Число: 103");
        trafficLight(103);

    }
}