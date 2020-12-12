package com.company.kanel_fraiman.section_10;

public class task_10_15 {
    /*
    Напишите класс, который генерирует и выводит на экран случайное
    число из диапазона от 250 до 746, а затем в отдельных строках, - наименьшую
    и наибольшую из цифр этого числа.
    Класс также должен проверить, были ли в генерированном числе одинаковые
    цифры, и вывести на экран соответствующее текстовое сообщение.
     */
    public static void main(String[] args) {
        int a, a1, a2, a3;

            a = (int)(Math.random()*497+250);
                System.out.printf("Сгенерированное число - %d!\n", a);

            a1 = a / 100;
            a2 = (a / 10) % 10;
            a3 = a % 10;

            if (a1 <= a2 && a1 <= a3) {
                System.out.printf("Наименьшая цифра числа %d - %d\n", a, a1);
            } else if (a2 <= a1 && a2 <= a3) {
                System.out.printf("Наименьшая цифра числа %d - %d\n", a, a2);
            } else if (a3 <= a1 && a3 <= a2) {
                System.out.printf("Наименьшая цифра числа %d - %d\n", a, a3);
            }

            if (a1 >= a2 && a1 >= a3) {
                System.out.printf("Наибольшая цифра числа %d - %d\n", a, a1);
            } else if (a2 >= a1 && a2 >= a3) {
                System.out.printf("Наибольшая цифра числа %d - %d\n", a, a2);
            } else if (a3 >= a1 && a3 >= a2) {
                System.out.printf("Наибольшая цифра числа %d - %d\n", a, a3);
            }

            if (a1 == a2 && a1 == a3 && a2 == a3) {
                System.out.printf("В сгенерированном числе %d одиниковы все цифры (%d)\n", a, a1);
            } else if (a1 == a2 || a1 == a3 || a2 == a3) {
                System.out.printf("В сгенерированном числе %d одиниковы две цифры\n", a);
            } else {
                System.out.printf("В сгенерированном числе %d нет одинаковых цифр\n", a);
            }
    }
}
