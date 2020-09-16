package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_11 {
    /*
    Напишите класс, который принимает с клавиатуры два числа:
    первое - количество учеников в классе, второе - количество стульев в классной
    комнате.
    Программа проверит соответствие между этими двумя значениями и
    выведет на экран соответствующую информацию
    (например, для значений 35 и 39 на экран выводится 4 стула лишних).
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
            System.out.println("Введите количество учеников в классе:");
        a = scanner.nextInt();
            System.out.println("Введите количество стульев в классной комнате:");
        b = scanner.nextInt();

        if (a == b) {
            System.out.println("Стульев хватает на всех учеников!");
            System.out.printf("Стульев хватает на всех учеников!");
        } if (a > b) {
            if(a - b == 1) {
                System.out.println("В классной комнате не хватает " + (a - b) + " стула!");
                System.out.printf("В классной комнате не хватает %d стула!", a - b);
            } else {
                System.out.println("В классной комнате не хватает " + (a - b) + " стульев!");
                System.out.printf("В классной комнате не хватает %d стульев!", a - b);
            }
        }
        if (a < b) {
            if (b - a == 1) {
                System.out.println("В классной комнате " + (b - a) + " стул лишний!");
                System.out.printf("В классной комнате %d стул лишний!", b - a);
            } else if (b - a > 1 && b - a < 5) {
                System.out.println("В классной комнате " + (b - a) + " стула лишних!");
                System.out.printf("В классной комнате %d стула лишних!", b - a);
            } else {
                System.out.println("В классной комнате " + (b - a) + " стульев лишних!");
                System.out.printf("В классной комнате %d стульев лишних!", b - a);
            }
        }
    }
}
