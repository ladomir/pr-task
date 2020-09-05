package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_31 {
    /*
    Кинетическая энергия тела подсчитывается
    как половина произведения массы тела на квадрат скорости тела.
    Напишите класс, который принимает с клавиатуры два числа,
    первое из которых - масса тела, а второе - его скорость.
    Класс должен подсчитать и вывести на экран значение кинетической энергии тела.
     E = (m * v * v) / 2;
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float m, v, E;
            System.out.println("Введите значение массы:");
        m = scanner.nextFloat();
            System.out.println("Введите значение скорости:");
        v = scanner.nextFloat();

        E = (m * v * v) / 2;
            System.out.println("масса равна " + m + " ;");
            System.out.println("скорость равна " + v + " ;");
            System.out.println("значение кинетической энергии равно " + E + " ;");
            System.out.printf("масса равна - %.2f, \nскорость - %.5f, \nэнергия - %.2f;", m, v, E);
    }
}
