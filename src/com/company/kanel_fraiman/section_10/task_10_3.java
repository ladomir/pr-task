package com.company.kanel_fraiman.section_10;

public class task_10_3 {
    /*
    Напишите класс, который генерирует и выводит на экран 2 случайных
    целых числа из диапазона «однозначные» (включая и положительные,
    и отрицательные).
    После этого в отдельной строке класс должен вывести наибольшее из
    этих двух чисел - с соответствующим текстовым сообщением, и в еще
    одной строке - наименьшее из этих двух чисел, тоже с соответствующим
    текстовым сообщением.
     */
    public static void main(String[] args) {
        int a, b;

        a = (int)(Math.random()*19-9);
        b = (int)(Math.random()*19-9);

        System.out.printf("Сгенерированое однозначное число a равно - %d, b равно - %d\n", a, b);

        if (a > b) {
            System.out.printf("Наибольшее из сгенерированных чисел - %d\n", a);
        } else {
            System.out.printf("Наибольшее из сгенерированных чисел - %d\n", b);
        }
        if (a < b) {
            System.out.printf("Наименьшее из сгенерированных чисел - %d\n", a);
        } else {
            System.out.printf("Наименьшее из сгенерированных чисел - %d\n", b);
        }
    }
}