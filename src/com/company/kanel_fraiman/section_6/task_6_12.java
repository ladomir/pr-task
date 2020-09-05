package com.company.kanel_fraiman.section_6;

import java.util.Scanner;

public class task_6_12 {
    /*
    Напишите класс, который принимает с клавиатуры три значения (а, b     и с),
    являющиеся коэффициентами квадратного уравнения.
    Класс должен определить, имеется ли у этого уравнения хотя бы один
    корень (решение), и вывести на экран соответствующее текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d;
            System.out.println("Введите число");
        a = scanner.nextInt();
            System.out.println("Введите число");
        b = scanner.nextInt();
            System.out.println("Введите число");
        c = scanner.nextInt();

        d = b *b - 4 * a *c;

        if (d < 0) {
            System.out.println("Да!");
        } else {
            System.out.println("Нет!");
        }
    }
}
