package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_22 {
    /*
        Напишите класс, который вводит с клавиатуры 15 целых положительных чисел,
    для каждого введенного числа класс должен напечатать сумму его цифр.
        После окончания ввода класс выведет на экран порядковый номер числа с самой большой суммой цифр.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, n = 5, max = 0, sum, count = 1;

        for(int i = 1; i <= n; i++) {
            a = scanner.nextInt();
                sum = 0;
            while (a > 0) {
                    sum += a % 10;
                    a /= 10;
            }
                System.out.printf("Сумма цифр - %d\n", sum);
            if (sum > max) {
                max = sum;
                count = i;
            }
        }
        System.out.println("Порядковый номер числа с наибольшей суммой цифр - " + count);
    }
}
