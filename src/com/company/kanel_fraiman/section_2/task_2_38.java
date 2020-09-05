package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_38 {
    /*
    Напишите класс,
    который принимает с клавиатуры фамилию, имя и отчество,
    а затем выводит на экран инициалы (без пробела между инициалами).
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

        LFP = surname.charAt(0) + "" + name.charAt(0) + "" + patronymic.charAt(0) + "!";
        System.out.println(LFP);
        System.out.printf("%s%s%s!", surname.charAt(0), name.charAt(0), patronymic.charAt(0));
    }
}
