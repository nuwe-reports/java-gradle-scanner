package com.nuwe;

public class App {

    public static void main(String[] args) {
        int a = sum2(1, 2);
        int b = sum2(3, 4);
        int c = sum2(5, 6);
        System.out.println(a + b + c);

        int d = sum2(7, 8);
        int e = sum2(9, 10);
        int f = sum2(11, 12);
        System.out.println(d + e + f);

        int g = sum2(13, 14);
        int h = sum2(15, 16);
        int i = sum2(17, 18);
        System.out.println(g + h + i);

        int j = sum2(19, 20);
        int k = sum2(21, 22);
        int l = sum2(23, 24);
        System.out.println(j + k + l);
    }

    public static int sum2(int a, int b) {
        return a + b;
    }
}