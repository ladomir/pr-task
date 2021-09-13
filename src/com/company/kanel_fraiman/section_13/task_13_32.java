package com.company.kanel_fraiman.section_13;

import java.util.Scanner;

public class task_13_32 {
    /*
    Для вычисления числа п используется формула Эйлера: л*л/6  равно сумме ряда  1/1*1+1/2*2+1/3*3+1/4*4
    Напишите класс, который принимает с клавиатуры число слагаемых в ряду Эйлера и вычисляет значение числа л.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n, a = 1;
        double sum = 0;

        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            sum+=1.0/(a*a);
            a+=1;
        }
        System.out.println(sum);
    }
}
