package com.company.Tasks_Template.BufferedReader.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class List {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число");

        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true){
            int a = Integer.parseInt(reader.readLine());
            if(a==0){
                break;
            } else {
                list.add(a);
            }
        }

        System.out.print("Введённые числа:");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }

        System.out.print("\nОтсортированный список:");
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }

        System.out.print("\nОтсортированный список в обратном порядке:");
        Collections.reverse(list);
        for(int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
    }
}
