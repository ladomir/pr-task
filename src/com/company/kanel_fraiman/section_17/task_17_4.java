package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_4 {
    /*
    1. Какое значение возвращает метод, если его вызов выглядит следующим образом:
            x=what(1235,3)?
    Обоснуйте свой ответ.
    2. Приведите пример параметров, для которых метод будет возвращать значение 2.
    3. Приведите пример параметров, для которых метод будет возвращать значение 0.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, x, y;

        x = scanner.nextInt();
        y = scanner.nextInt();

        a = what(x, y);
        System.out.println(a);
    }
    static int what (int num, int d)
    {
        int g = 0;
        if(num > 99)
            num=num%100;
        if(num % 10 == d) {
            g++;
        }
        if (num /10 == d) {
            g++;
        }
        return g;
    }
}
