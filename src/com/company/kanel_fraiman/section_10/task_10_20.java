package com.company.kanel_fraiman.section_10;

public class task_10_20 {
    /*
    Напишите класс, который генерирует и выводит на экран сначала случайное
    положительное однозначное число (цифру), а затем - случайное
    целое трехзначное.
    Класс должен определить разницу между сгенерированной цифрой и
    наибольшей цифрой сгенерированного случайного трехзначного числа.
     */
    public static void main(String[] args) {
        int a, b, b1, b2, b3, max, difference;

        a = (int) (Math.random() * 9 + 1);
            System.out.printf("Первое сгенерированное однозначное число - %d!\n", a);
        b = (int) (Math.random() * 900 + 100);
            System.out.printf("Второе сгенерированное трёхзначное число - %d!\n", b);

        b1 = b / 100;
        b2 = (b / 10) % 10;
        b3 = b % 10;

        if (b1 >= b2 && b1 >= b3) {
            max = b1;
                System.out.printf("Наибольшая цифра сгенерированного трёхзначного числа - %d\n", max);
        } else if (b2 >= b1 && b2 >= b3) {
            max = b;
                System.out.printf("Наибольшая цифра сгенерированного трёхзначного числа - %d\n", max);
        } else {
            max = b3;
                System.out.printf("Наибольшая цифра сгенерированного трёхзначного числа - %d\n", max);
        }

        System.out.printf("Разница между сгенерированной цифрой и " +
                " наибольшей цифрой сгенерированного случайного трехзначного числа составлет %d", a - max);
    }
}
