package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_4 {
    /*
        Напишите класс, который принимает с клавиатуры числа, пока не будет
    введено значение О. Для каждого введенного с клавиатуры положительного
    числа класс должен выводить на экран текст Плюс, для
    каждого отрицательного - текст Минус.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a;

        a = scanner.nextInt();

        while (a!=0) {
            if (a > 0) {
                System.out.print("Плюс");
            } else {
                System.out.println("Минус");
            }
            a = scanner.nextInt();
        }
    }
}
