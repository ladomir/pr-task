package com.company.kanel_fraiman.section_10;

public class task_10_9 {
    /*
    Напиши класс, представляющий версию игры из предыдущего задания
    - только в этом случае компьютер должен играть сам с собой, то
    есть и первое значение должно не вводиться с клавиатуры, а генерироваться
    классом.
     */
    public static void main(String[] args) {

        int a, b;

        a = (int) (Math.random() * 100);

            System.out.printf("Определённое компьютером число - центр диапазона равно %d\n", a);

        b = (int) (Math.random() * (((a + 5) - (a - 5)) + 1) + (a - 5));

            System.out.printf("Определённое компьютером число равно %d\n", b);

        if (b == a) {
            System.out.println("Угадано!");
        }
        if (b > a) {
            System.out.println("Слишком большое!");
        }
        if (b < a) {
            System.out.println("Слишком маленькое!");
        }
    }
}
