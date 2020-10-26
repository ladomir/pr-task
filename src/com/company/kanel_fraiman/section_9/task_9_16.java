package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_16 {
    /*
    Определим следующие периоды в течение суток: утро - с 6 (включая)
    до 10 (не включая) часов, день - с 10 (не включая) до 18 (включая}, вечер
    - с 18 (не включая) до 22 (включая}, ночь - с 22 (не включая) до
    6 часов следующего дня (не включая).
    Напишите класс, который принимает с клавиатуры целое число, которое
    должно указывать на определенный час в сутках, и выводит на экран
    сообщение, к какому периоду в сутках этот час относится. В случае
    если введенное значение не позволяет выполнить указанное действие,
    следует вывести на экран соответствующее текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
            System.out.println("Введите значение определённого часа суток a:");
        a = scanner.nextInt();

        if (a >= 6 && a < 10) {
            System.out.println("Утро");
        } else if (a >= 10 && a <= 18) {
            System.out.println("День");
        } else if (a > 18 && a <= 22) {
            System.out.println("Вечер");
        } else if (a > 22 && a <= 24 || a >= 1 && a < 6) {
            System.out.println("Ночь");
        } else {
            System.out.println("Error!");
        }
    }
}
