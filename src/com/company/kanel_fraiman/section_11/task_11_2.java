package com.company.kanel_fraiman.section_11;

public class task_11_2 {
    /*
    Даны описания заголовков циклов. Напишите эти заголовки на языке Java.
	1. Цикл выполняется 17 раз, начальное значение переменной-счетчика равно 12.
	2. Цикл выполняется 7 раз, конечное значение переменной-счетчика равно 45.
	3. Цикл выполняется 300 раз, начальное значение переменной-счетчика равно 1, ее значение должно увеличиваться каждый раз на 5.
	4. Цикл выполняется 20 раз, начальное значение переменной-счетчика равно 1, ее значение должно уменьшаться каждый раз на 10.
	5. Цикл выполняется 300 раз, конечное значение переменной-счетчика равно 1, ее значение должно уменьшаться каждый раз на 1.
	6. Цикл выполняется 25 раз, конечное значение переменной-счетчика равно 1, ее значение должно уменьшаться каждый раз на 7.
     */
    public static void main(String[] args) {
        int a = 12, b = 28, c = 1;
        for (int i = 12; i < 29; i++) {
            System.out.println(i);
        }
        System.out.printf("Переменная-счётчик будет принимать значения от %d до %d, увеличиваясь на %d, т.к. итерация равна i++\n", a, b, c);

        int a2 = 39, b2 = 45, c2 = 1;
        for (int i = 39; i <= 45; i++) {
            System.out.println(i);
        }
        System.out.printf("Переменная-счётчик будет принимать значения от %d до %d, увеличиваясь на %d, т.к. итерация равна i++\n", a2, b2, c2);

        int i, n, a3 = 5, b3;
        for (n = 1, i = 1; n <= 300; n++, i+=5) {
            System.out.println(n + " - " + i);
        }
        b3 = i;
        System.out.printf("Переменная-счётчик будет принимать значения от 1 до %d, увеличиваясь на %d, т.к. итерация равна i+=5\n", b3, a3);

        int j, k, a4 = 10, b4;
        for (k = 1, j = 1; k <= 20; k++, j-=10) {
            System.out.println(k + " - " + j);
        }
        b4 = j;
        System.out.printf("Переменная-счётчик будет принимать значения от 1 до %d, уменьшаясь на %d, т.к. итерация равна j-=10\n", b4, a4);

        int u, l, a5 = 1, b5;
        for (l = 1, u = 300; l <= 300; l++, u--) {
            System.out.println(l + " - " + u);
        }
        b5 = u;
        System.out.printf("Переменная-счётчик будет принимать значения от 300 до %d, уменьшаясь на %d, т.к. итерация равна u--\n", b5, a5);

        int e, m, a6 = 1, b6;
        for (m = 1, e = (25*7+1); m <= 25; m++, e-=7) {
            System.out.println(m + " - " + e);
        }
        b6 = e;
        System.out.printf("Переменная-счётчик будет принимать значения от 176 до %d, уменьшаясь на %d, т.к. итерация равна e-=7\n", b6, a6);
    }
}