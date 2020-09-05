package com.company.Tasks_Template.Random.RandomBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите количество элементов массива");
        int a = Integer.parseInt(reader.readLine());

        int[] array = new int[a];

        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10);
                System.out.print(array[i] + "\t");
        }

        System.out.println();

        Arrays.sort(array);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }

        System.out.println();

        // сортировка в обратном порядке
        for(int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + "\t");
        }
    }
}
