package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_6 {
    /*
    Напишите класс, который должен принять с клавиатуры значение 123 и вывести на экран сообщение Код принят.
    Класс будет снова и снова принимать с клавиатуры значения до тех пор, пока не будет введено значение 123.
    На каждое вводимое с клавиатуры значение, отличное от 123, класс должен выводить сообщение
    Код неверный, повторите ввод.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;

        a = scanner.nextInt();

        while (a!=123) {
                System.out.print("Код неверный, повторите ввод");
            a = scanner.nextInt();
        }
        System.out.print("Код принят");
    }
}
