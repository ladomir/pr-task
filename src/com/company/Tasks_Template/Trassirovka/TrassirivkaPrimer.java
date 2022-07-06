package com.company.Tasks_Template.Trassirovka;

import java.util.Scanner;

public class TrassirivkaPrimer {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Числовое значение, для которого необходимо найти факториал:");
        int a = 1, n;
            n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            a *= i;
            System.out.println(a);
        }
        System.out.printf("Факториал числа %d равен - %d", n, a);
    }
}
