package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_9 {
    /*
    Напишите класс, который принимает с клавиатуры коэффициенты а и
    b линейного уравнения (уравнения первой степени - ах+b=О) и решает
    его, - то есть выводит на экран или корень (корни) уравнения, или соответствующее
    смыслу текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;
            System.out.println("Введите  коэффициент a:");
        a = scanner.nextInt();
            System.out.println("Введите  коэффициент b:");
        b = scanner.nextInt();

        if(a == 0 && b == 0 ) {
            System.out.println("Бесконечное множество решений");
        }
        if(a == 0 && b != 0 ) {
            System.out.println("Нет решения");
        }
        if(a != 0 ) {
            System.out.println(-b/a);
        }
    }
}
