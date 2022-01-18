package com.company.Tasks_Template.Series_massiv_stroka;

public class Massive_1 {
    /*
        Напишите класс, который генерирует серию из 50 случайных целых чисел из диапазона от -40 до +40,
    и определяет наибольшее и наименьшее значение в сгенерированной серии.
     */
    public static void main(String[] args) {

        int a = -40, b = 40, min= 0, max = 0;

        int [] array = new int [50];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * (b - a + 1) + a);

            System.out.print(array[i] + "\t");

            if(array[i] < min){
                min = array[i];
            }
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("\nмаксимальное число - " + max + "; минимальное - " + min);
    }
}
