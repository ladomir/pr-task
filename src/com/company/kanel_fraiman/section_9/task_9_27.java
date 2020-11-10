package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_27 {
    /*
    Напишите класс, который принимает с клавиатуры два положительных
    числа - двузначное и четырехзначное - и проверяет, сколько раз двузначное
    число фигурирует как «внутреннее» по отношению к четырехзначному.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, b1, b2, b3, count = 0;
            System.out.println("Введите двухзначное число a:");
        a = scanner.nextInt();
            System.out.println("Введите четырёхзначное число b:");
        b = scanner.nextInt();

        b1 = b / 100;
        b2 = (b / 10) % 100;
        b3 = b % 100;

        if (a == b1) {
            count++;
        } if (a == b2) {
            count++;
        } if (a == b3) {
            count++;
        } else {
            count = 0;
        }
        System.out.println(count);
    }
}
