package com.company.kanel_fraiman.section_2.t_2_16;

import static com.company.kanel_fraiman.section_2.t_2_16.s_scanner.scanner;

public class main {
    public static void main(String[] args) {
            System.out.println("Введите число:");
        int a = scanner.nextInt();
            System.out.println("Введённое число - " + a + ".");
        int b = a + 6;
            System.out.printf("Число, больше введенного с клавиатуры на 6, - %d.\n", b);
        int c = a - 12;
            System.out.printf("Число, меньше введенного с клавиатуры на 12, - %d.", c);
    }
}
