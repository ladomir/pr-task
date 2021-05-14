package com.company.kanel_fraiman.section_12;

import java.util.Scanner;

public class task_12_4 {
    /*
    Напишите класс, который принимает с клавиатуры 17 целых чисел и выводит на экран информацию о том,
    сколько из них были больше, чем предыдущее число.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int count=0;
            System.out.println("Элементы массива:");
        int [] array = new int [17];
        for (int i = 1; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if(array[i]>array[i-1]){
                count++;
            }
        }
        System.out.println();
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.printf("\nКоличество чисел, больших, чем предыдущее - %d!", count);
    }
}
