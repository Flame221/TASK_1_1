package com.yourname;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, d;
        System.out.println("Решение квадратного уровнения ax^2 + bx + c = 0");
        System.out.println("Введите значение а, b и c");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = b * b - 4 * a * c;
        if (d > 0) {
            double x1, x2;
            x1 = (-1 * b + Math.sqrt(d)) / (2 * a);
            x2 = (-1 * b - Math.sqrt(d)) / (2 * a);
            System.out.println("Корни квадратного уровнения равны " + x1 + " и " + x2);
        } else if (d == 0) {
            double x;
            x = (-1 * b / 2 * a);
            System.out.println("В этом уровнении один корень и он равен" + x);
        } else {
            System.out.println("Уровнение не имеет корней");
        }


    }


}
