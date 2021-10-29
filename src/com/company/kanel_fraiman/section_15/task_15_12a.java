package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_12a {
    /*
   Напишите класс, который принимает с клавиатуры целые числа,
   пока не будут введены с клавиатуры друг за другом два одинаковых числа.
   Класс должен выводить на экран сумму серии - за исключением последнего введенного с клавиатуры значения.
    */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, c, sum = 0;

        a = scanner.nextInt();
        b = scanner.nextInt();

        c = b;

            while (a != b) {
                sum += a;
                b = a;
                a = scanner.nextInt();

            }
            System.out.printf("\nСумма серии равна - %d", c + sum);
    }
}
