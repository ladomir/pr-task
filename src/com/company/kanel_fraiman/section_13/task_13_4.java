package com.company.kanel_fraiman.section_13;

import java.util.Scanner;

public class task_13_4 {
    /*
    Напишите класс, который принимает с клавиатуры положительное целое число и выводит на экран все его делители.
    Кроме того, класс должен определять количество и сумму делителей и выводить результаты на экран.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x, sum = 0, n, count = 0;
        System.out.println("Введите целое положительное число Х: ");
        x = scanner.nextInt();

        System.out.print("Общие делители - ");
        for (int i = 1; i <= x; i++) {
            if (x%i==0) {
                count++;
                sum += i;
                System.out.print(i + "\t");
            }
        }
        System.out.println("\nКоличество делителей - " + count + "\nСумма делителей - " + sum);
    }
}
