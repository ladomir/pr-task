package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_39 {
    /*
    Напишите класс,
    который принимает с клавиатуры фамилию, имя и отчество,
    а затем строит строковое значение по следующему правилу:
    первая буква имени, точка, первая буква отчества, точка, пробел, фамилия.
    Затем это строковое значение следует вывести на экран.
    Например, если с клавиатуры были введены значения
        Иван
        Иванович
        Иванов,
    то на экран следует вывести значение И. И. Иванов.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String LFP, surname, name, patronymic;
            System.out.println("Введите фамилию:");
        surname = scanner.nextLine();
            System.out.println("Введите имя:");
        name = scanner.nextLine();
            System.out.println("Введите отчество:");
        patronymic = scanner.nextLine();

        LFP = name.charAt(0) + ". " + patronymic.charAt(0) + ". " + surname + "!";
        System.out.println(LFP);
        System.out.printf("%s. %s. %s!", name.charAt(0), patronymic.charAt(0), surname);
    }
}
