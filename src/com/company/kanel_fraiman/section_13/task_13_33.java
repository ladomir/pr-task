package com.company.kanel_fraiman.section_13;

import java.util.Scanner;

public class task_13_33 {
    /*
        Для вычисления числа п используется формула Махадевы-Эйлера: л=4/1-4/3+4/5-4/7+...
        Напишите класс, который принимает с клавиатуры число слагаемых в ряду Махадевы-Эйлера и вычисляет значение числа л.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n, a = 1;
        double sum = 0;

        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if(i%2==0) {
                sum-=4.0/a;
            } else {
                sum+=4.0/a;
            }
            a+=2;
        }
        System.out.println(sum);
    }
}
