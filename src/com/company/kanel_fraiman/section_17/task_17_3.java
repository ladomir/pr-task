package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_3 {
    /*
    1. Какое значение возвращает метод, если его вызов выглядит следующим образом:
            x=what(7,3)?
    Обоснуйте свой ответ.
    2. Какое значение возвращает метод, если его вызов выглядит следующим образом:
            x=what(14,35)?
    Обоснуйте свой ответ.
    3. Приведите пример параметров, для которых метод будет возвращать значение 2.
    3. Как изменятся ответы на пункты 1 и 2, если в методе вместо return а будет записано return b?.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, x, y;

        x = scanner.nextInt();
        y = scanner.nextInt();

        a = what(x, y);
        System.out.println(a);
    }
    static int what (int a, int b)
    {
        while (a!=b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
