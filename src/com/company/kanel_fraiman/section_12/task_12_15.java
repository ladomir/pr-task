package com.company.kanel_fraiman.section_12;

import java.util.Scanner;

public class task_12_15 {
    /*
    Напишите класс, который принимает с клавиатуры целое положительное число Х
    и выводит на экран все его делители (1 и само число Х не считать делителями).
    Класс должен также подсчитать количество этих делителей
    и вывести результат на экран вместе с соответствующим по смыслу текстовым сообщением.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x, n, count = 0;
            System.out.println("Введите целое положительное число Х: ");
        x = scanner.nextInt();
        n = x;
        for (int i = 2; i < n; i++) {

            if (x%i==0 ) {
                count++;
            }
        }
            System.out.printf("Количество делителей в ведённом числе равно %d!", count);
    }
}
