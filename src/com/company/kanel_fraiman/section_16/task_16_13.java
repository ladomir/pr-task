package com.company.kanel_fraiman.section_16;

import java.util.Scanner;

public class task_16_13 {
    /*
        Два положительных трехзначных числа а и Ь называются «родственными»,
    если сумма делителей числа а равна Ь, а сумма делителей числа Ь равна а.
        Например, это числа 220 и 284, так как сумма делителей 220 равна 284, а сумма делителей 284 равна 220.
        Напишите класс, который принимает с клавиатуры положительное трехзначное число и
        ищет ближайшее к нему и большее него «родственное » число.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a = 0, b = 0, max = 0, maxSum = 0, max2 = 0;

        int s = scanner.nextInt();

        for (int i = s; i <= 1000000; i++) {
            int sum = 0;
//            System.out.print("\n" + i + ": ");
            for (int j = 1; j < i; j++) {
                if (i%j==0) {
                    sum += j;
//                    System.out.print(j + " ");
                }

            }
            if (sum==s) {
                System.out.println("Ближайшее (бОльшее) \"родственное\" число к числу " + s + " - " + i);
                        return;
            }
//            System.out.print(" - сумма делителей - " + sum);
        }
    }
}
