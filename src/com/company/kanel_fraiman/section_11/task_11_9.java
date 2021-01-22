package com.company.kanel_fraiman.section_11;

public class task_11_9 {
    /*
    Напишите класс, который выводит на экран (в одну строку) 20 случайных
    чисел из диапазона 27". 73. Перед каждым значением, делящимся на 3
    без остатка, следует вывести (вплотную к числу) символ «#» (решетка).
     */
    public static void main(String[] args) {
        int a = 27, b = 73, i, c;

        for (i = 1; i <= 15; i++) {
            c = (int) (Math.random() * (b - a + 1) + a);
            if (c %3 == 0) {
                System.out.print("#" + c + "\t");
            } else {
                System.out.print(c + "\t");
            }
        }
    }
}
