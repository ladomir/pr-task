package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_5 {
    /*
    Напишите класс, который принимает с клавиатуры числа, пока не будет введено значение 999.
    Класс должен подсчитать, сколько значений было введено с клавиатуры (не считая значения 999), и вывести эту информацию на экран.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, n = 0;

        a = scanner.nextInt();

        while (a!=999) {
                System.out.print(a);
                n++;
            a = scanner.nextInt();
        }
        System.out.printf("Количество значений, которое было введено - %d!", n);
    }
}
