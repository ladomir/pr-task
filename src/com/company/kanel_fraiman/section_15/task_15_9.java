package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_9 {
    /*
    Напишите класс, который принимает с клавиатуры целое число, а затем выводит на экран последующие ему целые числа,
    пока сумма этих чисел не превышает квадрата введенного числа.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, n, sum = 0;

        a = scanner.nextInt();

        n = a + 1;
        sum+=n;

        while (sum <= a*a) {
            System.out.println(n + "(" + sum + ")");
            n++;
            sum+=n;
        }
    }
}
