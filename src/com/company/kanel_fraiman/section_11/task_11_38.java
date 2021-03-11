package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_38 {
    /*
    Напишите класс, который принимает с клавиатуры целое число,
    а затем генерирует 15 случайных чисел из диапазона положительных трехзначных чисел.
    Для тех сгенерированных чисел, которые делятся на введенное с клавиатуры значение,
    следует вывести на экран округленный в большую сторону квадратный корень из первой цифры (число сотен),
    для остальных - округленный в меньшую сторону квадратный корень из второй цифры (число десятков).
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n, a = 100, b = 999, i, c, c1, c2, c3;
            System.out.println("Введите число n:");
        n = scanner.nextInt();

        System.out.println("Отображение чисел: ");

        for (i = 1; i <= 15; i++) {
            c = (int) (Math.random() * (b - a + 1) + a);
            c1 = c / 100;
            c2 = (c%100)/10;
            // c3 = c % 10;

            if (c %n== 0) {
                if (i >= 1 && i <= 14) {
                    System.out.print(c + " (" + (int) Math.round(Math.sqrt(c1)+0.5) + "),\t");
                } else {
                    System.out.print(c + " (" + (int) Math.round(Math.sqrt(c1)+0.5) + ").\t");
                }
            }
            else  {
                if (i >= 1 && i <= 14) {
                    System.out.print(c + " (" + (int) Math.round(Math.sqrt(c2)-0.5) + "),\t");
                } else {
                    System.out.print(c + " (" + (int) Math.round(Math.sqrt(c2)-0.5) + ").\t");
                }
            }
        }
        System.out.println("\nВсе числа отображены.");
    }
}
