package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_19 {
    /*
    Напишите класс, который принимает с клавиатуры два положительных
    числа, которые должны быть длинами двух смежных сторон прямоугольника
    или квадрата. Класс должен определить, к какой из указанных
    двух фигур относятся введенные значения сторон.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
            System.out.println("Введите длину стороны прямоугольника или квадрата a:");
        a = scanner.nextInt();
            System.out.println("Введите длину стороны прямоугольника или квадрата b:");
        b = scanner.nextInt();

        if (a == b) {
            System.out.println("Введённые значеня сторон относятся к квадрату");
        } else {
            System.out.println("Введённые значеня сторон относятся к прямоугольнику");
        }
    }
}
