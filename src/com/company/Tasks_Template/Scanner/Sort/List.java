package com.company.Tasks_Template.Scanner.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Заполните список:");

        ArrayList<String> list = new ArrayList<>();
        for (int a = 0; a < 3; a++) {
            String s = scanner.nextLine();
                list.add(s);
        }

        System.out.println("Мои сетевые имена:");
        for (int a = 0; a < list.size(); a++) {
            System.out.println("\t" + list.get(a));
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
