package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_20a {
/*
    Напишите метод, который принимает в качестве параметра целое число
    и выводит на экран в одну строку через пробел все делители этого числа (не считая 1 и самого числа).
    В случае если у числа нет ни одного делителя - на экран выводится соответствующее текстовое сообщение.
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;

        a = scanner.nextInt();

        System.out.println(secret(a));
    }

    public static String secret(int a) {
        int count = 0;
        String b;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                b = i + "\t";
                System.out.print(b);
                count++;
            }
        }
        if (count==0) {
            return "Нет";
        } else {
            return "";
        }
    }
}
