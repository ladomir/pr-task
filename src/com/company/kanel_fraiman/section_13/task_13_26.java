package com.company.kanel_fraiman.section_13;

public class task_13_26 {
    /*
        Напишите класс, который создает серию из 15 случайных чисел из диапазона -30 ... + 30.
        Класс будет выводить на экран только те числа серии, которые имеют такой же знак,
    как и предшествующее им число (значение О считать положительным для данного задания).
     */
    public static void main(String[] args) {

        int a = -30, b = 30;

        int [] array = new int [15];

        for (int i = 1; i <= array.length-1; i++) {

            array[i] = (int) (Math.random() * (b - a + 1) + a);

            if(array[i]>=0 && array[i-1]>=0){
                System.out.print(array[i] + "\t");
            } else if(array[i]<0 && array[i-1]<0){
                System.out.print(array[i] + "\t");
            }
        }
    }
}
