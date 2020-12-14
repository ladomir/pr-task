package com.company.kanel_fraiman.section_10;

public class task_10_17 {
    /*
    Напишите класс, который генерирует длины сторон катетов прямоугольного
    треугольника так, чтобы длина катета не превышала 10.5 см.
    Класс должен подсчитать длину гипотенузы этого треугольника, его
    площадь и периметр и вывести их на экран.
    Затем эти вычисленные значения следует округлить и вывести результат
    на экран в отдельной строке вместе с соответствующим текстовым
    сообщением.
     */
    public static void main(String[] args) {
        double a, b, c, P, S;

        a = Math.random()*10.5+0.1;
            System.out.printf("Длина первого катета - %.1f!\n", a);
        b = Math.random()*10.5+0.1;
            System.out.printf("Длина второго катета - %.1f!\n", b);

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            System.out.printf("Длина гипотенузы - %.1f!\n", c);

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

        P = a + b + c;
        S = 0.5 * a * b;

            System.out.println(P);
            System.out.println(S);

            System.out.printf("Периметр прямоугольного треугольника - %.0f!\n", P);
            System.out.printf("Площадь прямоугольного треугольника - %.0f!\n", S);
    }
}
