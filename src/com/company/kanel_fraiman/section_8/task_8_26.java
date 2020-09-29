package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_26 {
    /*
    Симметричным («палиндромом») называется число, которое дает одинаковое
    значение при чтении его справа налево и слева направо (например,
    787).
    Напишите класс, который принимает с клавиатуры положительное число
    (не большее 99999) и проверяет, является ли это число палиндромом.
    Класс должен выводить на экран соответствующее текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;
            System.out.println("Введите целое число:");
        a = scanner.nextInt();

        for (; a > 0; a /= 10){
            b = a % 10;
                System.out.println(b);
        }
            // не завершено
    }
}
