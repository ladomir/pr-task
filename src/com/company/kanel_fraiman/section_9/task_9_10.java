package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_10 {
    /*
    Напишите класс, который принимает с клавиатуры три целых числа и
    определяет, в каких соотношениях с точки зрения значений (равны,
    больше, меньше) они находятся. На экран следует вывести сообщение с
    точным указанием результатов проверки: например, Первое и третье
    равны, второе больше них или Все значения одинаковы.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, c;
            System.out.println("Введите целое число a:");
        a = scanner.nextInt();
            System.out.println("Введите целое число b:");
        b = scanner.nextInt();
            System.out.println("Введите целое число c:");
        c = scanner.nextInt();

        if(a == b && b == c ) {
            System.out.println("Все значения равны");
        }
        if(a == b && a > c ) {
            System.out.println("Значения a и b равны и они больше значения c");
        }
        if(a == b && a < c ) {
            System.out.println("Значения a и b равны и они меньше значения c");
        }
        if(a == c && a > b ) {
            System.out.println("Значения a и c равны и они больше значения b");
        }
        if(a == c && a < b ) {
            System.out.println("Значения a и c равны и они меньше значения b");
        }
        if(c == b && c > a ) {
            System.out.println("Значения c и b равны и они больше значения a");
        }
        if(c == b && c < a ) {
            System.out.println("Значения c и b равны и они меньше значения a");
        }
        if(a > b && a > c && b > c) {
            System.out.println("Значения a больше значений b и c, значение b больше значения c");
        }
        if(a > b && a > c && b < c) {
            System.out.println("Значения a больше значений b и c, значение b меньше значения c");
        }
        if(b > a && b > c && a > c) {
            System.out.println("Значения b больше значений a и c, значение a больше значения c");
        }
        if(b > a && b > c && a < c) {
            System.out.println("Значения b больше значений a и c, значение a меньше значения c");
        }
        if(c > a && c > b && a > b) {
            System.out.println("Значения c больше значений a и b, значение a больше значения b");
        }
        if(c > a && c > b && a < b) {
            System.out.println("Значения c больше значений a и b, значение a меньше значения b");
        }
    }
}
