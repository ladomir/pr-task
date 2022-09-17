package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_8 {
    /*
        Напишите метод, который принимает в качестве параметра число и возвращает:
            • -1 - в случае если число отрицательное;
            • О - в случае если число равно О;
            • 1 - в случае если число положительное.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;
        String c;

        a = scanner.nextInt();

        b = sign(a);
            System.out.println(b);
        c = signStr(a);
            System.out.println(c);
    }
    public static int sign(int temp) {
        if (temp < 0) {
            return -1;
        }
        if (temp==0) {
            return 0;
        }
        else {
            return 1;
        }
    }
    public static String signStr(int tempStr) {
        if (tempStr < 0) {
            return "Введённое число отрицательное";
        }
        if (tempStr==0) {
            return "Введённое число - ноль";
        }
        else {
            return "Введённое число положительное";
        }
    }
}
