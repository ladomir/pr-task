package com.company.kanel_fraiman.section_11;

public class task_11_19 {
    /*
    Напишите класс, который выводит на экран в строку положительные
    двузначные числа, делящиеся на 5 (в убывающем порядке). Числа
    должны отделяться друг от друга знаком «пробел». Перед началом и
    после окончания вывода серии чисел на экран вывода следует вывести
    текстовые сообщения (по выбору).
     */
    public static void main(String[] args) {
        int i;
            System.out.println("Отображение целых чисел: ");
        for (i = 95; i >= 10; i-=5) {
            System.out.print(i + " ");
        }
        System.out.println("\nВсе числа отображены.");
    }
}
