package com.company.kanel_fraiman.section_13;

import java.util.Scanner;

public class task_13_13 {
    /*
        Напишите класс, который принимает с клавиатуры оценки 30 учеников класса и выводит на экран:
    • среднюю арифметическую оценку учеников, получивших удовлетворительные оценки;
    • среднюю арифметическую оценку учеников, получивших неудовлетворительные оценки.
        Что произойдет при исполнении программы, если все 30 учеников получили удовлетворительные оценки?
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x, sum5 = 0, sum2 = 0, count5 = 0, count2 = 0;
        double avg5, avg2;

        for (int i = 1; i <= 30; i++) {
                System.out.printf("Введите оценку %d-го ученика по пятибальной системе (от 1 до 5): ", i);
            x = scanner.nextInt();

            if (x >= 3) {
                count5++;
                sum5 +=x;
            }

            if (x <= 2) {
                count2++;
                sum2 +=x;
            }
        }

        if (count5!=0) {
            avg5 = sum5 / count5;
            System.out.printf("\nСредняя арифметическая оценка учеников, получивших удовлетворительную оценку равна - %.1f!", avg5);
        } else {
            System.out.printf("\nВ классе нет учеников, получивших удовлетворительную оценку!");
        }

        if (count2!=0) {
            avg2 = sum2 / count2;
            System.out.printf("\nСредняя арифметическая оценка учеников, получивших удовлетворительную оценку равна - %.1f!", avg2);
        } else {
            System.out.printf("\nВ классе нет учеников, получивших неудовлетворительную оценку!");
        }
    }
}
