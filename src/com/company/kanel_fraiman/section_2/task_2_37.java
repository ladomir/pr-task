package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_37 {
    /*
        Напишите класс, который принимает с клавиатуры имя и фамилию ученика.
        Класс должен вывести на экран в одной строке сначала фамилию,
        а после нее имя ученика, а во второй строке - сначала имя,
        а после него - фамилию ученика.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name, surname;
            System.out.println("Введите имя:");
        name = scanner.nextLine();
            System.out.println("Введите фамилию:");
        surname= scanner.nextLine();

        String s = surname + " " + name + "!";
        String s2 = name + " " + surname + "!";
        System.out.println(s + "\n" + s2);
        System.out.printf("%s %s!\n%s %s!", surname, name, name, surname);
    }
}
