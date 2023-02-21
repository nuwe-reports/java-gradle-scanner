package com.nuwe;

public class App {

    public static void main(String[] args) {
        int a = sum2(1, 2);
        int b = sum2(3, 4);
        int c = sum2(5, 6);
        System.out.println(a + b + c);
    }

    public static int sum2(int a, int b) {
        return a + b;
    }
}