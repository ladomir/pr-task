package com.company.kanel_fraiman.section_11;

public class task_11_12 {
    /*
    Напишите класс, который выводит на экран в строку все положительные
    двузначные числа (в возрастающем порядке). Числа должны отделяться
    друг от друга знаком «пробел». Перед началом вывода на экран
    (в отдельной строке) следует вывести слово Старт, а после окончания
    вывода чисел (тоже в отдельной строке)- слово Финиш.
     */
    public static void main(String[] args) {

            System.out.println("Старт");
        for (int i = 10; i < 100; i++) {
            System.out.print(i + "  ");
        }
            System.out.println("\nФиниш");
    }
}