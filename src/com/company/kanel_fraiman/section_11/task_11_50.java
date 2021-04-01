package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_50 {
    /*
    Напишите класс, который:
    • сначала вводит с клавиатуры целое положительное двузначное число
    (нет необходимости проверять соответствие введенного значения этому условию);
    • затем выводит на экран четырехзначные целые положительные числа,
    в которых и сумма двух первых цифр,
    и сумма двух последних цифр равны сумме цифр двузначного числа, введенного с клавиатуры.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, a1, a2, i1, i2, i3, i4;

            System.out.println("Введите двухзначное число a:");
        a = scanner.nextInt();

        a1 = a / 10;
        a2 = a % 10;
            System.out.println("Отображение чисел: ");
        for (int i = 1000; i < 10000; i++) {
            i1 = i / 1000;
            i2 = (i%1000)/100;
            i3 = (i%100)/10;
            i4 = i % 10;
            if ((i1+i2)==(a1+a2)&&(i3+i4)==(a1+a2)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nВсе числа отображены.");
    }
}
