package com.company.kanel_fraiman.section_4;

import java.util.Scanner;

public class task_4_18 {
    /*
    Назовем «линейным сдвигом числа влево» операцию,
    при которой его цифры перемещаются на одну позицию влево
    (единицы - на место десятков, десятки - на место сотен, сотни - на место тысяч и так далее)
    - при этом первая цифра удаляется из числа, а на место единиц записывается ноль.
    Например, из числа 1234 после такой операции получается число 2340.
    Напишите класс, который принимает с клавиатуры трехзначное число
    и строит новое число, полученное «линейным сдвигом влево».
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x, xlast, y;
            System.out.println("Введите четырёхзначное число:");
        x = scanner.nextInt();
            System.out.println("Введённое четырёхзначное число - " + x);

        xlast = x % 1000;
        y = xlast * 10;


        System.out.println("x = " + x);
        System.out.println("xlast = " + xlast);
        System.out.println("y = " + y);

        System.out.println("Четырёхзначное число после линейного сдвига числа влево - " + y);
        System.out.printf("Четырёхзначное число после линейного сдвига числа влево - %d ", y);
    }
}
