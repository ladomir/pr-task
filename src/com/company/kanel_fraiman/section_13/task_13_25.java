package com.company.kanel_fraiman.section_13;

public class task_13_25 {
    /*
    Напишите класс, который создает серию из 25 случайных чисел из диапазона 10 ... 99.
    Класс будет выводить на экран только те числа серии, которые делятся без остатка на первое число в серии.
     */
    public static void main(String[] args) {

        int a = 10, b = 99;

        int [] array = new int [25];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * (b - a + 1) + a);

            if(array[i]%array[0]==0){
                System.out.print(array[i] + "\t");
            }
        }
    }
}
