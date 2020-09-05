package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_36 {
    /*
    Напишите класс,
    который принимает с клавиатуры фамилию пассажира и город, в который он вылетает.
    Класс должен построить строковую переменную,
    которая будет содержать сообщение Пассажир ... вылетает в ... ,
    в котором вместо многоточий будут фигурировать фамилия пассажира и название города,
    в который он вылетает. Эту строковую переменную следует вывести на экран.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            System.out.println("Введите фамилию:");
        String surname = scanner.nextLine();
            System.out.println("Введите название города:");
        String city = scanner.nextLine();
        String s = "Пассажир " + surname + " вылетает в " + city + "!";
        System.out.println(s);
        System.out.printf("Пассажир %s вылетает в %s!", surname, city);
    }
}
