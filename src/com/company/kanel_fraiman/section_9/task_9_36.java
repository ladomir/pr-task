package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_36 {
    /*
    Напишите класс, который принимает с клавиатуры два строковых значения,
    каждое из которых содержит имя человека, и проверяет, являются
    ли эти люди тезками. По результатам проверки следует вывести
    на экран соответствующее сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s1, s2;
            System.out.println("Введите имя человека s1:");
        s1 = scanner.nextLine();
            System.out.println("Введите имя человека s2:");
        s2 = scanner.nextLine();

        if (s1.equals(s2)) {
            System.out.println("Люди являются тёзками");
        } else  {
            System.out.println("Люди НЕ являются тёзками");
        }
    }
}
