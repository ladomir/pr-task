package com.company.Tasks_Template.Scanner.Input.String;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя:");
        String name = scanner.nextLine();
            System.out.println("Введённое имя - " + name);

            System.out.printf("Введённое имя - %s.", name);
    }
}
