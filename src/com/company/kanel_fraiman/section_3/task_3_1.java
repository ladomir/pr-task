package com.company.kanel_fraiman.section_3;

import java.util.Scanner;

public class task_3_1 {
    /*
    Связь между температурой по шкале Цельсия и температурой по шкале Фаренгейта
    выражается формулой: C = 5 * (F - 32) / 9,
    где С - температура по шкале Цельсия, F - температура по шкале Фаренгейта.
    Напишите класс,
    который принимает с клавиатуры температуру по шкале Фаренгейта,
    а затем выводит на экран эту же температуру, но по шкале Цельсия.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double tempF, tempC;
            System.out.println("Введите значение температуры по шкале Фаренгейта:");
        tempF = scanner.nextDouble();
            System.out.println("Значение температуры по шкале Фаренгейта равно " + tempF + " градусов");

        tempC = 5 * (tempF - 32) / 9;
        System.out.println("Температура по шкале Цельсия равна " + tempC + " градусов");
        System.out.printf("Температура по шкале Цельсия равна %.1f градусов", tempC);
    }
}
