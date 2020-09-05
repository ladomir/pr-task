package com.company.kanel_fraiman.section_3;

import java.util.Scanner;

public class task_3_10 {
    /*
    Подрабатывая в течение года,
    Вася собрал себе определенную сумму на поездку за границу,
    а родители добавили ему от себя еще некоторую сумму.
    Напишите класс, который принимает с клавиатуры три значения:
    первое - сумма в рублях, заработанная Васей, второе - сумма в рублях,
    которую ему дали родители, третье - курс рубля по отношению к евро.
    Класс должен подсчитать и вывести на экран сумму в евро,
    которая имеется у Васи для поездки за границу.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, course, sum;
            System.out.println("Введите количество денег, которые Вася заработал сам:");
        a = scanner.nextDouble();
            System.out.println("Введите количество денег, которую Васе дали родители:");
        b = scanner.nextDouble();
            System.out.println("Введите валютный курс");
        course = scanner.nextDouble();
        sum = (a + b) / course;
        System.out.println("Для поездки за границу у Васи имеется " + sum + " евро.");
        System.out.printf("Для поездки за границу у Васи имеется %.2f евро.", sum);
    }
}
