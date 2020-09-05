package com.company.Tasks_Template.BufferedReader.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int array[] = new int[5];

        for( int i = 0; i < 5; i++) {
            int n = Integer.parseInt(reader.readLine());
            array[i] = n;
        }

        Arrays.sort(array);

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        // сортировка в обратном порядке
        for(int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
