package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_3 {
    /*
    Дан программный блок (часть класса):
    int sum=O;
    for ( i=l; i<6; i++) {
        int k=reader.nextlnt();
            if (k> 100) sum=sum+k;
                System.out.println( sum );
    }
        73
        Постройте таблицу ручной прокрутки (таблицу трассировки) и укажите,
        что будет выведено на экран, если в качестве ввода были использованы
        следующие значения: 27, 130, 200, 72, 89.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        for (int  i = 1; i < 6; i++) {
                System.out.println("Введите значение k:");
            int k = scanner.nextInt();
                if (k > 100) sum = sum + k;
                    System.out.println(sum);
        }
    }
}
