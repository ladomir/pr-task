package com.company.kanel_fraiman.section_5;

import java.util.Scanner;

public class task_5_6 {
    /*
    Выберите значение для ввода в переменную а и переменную b, так,
    чтобы было выведено сообщение FALSE. Объясните свой выбор.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
            System.out.println("Введите значение a:");
        a = scanner.nextInt();
            System.out.println("Введите значение b:");
        b = scanner.nextInt();

        if((a < b) || (a < 100)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE"); // при значениях a > b и a > 100
        }
    }
}
