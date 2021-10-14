package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_8 {
    /*
    Напишите класс, который принимает с клавиатуры значения, пока их сумма остается меньше 150.
    По окончании ввода следует вывести на экран информацию о количестве введенных значений и их сумме.
    */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, n = 0, sum = 0;

        a = scanner.nextInt();

        while (sum < 150) {
            System.out.println("\n\t-\t" + a);
            n++;
            sum+=a;
            a = scanner.nextInt();
        }
        System.out.printf("\nКоличество значений, которое было введено - %d, сумма их значений равна - %d!", n, sum);
    }
}
