package com.company.kanel_fraiman.section_14;

import java.util.Scanner;

public class task_14_2 {
    /*
        В соревнованиях по бегу принимали участие 150 учеников школы.
    Напишите класс, который принимает с клавиатуры время, показанное в соревнованиях каждым из учеников,
    и выводит на экран наилучший результат, а также порядковый номер победителя
    (можно предположить, что есть только один победитель).
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int t, min, i, a, b = 1, n = 10;

        min = scanner.nextInt();

        for (i = 1; i <= n; i++) {
            t = scanner.nextInt();
            if(t < min) {
                min = t;
                a = i;
                b = a;
            }
        }
        System.out.printf("Наилучшее время показал %d-й ученик, показавав время - %d", b, min);
    }
}
