package com.company.kanel_fraiman.section_16;

import java.util.Scanner;

public class task_16_20 {
    /*
    В классе 35 учеников. В конце учебного года каждый ученик получает ведомость с оценками по 8 предметам.
    Напишите класс, который генерирует по 8 оценок для каждого ученика и подсчитывает для него среднюю годовую оценку.
    Для каждого ученика класс должен выводить на экран в одну строку оценки каждого ученика и его среднюю годовую оценку.
    После завершения вывода на экран оценок всех учеников класс должен выводить в отдельной строке количество учеников,
    у которых среднегодовая оценка выше 4.5, и наивысшую среднегодовую оценку.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int c, a = 1, b = 5, n = 0;
        double ar = 0, max = 0, nb = 0;

        // ar - average rating - средняя оценка

        System.out.println("Ведомость с оценками учеников: ");

        for (int i = 1; i <= 35; i++) {
                System.out.print("\n" + i + "-й ученик: ");
            double sum = 0;
            for (int j = 1; j <= 8; j++) {
                c = (int) (Math.random() * (b - a + 1) + a);
                System.out.print(c + "\t");
                sum += c;
                ar = sum / j;
            }
                System.out.printf("средняя годовая оценка - %.2f", ar);
            if (ar >= 4.5) {
                n++;
            }
            if (ar > max) {
                max = ar;
                nb = ar;
            }
            System.out.println();
        }
        System.out.printf("\nКоличество учеников, средння годовая оценка которых выше 4.5 - %d", n);
        System.out.println("\nНаивысшая средння годовая оценка - " + nb);
    }
}
