package com.company.kanel_fraiman.section_12;

import java.util.Scanner;

public class task_12_6 {
    /*
    Напишите класс, который принимает с клавиатуры целое число и проверяет,
    на какое количество двузначных чисел оно делится.
    Результат проверки класс должен вывести на экран вместе с соответствующим текстовым сообщением.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, count=0;
            a = scanner.nextInt();
        for (int i = 10; i < 100; i++) {
            if (a%i==0) {
                count++;
            }
        }
        System.out.println("Введённое число делится такое количество двухзначных чисел - " + count + "!");
        System.out.printf("Введённое число делится такое количество двухзначных чисел - %d!", count);
    }
}
