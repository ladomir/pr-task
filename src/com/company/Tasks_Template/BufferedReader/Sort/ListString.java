package com.company.Tasks_Template.BufferedReader.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ListString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите сетевые имена");

        ArrayList<String> list = new ArrayList<>();

        while (true){
            String s = reader.readLine();
            if(s.equals("end")){
                break;
            } else {
                list.add(s);
            }
        }

            System.out.print("Введённые имена:");
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
