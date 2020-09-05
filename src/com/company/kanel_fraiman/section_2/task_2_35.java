package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_35 {
    /*
    Напишите класс,
    который принимает с клавиатуры два строковых значения:
    ваше имя и вашу фамилию.
    Класс должен вывести на экран сообщение Вас зовут,
    а рядом с ним (через пробел) ваше имя и фамилию, введенные с клавиатуры.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = new String("Вас зовут ");
            System.out.println("Введите имя:");
        String name = scanner.nextLine();
            System.out.println("Введите фамилию:");
        String surname = scanner.nextLine();
            System.out.println(s + name + " " + surname + "!");
            System.out.printf("Вас зовут %s %s", name, surname + "!");
    }
}
