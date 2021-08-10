package com.company.kanel_fraiman.section_13;

public class task_13_24 {
    /*
        Напишите класс, который создает серию из 20 случайных чисел из диапазона 30 ... 49.
        Числа в серии следует вывести на экран в одну строку следующим образом:
    • перед значениями, которые меньше первого в серии, вывести знак «минус»;
    • перед значениями, которые больше первого в серии, вывести знак «ПЛЮС».
     */

    public static void main(String[] args) {

        int a = 30, b = 49;

        int [] array = new int [20];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a + 1) + a);

            if(array[i]>array[0]){
                System.out.print("+" + array[i] + "\t");
            } else {
                System.out.print("-" + array[i] + "\t");;
            }
        }
    }
}
