package com.company.kanel_fraiman.section_10;

public class task_10_14 {
    /*
    Напишите класс, который создает и выводит на экран 5 случайных целых
    чисел, заканчивающихся на ноль, и принадлежащих к диапазону
    двузначных чисел.
     */
    public static void main(String[] args) {
        int a;

        for(int i=0, n = 1; i<5; i++, n++) {
            a = 10*(int)(Math.random()*9+1);
                System.out.printf("%d-е сгенерированное число - %d!\n", n, a);
        }
    }
}
