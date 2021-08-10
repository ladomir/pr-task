package com.company.kanel_fraiman.section_13;

import java.util.Scanner;

public class task_13_14 {
    /*
        Школа организовала распродажу в пользу стариков. На распродаже продавались билеты двух видов:
        • обычный билет участника распродажи;
        • билет с правом посещения концерта.
        Тот, кто приобрел более 10 обычных билетов участника, получал дополнительно еще один такой же - бесплатно.
        Напишите класс, который для каждого из 200 участников распродажи будет принимать
    в качестве ввода количество билетов каждого вида,
    приобретенных данным участником (два положительных целых числа).
        Класс подсчитает и напечатает в качестве вывода число проданных билетов каждого вида,
    а также число обычных билетов, выданных бесплатно.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, x = 0, sumA = 0, sumB = 0;

        for (int i = 1; i <= 5; i++) {
                System.out.printf("Введите значение количества приобретённых обычных билетов %d-го учасника распродажи: ", i);
            a = scanner.nextInt();
                System.out.printf("Введите значение количества приобретённых билетов c правом посещения концерта %d-го учасника распродажи: ", i);
            b = scanner.nextInt();

            sumA += a;
            sumB += b;

            if (a > 10) {
                x++;
            }
        }

        System.out.printf("\nЧисло проданных обычных билетов равно - %d!", sumA);
        System.out.printf("\nЧисло проданных билетов с правом посещения равно - %d!", sumB);
        System.out.printf("\nЧисло обычных билетов, выдано бесплатно, равно - %d!", x);
    }
}