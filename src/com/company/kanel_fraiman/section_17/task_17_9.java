package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_9 {
    /*
        Напишите метод, который получает в качестве параметра два числа (А и В)
    и выводит на экран все четные числа из диапазона А ... В.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, c;

        a = scanner.nextInt();
        b = scanner.nextInt();

        secret(a, b);
    }
    static void secret(int a, int b) {
        if (a > b) {
            if (b %2 == 0) {
                for (int i = b; i <= a; i += 2) {
                    System.out.print(i + "\t");
                }
            } else {
                for (int i = b+1; i <= a; i += 2) {
                    System.out.print(i + "\t");
                }
            }
        } else if (a < b) {
            if (a %2 == 0){
                for (int i = a; i <= b; i += 2) {
                    System.out.print(i + "\t");
                }
            } else {
                for (int i = a+1; i <= b; i += 2) {
                    System.out.print(i + "\t");
                }
            }
        } else {
            System.out.println("Введённые числа равны");
        }
    }
}
