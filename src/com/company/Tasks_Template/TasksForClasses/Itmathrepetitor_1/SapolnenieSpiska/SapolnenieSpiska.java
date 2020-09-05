package com.company.Tasks_Template.TasksForClasses.Itmathrepetitor_1.SapolnenieSpiska;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class SapolnenieSpiska {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Заполните список студентов");
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < 2; i++) {
                System.out.println("Фамилия:");
            String s = reader.readLine();
                System.out.println("Номер группы:");
            int a = Integer.parseInt(reader.readLine());
                System.out.println("Рейтинг:");
            double d = Double.parseDouble(reader.readLine());
                list.add(s + " - студент " + a + "-й группы со средним балом успеваемости - " + d + " .");
        }

            System.out.println("Список:");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(" - " + list.get(i));
        }

        System.out.print("\nОтсортированный список:");
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
    }
}
