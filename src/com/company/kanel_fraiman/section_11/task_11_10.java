package com.company.kanel_fraiman.section_11;

public class task_11_10 {
    /*
    Напишите класс, который выводит на экран (в одну строку) 19 случайных
    чисел из дr1апазона «однозначные числа». Каждое значение, равное
    О, следует вывести на экран «В окружении» (вплотную к числу, перед
    ним и после него) символов«%» (процент).
     */
    public static void main(String[] args) {
        int a = 0, b = 9, i, c;

        for (i = 1; i <= 15; i++) {
            c = (int) (Math.random() * (b - a + 1) + a);
            if (c == 0) {
                System.out.print("%" + c + "%\t");
            } else {
                System.out.print(c + "\t");
            }
        }
    }
}
