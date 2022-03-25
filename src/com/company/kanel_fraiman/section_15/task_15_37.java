package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_37 {
    /*
    Напишите класс, который принимает с клавиатуры целое положительное число х.
    Класс должен найти наименьшее целое положительное двузначное число, сумма цифр которого равна х.
    Если такого двузначного числа не существует, следует вывести на экран соответствующее текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x, a, b;

        x = scanner.nextInt();

        a = 9;
        b = (a/10)+(a%10);

        while (b != 0 && a < 100) {
            a++;
            b = (a/10)+(a%10);
            if (b == x) {
                System.out.println("Наименьшее целое положительное двузначное число, сумма цифр которого равна х - " + a);
                break;
            }
        }
    }

    /*
    int a, b;

        a = 99;
        b = (a/10)*(a%10);

        while (b != 0 && a%b != 0) {
            a--;
            b = (a/10)*(a%10);
        }

            System.out.print(a);
    }
     */


}
