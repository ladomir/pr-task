package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_33 {
    /*
    Напишите класс, который принимает с клавиатуры целое число (для переменной х) и
    выводит на экран серию значений: х, х2 , х3 ••• х0 до тех пор, пока очередное значение остается меньше 1000.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x, a, sum = 0;

        x = scanner.nextInt();

        a = x;
        while (a < 1000) {
            sum += a;
            System.out.println(a + "(сумма значений равна - " + sum + ")");
            a = a * x;
        }
    }
}
