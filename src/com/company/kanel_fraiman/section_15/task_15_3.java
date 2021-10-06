package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_3 {
    /*
    Дан фрагмент класса:
        inta= Math.abs(reader.nextlnt());
        int b=Math.abs(reader.nextlnt());
        while (а>О 11 Ь>О)
        {
                System.out.print(a%10+b%10);
            а=а/10;
            Ь=Ь/10;
        }
        1. Постройте таблицу трассировки и укажите,·что будет выведено на экран,
        если с клавиатуры были введены следующие значения: 99 и 698."
        2. Постройте таблицу трассировки и укажите, что будет выведено на экран,
        если с клавиатуры бьmи введены следующие значения: 153 и S.
        3. Приведите пример вводимых с клавиатуры значений, для которых
        цикл будет выполняться три раза, причем на экран каждый
        раз будет выводиться одно и то же число.
        4. Приведите пример вводимых с клавиатуры значений, для которых
        цикл будет выполняться три раза, причем на экран будут выводиться
        числа 7, 8 и 9.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a = Math.abs(scanner.nextInt());
        int b = Math.abs(scanner.nextInt());

        while (a > b || b > 0) {
            System.out.println(a%10+b%10);
            a = a / 10;
            b = b / 10;
        }
    }
}
