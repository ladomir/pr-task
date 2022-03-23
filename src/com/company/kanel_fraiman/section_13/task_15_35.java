package com.company.kanel_fraiman.section_13;

import java.util.Scanner;

public class task_15_35 {
    /*
    Напишите класс, который принимает с клавиатуры целое положительное число и
    строит из него число с обратным порядком цифр. Новое значение следует вывести на экран.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x, a;

        x = scanner.nextInt();

        while (x > 0) {
            a = x%10;
            x/=10;
            System.out.print(a);
        }
    }
}
