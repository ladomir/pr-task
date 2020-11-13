package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_22 {
    /*
    В кассе имеются купюры достоинством 100, 50 и 10 рублей.
    Напишите класс, который принимает с клавиатуры целое число, выражающее
    сумму в рублях, которую надо выплатить.
    Класс должен определить, каким минимальным набором купюр можно
    выдать введенную с клавиатуры сумму и какими купюрами.
    Если нет возможности выплатить указанную сумму, на экран следует
    вывести соответствующее текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a100, a50, a10;
            System.out.println("Введите сумму в рублях, которую надо выплатить:");
        a = scanner.nextInt();

        a100 = a / 100;
        a50 = (a - a100 * 100) / 50;
        a10 = (a - a100 * 100 - a50 * 50) / 10;


        if ((a100 * 100 + a50 * 50 + a10 *10) == a) {
            System.out.printf("Введённую с клавиатуры сумму можно выдать - %d по 100, %d по 50, %d по 10",
                    a100, a50, a10);
        } else {
            System.out.println("Нет возможности выплатить указанную сумму");
        }
    }
}