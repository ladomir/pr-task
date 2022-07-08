package com.company.kanel_fraiman.section_16;

public class task_16_5 {
    /*
    Напишите класс, который выводит на экран:
    в первой строке все четные двузначные числа,
    во второй строке - двузначные числа, делящиеся на 3 без остатка,
    в третьей строке - двузначные числа, делящиеся на 4 без остатка, и так далее.
     */
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
                System.out.print("Числа, которые делятся без остатка на " + i + ": ");
            for (int j = 10; j < 100; j++) {
                if (j%i==0) {
                    System.out.print(j + "\t");
                }
            }
            System.out.println();
        }
    }
}
