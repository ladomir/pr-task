package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_19 {
    /*
    Напишите метод, который получает в качестве параметров два целых числа.
    Метод возвращает значение true, если первая цифра в первом параметре равна последней цифре во втором параметре.
    В ином случае метод возвращает значение false.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;

            System.out.println("Введите целое число A");
        a = scanner.nextInt();
            System.out.println("Введите целое число B");
        b = scanner.nextInt();

        comparasionFirstLastDigits(a, b);
    }

    static void comparasionFirstLastDigits (int a, int b) {

        int x, countA = 0;

        for (int i = a; i != 0; i /= 10) {
            countA++;
        }

        x = (int)Math.pow(10, countA-1);

        int leftA = a / x;

        int ridhtB = b % 10;

        if (leftA==ridhtB) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
