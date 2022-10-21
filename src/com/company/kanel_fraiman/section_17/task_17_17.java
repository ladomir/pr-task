package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_17 {
    /*
    Напишите метод, который получает в качестве параметра целое число большее или равное 10.
    Метод возвращает число без его крайней левой цифры.
    Например, для параметра 1234 метод вернет 234, а для параметра 104 -4.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;

        a = scanner.nextInt();

        digitRight(a);
    }

    static void digitRight (int a) {
        int x = a;
        int count = 0;
        while (x > 0) {
            count++;
            x/=10;
        }
        int y = (int)Math.pow(10, count-1);
        System.out.printf("Число без крайней левой цифры - %d", a%y);
    }
}
