package com.company.kanel_fraiman.section_12;

import java.util.Scanner;

public class task_12_11 {
    /*
    Для того чтобы определить, сколько учеников готовы поехать на экскурсию, в школе провели опрос.
    Каждый из 200 учеников отметил в опроснике:
    «1»- если он готов поехать на экскурсию, «О» - если не готов.
    Напишите класс, который принимает с клавиатуры ответы учеников и определяет количество учеников, готовых поехать на экскурсию.
    Кроме того, класс должен определить, поедет ли на экскурсию большинство участвовавших в опросе учеников или нет.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x, n = 200, count1 = 0, count0 = 0;
            System.out.println("Введите значение количества учеников в классе: ");
        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();
            if (x == 1) {
                count1++;
            } else {
                count0++;
            }
        }
        if (count1>n/2) {
            System.out.printf("Большинство участвующих в опросе (%d учеников) на экскурсию ПОЕДЕТ!", count1);
        } else {
            System.out.printf("Большинство участвующих в опросе (%d учеников) на экскурсию НЕ ПОЕДЕТ!", count0);
        }
    }
}