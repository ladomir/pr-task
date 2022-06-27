package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_50 {
    /*
    При внесении в компьютерную программу оценок группы из 30 учеников учитель может допустить ошибку
    (ввести число, не являющееся оценкой). Компьютерная программа игнорирует ошибку,
    а учитель получает возможность вновь занести с клавиатуры оценку. Напишите класс,
    который принимает с клавиатуры оценки 30 учеников до тех пор, пока все ученики не получат оценки.
    Класс должен подсчитать среднюю арифметическую оценку группы, а также количество ошибок, допущенных при введении оценок.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, n = 30, sum = 0, countbad = 0;

        System.out.println("Ввод оценок:");

        for (int i = 1; i <= n; i++) {
                a = scanner.nextInt();
            while (a < 1 || a > 5) {
                countbad++;
                a = scanner.nextInt();
            }
            sum+=a;
        }
        System.out.println("Средняя арифметическая оценка группы - " + 1.0*sum/n);
        System.out.println("Количество ошибок, допущенных при введении оценок - " + countbad);
    }
}
