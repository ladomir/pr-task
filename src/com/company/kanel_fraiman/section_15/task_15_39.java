package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_39 {
    /*
        Напишите класс, который принимает с клавиатуры целое положительное число и
    находит его наименьший делитель, отличный от 1.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b = 1, c;

            System.out.println("Ведите число: ");
        a = scanner.nextInt();

        while (b <= a) {
            b++;
            if (a%b==0) {
                System.out.printf("Наименьший делитель - %d", b);
                break;
            }
        }


    }
}
