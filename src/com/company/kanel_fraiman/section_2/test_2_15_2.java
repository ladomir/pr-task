package com.company.kanel_fraiman.section_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_2_15_2 {
    /*
    Напишите класс, который принимает с клавиатуры целое число
    и выводит на экран новое число, которое больше введенного с клавиатуры в 10 раз.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите число:");

        int a = Integer.parseInt(reader.readLine());

            System.out.println("Введённое число - " + a + ".");

            int b = a * 10;

        System.out.printf("Число, которое больше введенного с клавиатуры в 10 раз - %d.", b);
    }
}
