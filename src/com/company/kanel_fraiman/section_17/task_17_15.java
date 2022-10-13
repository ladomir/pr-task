package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_15 {
    /*
        Напишите метод, который принимает в качестве параметра целое число и возвращает значение true,
    если это число простое; в ином случае метод возвращает значение false.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;

        a = scanner.nextInt();

        dividers(a);
    }

    static void dividers (int a) {
        int count = 0;
        for (int j = 1; j < a; j++) {
            if (a%j==0) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
