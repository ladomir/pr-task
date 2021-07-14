package com.company.kanel_fraiman.section_13;

import java.util.Scanner;

public class task_13_10 {
    /*
    Назовем «степенью близости» двух целых положительных чисел сумму их общих делителей.
    Напишите класс, который принимает с клавиатуры два целых положительных числа и определяет их «степень близости».
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x, y, n, sum = 0;

            System.out.println("Введите целое положительное число Х: ");
        x = scanner.nextInt();
            System.out.println("Введите целое положительное число Y: ");
        y = scanner.nextInt();

        if (x > y) {
            n = x;
        } else {
            n = y;
        }

            System.out.print("Общие делители - ");
        for (int i = 1; i <= n; i++) {
            if (x%i==0 && y%i ==0) {
                System.out.print(i + "\t");
                sum +=i;
            }
        }

            System.out.printf("\n\"Степень близости\" целых положительных чисел равна %d!", sum);
    }
}
