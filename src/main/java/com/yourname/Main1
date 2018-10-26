package com.yourname;

import java.util.Scanner;

class Main1 {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Введите стороны треугольника через пробел");

        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        if (a < b + c && b < a + c && c < a + b) {

            System.out.println("Треугольник с такими сторонами существует");
        } else {
            System.out.println("Такого треугольника не существует");
            return;
        }
        if (a == b || a == c || b == c) {
            System.out.println("Треугольник равнобедренный");
        }
        if (b * b == a * a + c * c || a * a == c * c + b * b || c * c == a * a + b * b) {
            System.out.println("Треугольник прямоугольный");
        }
        if (a == b && b == c) {
            System.out.println("Треугольник равнобедренный");
        }
    }
}
