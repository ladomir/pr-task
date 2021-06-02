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
        System.out.println("Введите дату рождения ученика (\"в форме ХХ месяца ХХХХ года\"):");

        int n = 4, countZ = 0, countV = 0, countL = 0, countO = 0;

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String substring1 = "января";
            String substring2 = "февраля";
            String substring3 = "марта";
            String substring4 = "апреля";
            String substring5 = "мая";
            String substring6 = "июня";
            String substring7 = "июля";
            String substring8 = "августа";
            String substring9 = "сентября";
            String substring10 = "октября";
            String substring11 = "ноября";
            String substring12 = "декабря";
            if (s.contains(substring12) || s.contains(substring1) || s.contains(substring2)) {
                countZ++;
            } if (s.contains(substring3) || s.contains(substring4) || s.contains(substring5)) {
                countV++;
            } if (s.contains(substring6) || s.contains(substring7) || s.contains(substring8)) {
                countV++;
            } if (s.contains(substring9) || s.contains(substring10) || s.contains(substring11)) {
                countO++;
            }
        }
        System.out.printf("Количество учеников которые родились: \n\t- зимой - %d, \n\t- весной - %d, \n\t- летом - %d, \n\t- осенью - %d!", countZ, countV, countL, countO);

        /*
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

         */
    }
}
