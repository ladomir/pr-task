package com.company.Tasks_Template.BufferedReader.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите количество сетевых имен");

        int a = Integer.parseInt(reader.readLine());

        String sa[] = new String[a];

            System.out.println("Введите сетевыe именa");

        for(int i = 0; i < sa.length; i++) {
            String s = reader.readLine();
            sa[i] = s;
        }

        Arrays.sort(sa);

        for (int i = 0; i < sa.length; i++) {
            System.out.print(sa[i] + "\t");
        }

        System.out.println();

        // сортировка в обратном порядке
        for (int i = sa.length-1; i >= 0; i--) {
            System.out.print(sa[i] + "\t");
        }
    }
}
