package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_17 {
    /*
    Напишите класс, который принимает с клавиатуры целое положительное число N и цифру D.
    Класс должен проверить, есть ли внутри числа N цифра D, и вывести на экран соответствующее сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N, D, n, count = 0, countYES = 0, countNO = 0;

            System.out.println("Введите целое положительное число N");
        N = scanner.nextInt();
            System.out.println("Введите цифру D");
        D = scanner.nextInt();

        while (N > 0) {
           n = N % 10;
            System.out.print(n + "\t");
            count++;
            if (D==n) {
                countYES++;
            } else {
                countNO++;
            }
            N /= 10;
        }
        System.out.printf("\nВведённое число состоит из %d цифр", count);
        if (countYES > 0) {
            System.out.println("\nВ введённом числе N ПРИСУТСТВУЕТ цифра D");
        } else {
            System.out.println("\nВ введённом числе N НЕТ цифры D");
        }
    }
}
