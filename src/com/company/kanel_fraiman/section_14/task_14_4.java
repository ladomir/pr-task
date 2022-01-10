package com.company.kanel_fraiman.section_14;

public class task_14_4 {
    /*
        Напишите класс, который генерирует серию из 50 случайных целых чисел из диапазона от -40 до +40,
    и определяет наибольшее из положительных значений в сгенерированной серии,
    а также наименьшее из отрицательных значений в сгенерированной серии.
        В случае если одно из нужных значений невозможно определить (почему?},
    следует вывести на экран соответствующее текстовое сообщение.
     */
    public static void main(String[] args) {

        int a = -40, b = 40, min= 0, max = 0;

        int [] array = new int [50];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * (b - a + 1) + a);

            System.out.print(array[i] + "\t");

            if(array[i] < 0 && array[i] < min){
                min = array[i];
            }
            if(array[i] > 0 && array[i]> max){
                max = array[i];
            }
        }
        System.out.println();
        if (min == 0) {
            System.out.println("Нельзя");
        } else {
            System.out.println("\nМинимальное из отрицательных чисел - " + min);
        }
        if (max == 0) {
            System.out.println("Нельзя");
        } else {
            System.out.println("\nМаксимальное из положительных чисел - " + max);
        }
    }
}
