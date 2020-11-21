package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_35 {
    /*
    Напишите класс, который читает с клавиатуры символ и проверяет,
    является ли введенный символ буквой латинского алфавита. По результатам
    проверки следует вывести на экран соответствующее сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char a;
            System.out.println("Введите символ a:");
        a = scanner.next().charAt(0);

        if (a >= 'A' && a <= 'z') {
            System.out.println("Введенный символ является буквой латинского алфавита");
        } else  {
            System.out.println("Введенный символ НЕ является буквой латинского алфавита");
        }
    }
}
