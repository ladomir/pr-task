package com.company.kanel_fraiman.section_11;

public class task_11_20 {
    /*
    Напишите класс, который выводит на экран в строку положительные
    трехзначные числа, делящиеся на 80 с остатком 45 (в возрастающем
    порядке). Числа должны отделяться друг от друга знаком «пробел». Перед
    началом и после окончания вывода серии чисел на экран вывода
    следует вывести текстовые сообщения (по выбору).
     */
    public static void main(String[] args) {
            System.out.println("Отображение целых чисел: ");
        for (int i = 125; i <= 1000; i+=80) {
            System.out.print(i + " ");
        }
        System.out.println("\nВсе числа отображены.");
    }
}
