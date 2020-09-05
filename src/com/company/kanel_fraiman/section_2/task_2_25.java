package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_25 {
    /*
    Напишите класс,
    который принимает с клавиатуры три целых числа,
    каждое из которых представляет собой размер одной из сторон параллелепипеда
    и выводит на экран следующие значения (каждое - в отдельной строке):
    объем, площадь каждой из граней, общую площадь и общий периметр.
    Прямоугольный параллелепипед:
    Объем - V = a * b * c;
    Площадь каждой из граней - a * b; b * c; c * a;
    Площадь поверхности - S = 2 * (a * b + a * c + b * c);
    Общий периметр -  P = 4 * (a + b + c);
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, V, sAB, sAC, sBC, S, P;
            System.out.println("Введите число a:");
        a = scanner.nextInt();
            System.out.println("Введите число b:");
        b = scanner.nextInt();
            System.out.println("Введите число c:");
        c = scanner.nextInt();
            System.out.printf("\nдлины ребер параллелепипеда равны %d, %d и %d;", a, b, c);
        V = a * b * c;
            System.out.println("\nобъем параллелепипеда равен " + V + ";");
        sAB = a * b;
        sBC = b * c;
        sAC = c * a;
            System.out.println("площади граней равны " + sAB + " , " + sAC + " и " + sBC + ";");
        S = 2 * (a * b + a * c + b * c);
            System.out.println("площадь поверхности параллелепипеда равна " + S + ";");
        P = 4 * (a + b + c);
            System.out.println("общий периметр параллелепипеда равен " + P + ";");
    }
}
