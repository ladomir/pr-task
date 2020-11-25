package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_37 {
    /*
    Напишите класс, который принимает с клавиатуры имя и фамилию
    одного человека, а затем имя и фамилию другого.
    Класс должен проверить, являются ли эти два человека:
    • тезками, но не однофамильцами;
    • однофамильцами, но не тезками;
    • и тезками, и однофамильцами.
    По результатам проверки следует вывести на экран соответствующее
    сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name1, name2, famile1, famile2;

        System.out.println("Введите имя первого человека name1:");
            name1 = scanner.nextLine();
        System.out.println("Введите фамилию первого человека famile1:");
            famile1 = scanner.nextLine();
        System.out.println("Введите имя первого человека name2:");
            name2 = scanner.nextLine();
        System.out.println("Введите фамилию первого человека famile2:");
            famile2 = scanner.nextLine();


        if (name1.equals(name2) && famile1.equals(famile2)) {
            System.out.println("Люди являются и тёзками, и однофамильцами");
        } else if (famile1.equals(famile2)) {
            System.out.println("Люди являются однофамильцами");
        } else if (name1.equals(name2)) {
            System.out.println("Люди являются тёзками");
        }
    }
}
