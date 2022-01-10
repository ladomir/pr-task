package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_18 {
    /*
    Напишите класс, который принимает с клавиатуры целое число и выводит на экран все числа,
    которые можно получить из введенного за счет «стирания последней цифры».
    Например, для введенного числа 52435 будут выведены на экран 5243, 524, 52, 5, О.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;

            System.out.println("Введите целое число a");
        a = scanner.nextInt();

        while (a > 0) {
            a/=10;
            System.out.print(a + "\t");
        }
    }
}
