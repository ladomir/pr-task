package com.company.kanel_fraiman.section_12;

import java.util.Scanner;

public class task_12_10 {
    /*
    Контрольная работа считается «провальной», если более половины учеников получили неудовлетворительные оценки.
    Напишите класс, который принимает с клавиатуры число учеников в группе, а затем - оценку каждого ученика.
    Класс должен определить, была ли контрольная «провальной».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n, x, count = 0;
            System.out.println("Введите значение количества учеников в классе: ");
        n = scanner.nextInt();
            System.out.printf("Количество учеников в классе равно %d!", n);
            System.out.printf("\nОценки учеников:");
        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();
            if (x <= 2) {
                count++;
            }
        }
            if (count>n/2) {
                System.out.println("Контрольная работа БЫЛА \"провальной\"!");
            } else {
                System.out.println("Контрольная работа НЕ БЫЛА \"провальной\"!");
            }
    }
}
