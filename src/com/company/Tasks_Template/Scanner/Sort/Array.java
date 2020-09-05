package com.company.Tasks_Template.Scanner.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имена:");

            String [] array = new String[3];

        for( int i = 0; i < 3; i++) {
            String s = scanner.nextLine();
                array[i] = s;
        }

        Arrays.sort(array);

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println();

        // сортировка в обратном порядке
        for(int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + "\t");
        }
    }
}
