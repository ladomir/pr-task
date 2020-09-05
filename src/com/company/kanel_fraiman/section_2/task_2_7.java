package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_7 {
    /*
    1. Укажите, какая информация будет выводиться на экран,
    если с клавиатуры введено значение 100? Объясните ответ.
    2. Укажите, какая информация будет выводиться на экран,
    если с клавиатуры введено значение -1? Объясните ответ.
     */

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a = reader.nextInt();
        System.out.print(a - 10 * a);
    }
}
