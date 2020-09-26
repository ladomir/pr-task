package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_22 {
    /*
    Напишите класс, который принимает с клавиатуры целое положительное
    число и изменяет его следующим образом:
    • для четного числа - увеличивает его до ближайшего «круглого» и
    выводит новое значение на экран вместе с сообщением Up to."
    • для нечетного числа - уменьшает его до ближайшего «крутлого» и
    выводит новое значение на экран вместе с сообщением Down to".
    Например, для введенного значения 433 на экран выводится Down to
    430, а для 56 выводится Up to 60.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, c = 0;
            System.out.println("Введите целое число:");
        a = scanner.nextInt();

        if (a % 2 == 0) {
                c = (a / 10 + 1) * 10;
        }
        if (a % 2 == 1) {
                c = (a / 10) * 10;
        }
        System.out.println(c);
    }
}
