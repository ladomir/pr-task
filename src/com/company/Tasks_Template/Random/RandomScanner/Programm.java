package com.company.Tasks_Template.Random.RandomScanner;

import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.println("Введите число: ");
        int n = in.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*5);
                System.out.print(array[i] + "\t");
        }
    }
}
