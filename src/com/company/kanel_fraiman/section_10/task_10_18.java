package com.company.kanel_fraiman.section_10;

public class task_10_18 {
    /*
    Напишите класс, который генерирует и выводит на экран 3 случайных
    целых положительных трехзначных числа.
    Затем класс должен определить разницу между наибольшим и наименьшим
    из сгенерированных чисел и вывести ее на экран вместе с
    соответствующим текстовым сообщением.
     */
    public static void main(String[] args) {
        int a, b, c, max, min, difference;

        a = (int) (Math.random() * 900 + 100);
            System.out.printf("Первое сгенерированное трёхзначное число - %d!\n", a);
        b = (int) (Math.random() * 900 + 100);
            System.out.printf("Второе сгенерированное трёхзначное число - %d!\n", b);
        c = (int) (Math.random() * 900 + 100);
            System.out.printf("Третье сгенерированное трёхзначное число - %d!\n", c);

        if (a >= b && a >= c) {
            max = a;
                System.out.printf("Наибольшее из сгенерированных чисел - %d\n", max);
        } else if (b >= a && b >= c) {
            max = b;
                System.out.printf("Наибольшее из сгенерированных чисел - %d\n", max);
        } else {
            max = c;
                System.out.printf("Наибольшее из сгенерированных чисел - %d\n", max);
        }

        if (a <= b && a <= c) {
            min = a;
                System.out.printf("Наименьшее из сгенерированных чисел - %d\n", min);
        } else if (b <= a && b <= c) {
            min = b;
                System.out.printf("Наименьшее из сгенерированных чисел - %d\n", min);
        } else {
            min = c;
                System.out.printf("Наименьшее из сгенерированных чисел - %d\n", min);
        }

            difference = max - min;
        System.out.printf("Разница между наибольшим и наименьшим из сгенерированных чисел составляет %d", max-min);
    }
}
