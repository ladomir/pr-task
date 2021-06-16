package com.company.kanel_fraiman.section_12;

import java.util.Scanner;

public class task_12_17 {
    /*
    Два положительных целых числа называются «родственными», если у них есть одинаковое количество делителей.
    Напишите класс, который принимает с клавиатуры два целых положительных числа и проверяет, являются ли они «родственными».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x, y, countX = 0, countY = 0;
            System.out.println("Введите целое положительное число Х: ");
        x = scanner.nextInt();
            System.out.println("Введите целое положительное число Y: ");
        y = scanner.nextInt();

        for (int i = 1; i <= x; i++) {
            if (x%i == 0) {
                countX++;
            }
        }
        for (int i = 1; i <= y; i++) {
            if (y%i == 0) {
                countY++;
            }
        }
        System.out.printf("\nКоличество делителей: \n\tX - %d, \n\tY - %d\n", countX, countY);
        if (countX == countY) {
            System.out.println("Числа являются \"родственными\"");
        } else {
            System.out.println("Числа НЕ являются \"родственными\"");
        }
    }
}
