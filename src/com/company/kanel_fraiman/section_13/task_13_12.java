package com.company.kanel_fraiman.section_13;

import java.util.Scanner;

public class task_13_12 {
    /*
        Напишите класс, который принимает с клавиатуры оценки 30 учеников класса и выводит на экран:
    • среднюю арифметическую оценку класса;
    • число учеников, получивших неудовлетворительные оценки.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x, sum = 0, count = 0;
        double avg = 0;

        for (int i = 1; i <= 30; i++) {
                System.out.printf("Введите оценку %d-го ученика по пятибальной системе (от 1 до 5): ", i);
            x = scanner.nextInt();

            if (x <= 2) {
                count++;
            }
            sum +=x;
        }
        avg = sum / 30;

        System.out.printf("\nСредняя арифметическая оценка класс равна - %.1f!", avg);
        System.out.printf("\nЧисло учеников, получивших неудевлетворительную оценку - %d!", count);

    }
}
