package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_6 {
    /*
    Напишите класс, который выполняет следующие действия:
    1. Принимает с клавиатуры два целых числа.
    2. Создает и выводит на экран 20 случайных чисел в диапазоне от
    первого, только что введенного с клавиатуры, значения, - до второго
    значения, также введенного с клавиатуры перед этим. Можно
    исходить из предположения, что первое из вводимых чисел
    всегда меньше второго.
    Например, если с клавиатуры были введены значения -8 и 17, то класс
    создает 20 случайных чисел в диапазоне от -8 до 17 (включая сами эти
    значения).
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, i, c;

        System.out.println("Введите первое число a:");
            a = scanner.nextInt();
        System.out.println("Введите второе число b");
            b = scanner.nextInt();

        System.out.printf("Первое введённое число - %d, второе - %d\n", a, b);

        for (i = 1; i <= 20; i++) {
                c = (int) (Math.random() * (b-a+1)+a);
            System.out.print(c + "\t");
        }
    }
}
