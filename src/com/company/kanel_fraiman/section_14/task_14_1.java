package com.company.kanel_fraiman.section_14;

import java.util.Scanner;

public class task_14_1 {

    /*
        В соревнованиях по бегу принимали участие 150 учеников школы.
        Напишите класс, который принимает с клавиатуры время, показанное в соревнованиях каждым из учеников,
    выводит на экран наилучшийрезультат.
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int t, min, n = 150;

        min = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            t = scanner.nextInt();
            if(t < min) {
                min = t;
            }
        }
        System.out.println(min);
    }
}
