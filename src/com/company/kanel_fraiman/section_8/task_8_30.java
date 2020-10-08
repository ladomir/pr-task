package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_30 {
    /*
    Напишите класс, который принимает с клавиатуры два целых числа.
    Класс должен определить, мoryr ли эти числа быть числителем (первое)
    и знаменателем (второе) дроби.
    В случае если числа выражают неправильную дробь, следует вывести
    на экран соответствующую ей правильную сложную дробь, а во всех
    остальных случаях - текстовое сообщение Подсчет не производится.
    Например, если с клавиатуры введены значения 7 и 12 - на экран выводится
    сообщение Подсчет не производится; если введены 12 и 7, то
    на экран выводится 1 5/7.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
            System.out.println("Введите целое число a:");
        a = scanner.nextInt();
            System.out.println("Введите целое число b:");
        b = scanner.nextInt();

        if (a >= b && a != 0 && b != 0) {
            System.out.println(a / b + " " + (a % b) + "/" + b);
        } else {
            System.out.println("Подсчет не производится");
        }
    }
}
