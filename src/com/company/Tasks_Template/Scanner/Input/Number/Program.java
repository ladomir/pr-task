package com.company.Tasks_Template.Scanner.Input.Number;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число:");
        int a = scanner.nextInt();
            System.out.println("Введённое число - " + a);

            System.out.printf("Введёное число - %s.", a);
    }
}
