package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_27 {
    /*
    Напишите класс, который принимает в качестве параметров два целых
    положительных числа и выводит на экран с дополнительным сообщением
    то из них, у которого наибольшая последняя цифра (число единиц).
    Если такого числа нет, класс должен вывести на экран соответствующее
    сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, a1, b1;
            System.out.println("Введите целое число a:");
        a = scanner.nextInt();
            System.out.println("Введите целое число b:");
        b = scanner.nextInt();

        a1 = a % 10;
        b1 = b % 10;

        if (a1 > b1) {
            System.out.println("Последняя цифра больше у числа a(" + a + ")");
        }
        if (a1 < b1) {
            System.out.println("Последняя цифра больше у числа a(" + b + ")");
        }
        if (a1 == b1) {
            System.out.println("Нет результата!");
        }
    }
}
