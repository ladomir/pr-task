package com.company.kanel_fraiman.section_3;

import java.util.Scanner;

public class task_3_9 {
    /*
    Компания по продаже минеральной воды проводит конкурс «Балл под крышкой»:
    на внутренней стороне пробок, которыми закрыты бутылки,
    выпускаемые компанией, напечатаны призовые баллы.
    Есть пробки, «равные» 10 баллам, есть - 100, есть - 1000.
    Напишите класс, который принимает с клавиатуры три числа,
    означающие количество пробок каждого типа, собранных Васей,
    и выводит на экран общее количество баллов, которые Вася получил.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, sum;
            System.out.println("Введите количество пробок на \" 10 баллов\":");
        a = scanner.nextInt();
            System.out.println("Введите количество пробок на \" 100 баллов\":");
        b = scanner.nextInt();
            System.out.println("Введите количество пробок на \" 1000 баллов\":");
        c = scanner.nextInt();
        sum = a * 10 + b * 100 + c * 1000;
        System.out.println("Вася получил " + sum + " баллов.");
        System.out.printf("Вася получил %d баллов.", sum);
    }
}
