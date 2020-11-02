package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_20 {
    /*
    Напишите класс, который принимает с клавиатуры промежуток времени,
    выраженный в секундах, и выводит на экран его же, но выраженный
    в минутах и секундах.
    Если промежуток времени превышает час, то надо не производить пересчет,
    а просто вывести на экран текстовое сообщение Расчет не
    производится.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
            System.out.println("Введите количество секунд:");
        a = scanner.nextInt();

        b = a / 60; // количество минут
        c = a % 60; // количество секунд


        if (a <= 3600) {
            System.out.printf("Промежуток времени равен %d минут %d секунд", b, c);
        } else {
            System.out.println("Расчёт не производится");
        }
    }
}
