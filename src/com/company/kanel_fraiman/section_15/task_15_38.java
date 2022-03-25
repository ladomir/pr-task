package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_38 {
    /*
    Напишите класс, который находит наибольшее положительное двузначное число,
    которое делится на произведение своих цифр.
     */

    public static void main(String[] args) {

        int a, b;

        a = 99;
        b = (a/10)*(a%10);

        while (b != 0 && a%b != 0) {
            a--;
            b = (a/10)*(a%10);
        }

            System.out.print(a);
    }
}
