package com.company.kanel_fraiman.section_11;

public class task_11_13 {
    /*
    Напишите класс, который выводит на экран в строку все трехзначные
    положительные числа (в убывающем порядке). Числа должны отделяться
    друг от друга знаком «пробел». Перед началом вывода на экран
    (в отдельной строке) следует вывести слово Начало, а после окончания
    вывода чисел (тоже в отдельной строке) - слово Завершено.
     */
    public static void main(String[] args) {

        System.out.println("Начало");
        for (int i = 999; i > 99; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\nЗавершено");
    }
}
