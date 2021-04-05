package com.company.kanel_fraiman.section_11;

import java.util.Scanner;

public class task_11_53 {
    /*
    Напишите класс, который принимает с клавиатуры два целых положительных исла: N и М
    (можно считать, что M<N).
    Класс должен вывести на экран серию М+(М+ 1)+(М+2)+ ... +N.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N, M;

            System.out.println("Введите целое положительное число N:");
        N = scanner.nextInt();
            System.out.println("Введите целое положительное число M<N:");
        M = scanner.nextInt();
            System.out.println("Отображение чисел: ");
        for (int i = M; i <= N; i++) {
            if(i!=N) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + "!");
            }
        }
        System.out.println("\nВсе числа отображены.");
    }
}
