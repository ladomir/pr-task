package com.company.kanel_fraiman.section_12;

import java.util.Scanner;

public class task_12_2 {
    /*
    Напишите класс, который принимает с клавиатуры 15 целых чисел
    и выводит на экран информацию о том,
    сколько из них были четными и сколько нечетными.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, countC=0, countN=0;
        for (int i = 0; i < 15; i++) {
            a = scanner.nextInt();
            if (a%2==0) {
                countC++;
            } else {
                countN++;
            }
        }
        System.out.printf("Количество чётных чисел - %d, нечётных - %d!", countC, countN);
    }
}
