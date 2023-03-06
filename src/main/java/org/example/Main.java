package org.example;

public class Main {
    public static void print(String firstWord, String secondWord, String thirdWord){
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.print(thirdWord);
    }

    public static void main(String[] args) {
        print("Привет", "мир", "!");
    }
}