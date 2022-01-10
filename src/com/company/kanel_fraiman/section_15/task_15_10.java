package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_10 {
    /*
    Напишите класс, который принимает с клавиатуры число для переменной Х,
    а затем дополнительную серию чисел, каждое из которых используется для уменьшения значения переменной Х.
    Ввод чисел должен производиться до тех пор, пока значение переменной Х остается положительным.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x, n;

        x = scanner.nextInt();

        n = x--;

        while (x > 0) {
            System.out.println(n + "\t");
            n++;
            n = x--;
        }
    }
}
