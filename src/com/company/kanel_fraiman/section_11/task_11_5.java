package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_5 {
    /*
    Дан программный блок (часть класса):
    int k = 1;
    int num =О;
    for (int i=l; i<=4; i++)
    {
    }
    int х = reader.nextlnt();
    if (х % 2 ==О) num = (numlO)+x;
    else
    {
    k = klO;
    num = num + (zk);
    };
    System.out.println( num );
    Постройте таблицу трассировки и укажите, что будет выведено на экран,
    если в качестве ввода были использованы следующие значения: 2,
    1, 3, 6.
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int k = 1;
        int num = 0;

        for (int i = 1; i <= 4; i++) {
            int x = scanner.nextInt();
            if (x % 2 == 0) num = (num * 10) + x;
            else {
                k = k * 10;
                num = num + k;
            };
        }
        System.out.println(num);
    }
}