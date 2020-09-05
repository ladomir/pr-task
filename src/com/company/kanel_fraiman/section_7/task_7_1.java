package com.company.kanel_fraiman.section_7;

import java.util.Scanner;

public class task_7_1 {
    /*
    «Переведите» словесные описания в команды на языке Java:
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        Если значение переменной avg равно 100, то выведи на экран сообщение Молодец
         */
        int avg;
            System.out.println("Введите число");
        avg = scanner.nextInt();
        if (avg == 100) {
            System.out.println("Молодец!");
        }

        /*
        Если значение переменной mark меньше 60, то увеличить это значение на 10%
         */
        double mark;
            System.out.println("Введите число");
        mark = scanner.nextDouble();
        if (mark < 60) {
            mark = mark * 1.1;
            System.out.println(mark);
        }

        /*
        Если значение переменной one больше значения переменной two, то вывести на экран значение one;
        в противном случае - вывести на экран значение переменной two
         */
        double one, two;
            System.out.println("Введите число");
        one = scanner.nextDouble();
            System.out.println("Введите число");
        two = scanner.nextDouble();
        if (one > two) {
            System.out.println(one);
        } else  {
            System.out.println(two);
        }

        /*
        Если значение переменной num больше нуля, то вывести на экран сообщение Положительное.
        Если значение переменной num меньше нуля, то вывести на экран сообщение Отрицательное
         */
        double num;
            System.out.println("Введите число");
        num = scanner.nextDouble();
        if (num > 0) {
            System.out.println("Положительное!");
        } else  {
            System.out.println("Отрицательное!");
        }

        /*
        Если сумма переменных ugoll, ugol2 и ugol3 составляет 180,
        то вывести на экран сообщение Это углы одноrо треугольника;
        в противном случае вывести на экран сообщение Это не углы одноrо треугольника
         */
        double ugol1, ugol2, ugol3;
            System.out.println("Введите значение первого угла");
        ugol1 = scanner.nextDouble();
            System.out.println("Введите значение второго угла");
        ugol2 = scanner.nextDouble();
            System.out.println("Введите значение третего угла");
        ugol3 = scanner.nextDouble();
        if (ugol1 + ugol2 + ugol3 == 180) {
            System.out.println("Это углы одноrо треугольника!");
        } else  {
            System.out.println("Это не углы одноrо треугольника!");
        }
    }
}
