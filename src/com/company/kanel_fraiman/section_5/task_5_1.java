package com.company.kanel_fraiman.section_5;

public class task_5_1 {
    /*
    Переменные, используемые в задании, инициированы следующим образом:
    int a = 0, b = -3, c = 9;
    Заполните таблицы (в столбце Значение выражения следует написать false или true):
     */
    public static void main(String[] args) {
        int a = 0, b = -3, c = 9;
        boolean a1 = (a + b) * 3 == -9;
            System.out.println(a1);
        boolean a2 = b * a == c * (-a);
            System.out.println(a2);
        boolean a3 = c * b == b * (-1);
            System.out.println(a3);
        boolean a4 = (-b) * (-b) >= c;
            System.out.println(a4);
        boolean a5 = b / (-c) == 1 / b;
            System.out.println(a5);
        boolean b1 = 80 >= 80;
            System.out.println(b1);
        boolean b2 = b * b != a * c;
            System.out.println(b2);
        boolean b3 = b < a;
            System.out.println(b3);
        boolean b4 = b * b == c;
            System.out.println(b4);
        boolean b5 = (-c) * b == -b;
            System.out.println(b5);
    }
}
