package org.example;

public class Main {
    public static void print(String firstWord, String secondWord, String thirdWord){ // Первый пункт
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);
    }

    public static void positiveSum(int firstInt, int secondInt){ // Второй пункт
        if(firstInt+secondInt>=0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    public static void trafficLight(int lightInt){ // Третий пункт
        if(lightInt<=0)
            System.out.println("Красный");
        else if(lightInt>0&&lightInt<=100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
    }

    public static void comparison(int firstInt, int secondInt){ // Четвертый пункт
        if(firstInt>secondInt)
            System.out.println("Первое число больше второго");
        else if(firstInt<secondInt)
            System.out.println("Второе число больше первого");
        else
            System.out.println("Числа равны");
    }

    public static void main(String[] args) {
        System.out.println("Первый пункт:"); // Создать метод который при вызове печатает 3 слова в столбец
        print("Привет", "мир", "!");

        System.out.println("\nВторой пункт:"); // Создать метод, который суммирует 2 переменные. Если >=0 то выводится "сумма положительная" (отрицательная если <0)
        System.out.println("Первое число: 5, второе число: 10");
        positiveSum(5, 10);
        System.out.println("Первое число: 5, второе число: -10");
        positiveSum(5, -10);

        System.out.println("\nТретий пункт:");// Если переменная <=0, то в "красное", если от 0 до 100(включительно) "желтый", если больше 100 то "зеленый"
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

        System.out.println("\nЧетвертый пункт:"); // Сравнение двух значений
        System.out.println("Первое число: 2, второе число: 1");
        comparison(2, 1);
        System.out.println("Первое число: 4, второе число: 5");
        comparison(4, 5);
        System.out.println("Первое число: 6, второе число: 6");
        comparison(6, 6);
    }
}