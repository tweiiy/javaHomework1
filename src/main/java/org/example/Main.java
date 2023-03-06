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

    public static void main(String[] args) {
        System.out.println("Первый пункт:");
        print("Привет", "мир", "!");
        System.out.println("Второй пункт:");
        System.out.println("Первое число: 5, второе число: 10");
        positiveSum(5, 10);
        System.out.println("Первое число: 5, второе число: -10");
        positiveSum(5, -10);
    }
}