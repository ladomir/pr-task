package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_49 {
    /*
        Напишите класс, который принимает с клавиатуры оценки, полученные группой учеников,
    и определяет среднюю арифметическую оценку в группе.
        Ввод данных завершается, когда очередное вводимое с клавиатуры значение не является оценкой.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = 1, n = 0, sum = 0;

        while (a >= 1 && a <= 5) {
                System.out.println("Введите оценку:");
            a = scanner.nextInt();
            if (a >= 1 && a <= 5) {
                sum += a;
                n++;
                    System.out.println("Средняя арифметическая оценка в группе - " + 1.0*sum / n);
            } else {
                System.out.println("Некорректный ввод");
                System.out.println("Средняя арифметическая оценка в группе - " + 1.0*sum / n);
            }
        }
    }
}
