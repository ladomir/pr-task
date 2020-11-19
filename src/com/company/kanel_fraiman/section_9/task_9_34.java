package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_34 {
    /*
    Напишите класс, который читает с клавиатуры два символьных значения
    и проверяет, идентичны ли они.
    По результатам проверки следует вывести на экран соответствующее
    сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char a, b;
            System.out.println("Введите символ a:");
        a = scanner.next().charAt(0);
            System.out.println("Введите символ b:");
        b = scanner.next().charAt(0);

        if (a == b) {
            System.out.println("Введённые символы идентичны");
        } else  {
            System.out.println("Введённые символы НЕидентичны");
        }
    }
}
