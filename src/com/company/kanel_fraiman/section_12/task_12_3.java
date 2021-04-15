package com.company.kanel_fraiman.section_12;

import java.util.Scanner;

public class task_12_3 {
    /*
    Напишите класс, который принимает с клавиатуры 12 целых чисел
    и выводит на экран информацию о том, сколько из них были больше, чем первое число.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, count=0;
        for (int i = 0; i < 12; i++) {
                a = scanner.nextInt();
//            if (a%2==0) {
//                count++;
//            }
        }
        System.out.printf("Количество чисел, больших за первое - %d!", count);
    }
}
