package com.company.kanel_fraiman.section_12;

import java.util.Scanner;

public class task_12_3 {
    /*
    Напишите класс, который принимает с клавиатуры 12 целых чисел
    и выводит на экран информацию о том, сколько из них были больше, чем первое число.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int count=0;
            System.out.println("Элементы массива:");
        int [] array = new int [12];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
                if(array[i]>array[0]){
                    count++;
                }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.printf("\nКоличество чисел, больших за первое - %d!", count);
    }
}
