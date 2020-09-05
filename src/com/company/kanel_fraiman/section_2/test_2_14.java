package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class test_2_14 {
    /*
    Напишите класс, который принимает с клавиатуры целое число
    и выводит на экран число, которое больше введенного с клавиатуры на 10.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число:");
        int a = scanner.nextInt();
            System.out.println("Введённое число - " + a + ".");
        int b = a +10;
            System.out.printf("Число, которое больше введенного с клавиатуры на 10 - %d.", b);
    }
}
