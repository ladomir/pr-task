package com.company.kanel_fraiman.section_15;

import java.util.Scanner;
    /*
        Напишите класс, который принимает с клавиатуры целое число и
    подсчитывает число цифр в нем (количество цифр в числе).
        Результат подсчета должен быть выведен на экран.
    Например, для числа 534 на экран будет выведено 3 цифры.
     */
public class task_15_28 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, count = 0;

        System.out.println("Введите целое пожительное число: ");

        a = scanner.nextInt();

        for (int i = a; i != 0; i /= 10) {
            count++;
        }

        System.out.println("Количество цифр числа - " + count);
    }
}
