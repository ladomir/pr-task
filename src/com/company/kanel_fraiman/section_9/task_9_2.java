package com.company.kanel_fraiman.section_9;

public class task_9_2 {
    /*
    Дано составное условие с переменными типа int: (a>lO || b>lO)
    Для каких значений переменной а значение выражения всегда будет true?
     */
    public static void main(String[] args) {
        int a1 = 20, b1 = 31;
        boolean a;

        if (a1 > 10 || b1 > 10) {
            a = true;
        } else {
            a = false;
        }
        System.out.println("a = " + a);
        // true --> a1 > 10;

        int a2 = 6, b2= 100;
        boolean b;

        if (a2 > 10 || b2 > 10) {
            b = true;
        } else {
            b = false;
        }
        System.out.println("b = " + b);
        // true --> a1 > 10;

        int a3 = 28, b3= 8;
        boolean c;

        if (a3 > 10 || b3 > 10) {
            c = true;
        } else {
            c = false;
        }
        System.out.println("c = " + c);
        // true --> a1 > 10;

        int a4 = 10, b4= 10;
        boolean d;

        if (a4 > 10 || b4 > 10) {
            d = true;
        } else {
            d = false;
        }
        System.out.println("d = " + d);
        // true --> a1 > 10;

        int a5 = 10, b5= 1;
        boolean e;

        if (a5 > 10 || b5 > 10) {
            e = true;
        } else {
            e = false;
        }
        System.out.println("e = " + e);
        // true --> a1 > 10;
    }
}
