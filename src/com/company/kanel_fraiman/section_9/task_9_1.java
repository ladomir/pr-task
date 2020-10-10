package com.company.kanel_fraiman.section_9;

public class task_9_1 {
    /*
    Дано составное условие с переменными типа int: (a>lO && b>lOO)
    Для каких значений переменной а значение выражения всегда будет false?
     */
    public static void main(String[] args) {
        int a1 = 20, b1 = 231;
        boolean a;

        if (a1 > 10 && b1 > 100) {
            a = true;
        } else {
            a = false;
        }
            System.out.println("a = " + a);
        // false --> a1 <= 10;

        int a2 = 6, b2= 131;
        boolean b;

        if (a2 > 10 && b2 > 100) {
            b = true;
        } else {
            b = false;
        }
        System.out.println("b = " + b);
        // false --> a2 <= 10;

        int a3 = 28, b3= 87;
        boolean c;

        if (a3 > 10 && b3 > 100) {
            c = true;
        } else {
            c = false;
        }
        System.out.println("c = " + c);
        // false --> a3 <= 10;

        int a4 = 10, b4= 10;
        boolean d;

        if (a4 > 10 && b4 > 100) {
            d = true;
        } else {
            d = false;
        }
        System.out.println("d = " + d);
        // false --> a4 <= 10;

        int a5 = 10, b5= 31;
        boolean e;

        if (a5 > 10 && b5 > 100) {
            e = true;
        } else {
            e = false;
        }
        System.out.println("e = " + e);
        // false --> a5 <= 10;
    }

}
