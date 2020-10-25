package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_15 {
    /*
    Напишите класс, который принимает с клавиатуры целое число, которое
    должно означать порядковый номер месяца. В случае если полученное
    значение действительно соответствует порядковому номеру
    одного из месяцев, следует вывести сезон (лето, осень, зима, весна), к
    которому относится месяц.
    В случае если введенное значение не является порядковым номером месяца,
    следует вывести на экран соответствующее текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
            System.out.println("Введите номер месяца a:");
        a = scanner.nextInt();

        if (a == 1 || a == 2 || a == 12) {
            System.out.println("Зима");
        }
        if (a >= 3 && a <= 5) {
            System.out.println("Весна");
        }
        if (a >= 6 && a <= 8) {
            System.out.println("Лето");
        }
        if (a >= 9 && a <= 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Число не является порядковым номером месяца!");
        }
    }
}
