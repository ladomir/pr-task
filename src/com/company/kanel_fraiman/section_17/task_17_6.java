package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_6 {
    /*
    static int doSomething (int num) {
        int s, n, temp;
        s = 0;
        n = 0;
        temp = num;
        while(temp > 0) {
            s = s + (temp % 2);
            temp = temp / 10;
            n = n + 1;
        }
        return n-s;
    }
        1. Что будет выведено на экран, если вызов метода выглядит следующим образом:
                        System.out.println( doSomething (1274))?
           Обоснуйте свой ответ.
        2. Приведите пример параметров, для которых метод будет возвращать значение 3.
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;

        a = scanner.nextInt();

        b = doSomething(a);
        System.out.println(b);
    }

    static int doSomething (int num) {
        int s, n, temp;
        s = 0;
        n = 0;
        temp = num;
        while(temp > 0) {
            s = s + (temp % 2);
            temp = temp / 10;
            n = n + 1;
        }
        return n-s;
    }
}
