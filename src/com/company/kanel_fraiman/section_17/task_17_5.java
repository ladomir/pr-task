package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_5 {
    /*
    static int secret(int x, int y) {
        return (х + у - Math.abs(x-y))/ 2;
    }

    1. Какое значение возвращает метод, если его вызов выглядит следующим образом:
            x=secret(8,12)?
    Обоснуйте свой ответ.
    2. Какое значение возвращает метод, если его вызов выглядит следующим образом:
            x=secret(l0,6)?
    Обоснуйте свой ответ.
    3. Какое значение возвращает метод, если его вызов выглядит следующим образом:
            x=secret(secret(8,12), secret(l0,6))?
    Обоснуйте свой ответ.
    4. Приведите пример параметров, для которых метод будет возвращать значение О.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, x, y;

        x = scanner.nextInt();
        y = scanner.nextInt();

        a = secret(x, y);
        System.out.println(a);
    }
    static int secret(int x, int y) {
        return (x + y - Math.abs(x-y))/ 2;
    }
}
