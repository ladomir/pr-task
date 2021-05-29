package com.company.kanel_fraiman.section_12;

import java.util.Arrays;
import java.util.Scanner;

public class task_12_12 {
    /*
    Напишите класс, который принимает для каждого из 1234 учеников района дату его рождения (день, месяц, год).
    Класс должен подсчитать и вывести на экран число детей, родившихся зимой, весной, летом и осенью.
     */
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
