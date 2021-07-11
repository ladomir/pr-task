package com.company.kanel_fraiman.section_13;

import java.util.Scanner;

public class task_13_9 {
    /*
    Два положительных целых числа называются «четно-близкими по сумме»,
    если сумма их общих делителей является четным числом.
    Напишите класс, который принимает с клавиатуры два целых положительных числа и
    проверяет, являются ли они «четно-близкими по сумме».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x, y, n, count = 0, sum = 0;

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
                count++;
                sum +=i;
            }
        }

        System.out.println("\nКоличество общих делителей чисел X и Y - " + count + "\nСумма общих делителей - " + sum);

        if (sum%2==0) {
            System.out.println("\nВведённые целые положительные числа являются \"чётно-близкими по сумме\"!");
        } else {
            System.out.println("\nВведённые целые положительные числа НЕ являются \"чётно-близкими по сумме\"!");
        }
    }
}
