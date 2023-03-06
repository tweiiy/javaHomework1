package org.example;

public class Main {
    public static void printThreeWords(String firstWord, String secondWord, String thirdWord){ // Первый пункт
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);
    }

    public static void checkSumSign(int firstInt, int secondInt){ // Второй пункт
        if(firstInt+secondInt>=0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    public static void printColor(int lightInt){ // Третий пункт
        if(lightInt<=0)
            System.out.println("Красный");
        else if(lightInt<=100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
    }

    public static void compareNumbers(int firstInt, int secondInt){ // Четвертый пункт
        if(firstInt>secondInt)
            System.out.println("Первое число больше второго");
        else if(firstInt<secondInt)
            System.out.println("Второе число больше первого");
        else
            System.out.println("Числа равны");
    }

    public static void main(String[] args) {
        System.out.println("Первый пункт:"); // Создать метод который при вызове печатает 3 слова в столбец
        printThreeWords("Orange", "Banana", "Apple");

        System.out.println("\nВторой пункт:"); // Создать метод, который суммирует 2 переменные. Если >=0 то выводится "сумма положительная" (отрицательная если <0)
        System.out.println("Первое число: 5, второе число: 10");
        checkSumSign(5, 10);
        System.out.println("Первое число: 5, второе число: -10");
        checkSumSign(5, -10);

        System.out.println("\nТретий пункт:");// Если переменная <=0, то в "красное", если от 0 до 100(включительно) "желтый", если больше 100 то "зеленый"
        System.out.println("Число: -3");
        printColor(-3);
        System.out.println("Число: 0");
        printColor(0);
        System.out.println("Число: 3");
        printColor(3);
        System.out.println("Число: 100");
        printColor(100);
        System.out.println("Число: 103");
        printColor(103);

        System.out.println("\nЧетвертый пункт:"); // Сравнение двух значений
        System.out.println("Первое число: 2, второе число: 1");
        compareNumbers(2, 1);
        System.out.println("Первое число: 4, второе число: 5");
        compareNumbers(4, 5);
        System.out.println("Первое число: 6, второе число: 6");
        compareNumbers(6, 6);
    }
}