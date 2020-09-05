package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_20 {
    /*
    Назовем «сдвигом числа влево по кругу» операцию,
    при которой его цифры перемещаются на одну позицию влево
    (единицы - на место десятков, десятки - на место сотен, сотни - на место тысяч и так далее)
    - при этом первая цифра перемещается на место единиц.
    Например, из числа 1234 получается число 2341.
    Напишите класс, который принимает с клавиатуры трехзначное число
    и строит новое число, полученное «сдвигом влево по кругу».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x, xfirst, xlast, y;
            System.out.println("Введите четырёхзначное число:");
        x = scanner.nextInt();
            System.out.println("Введённое четырёхзначное число - " + x);

        xfirst = x / 1000;
        xlast = x % 1000;
        y = xlast * 10 + xfirst;


        System.out.println("x = " + x);
        System.out.println("xfirst = " + xfirst);
        System.out.println("xlast = " + xlast);
        System.out.println("y = " + y);

        System.out.println("Четырёхзначное число после сдвига влево по кругу - " + y);
        System.out.printf("Четырёхзначное число после сдвига влево по кругу - %d ", y);
    }
}
