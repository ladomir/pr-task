package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_33 {
    /*
    Напишите класс, который принимает с клавиатуры два целых положительных
    числа, которые должны представлять числитель (первое) и
    знаменатель(второе)дроби.
    В случае если введенные значения образуют правильную дробь, следует
    вывести на экран соответствующее текстовое сообщение.
    В случае если введенные значения образуют неправильную дробь, следует
    вывести ее на экран в виде смешанной дроби.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
            System.out.println("Введите целое число a:");
        a = scanner.nextInt();
            System.out.println("Введите целое число b:");
        b = scanner.nextInt();

        if (a >= b && a != 0 && b != 0) {
            System.out.println(a/b+" "+(a-a/b)+"/"+b);
        }
        if (a < b  && a != 0) {
            System.out.println("Числа могут выражать правильную дробь");
        }
        if (a == 0 || b == 0) {
            System.out.println("Числа не могут выражать дробь");
        }
    }
}
