package com.company.kanel_fraiman.section_13;

import java.util.Scanner;

public class task_13_27 {
    /*
        Напишите класс, который принимает с клавиатуры три целых числа и проверяет,
    являются ли они тремя последовательными членами арифметической прогрессии.
        В случае если являются, класс должен вывести на экран еще 14 следующих членов этой же прогрессии;
    в ином случае - вывести на экран соответствующее текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, c, d1, d2;
            System.out.println("Введите значения a, b, c: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        d1 = b -a;
        d2 = c - b;

        if (d1!=d2) {
            System.out.println(" Введённые значения НЕ являются элементами арифметической прогресси");
        } else {
            for (int i = 0; i <=14; i++) {
                c+=d2;
                System.out.print(c + "\t");
            }
        }
    }
}
