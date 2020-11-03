package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_21 {
    /*
    Напишите класс, который принимает с клавиатуры временной интервал,
    выраженный в секундах, и выводит на экран тот же интервал, но
    выраженный в часах, минутах и секундах.
    Если промежуток времени превышает сутки, то надо не производить
    пересчет, а просто вывести на экран текстовое сообщение Расчет не
    производится.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, hour, minute, second;
            System.out.println("Введите количество секунд:");
        a = scanner.nextInt();

        hour = a / 3600; // количество часов
        minute = (a - hour * 3600) / 60; // количество минут
        second = a % 60; // количество секунд

        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);


        if (a <= 86400 && hour != 0 && minute != 0 && second != 0) {
            System.out.printf("Промежуток времени - %d час(а)(ов) %d минут(a)(ы) %d секунд(а)(ы)", hour, minute, second);
        } else if (a <= 86400 && hour != 0 && minute == 0 && second == 0) {
            System.out.printf("Промежуток времени - %d час(а)(ов)", hour);
        } else if (a <= 86400 && hour == 0 && minute != 0 && second != 0) {
            System.out.printf("Промежуток времени - %d минут(a)(ы) %d секунд(а)(ы)", minute, second);
        } else if (a <= 86400 && hour != 0 && minute == 0 && second != 0) {
            System.out.printf("Промежуток времени - %d час(а)(ов) %d секунд(а)(ы)", hour, second);
        } else if (a <= 86400 && hour != 0 && minute != 0 && second == 0) {
            System.out.printf("Промежуток времени - %d час(а)(ов) %d минут(a)(ы)", hour, minute);
        } else {
            System.out.println("Расчёт не производится");
        }
    }
}
