package com.company.kanel_fraiman.section_11;
public class task_11_1 {
    /*
    Даны несколько заголовков цикла for. Для каждого из них:
    • укажите, какие значения будет принимать переменная-счетчик;
    • сколько раз выполняется цикл;
    • объясните свой ответ.
    1. for (int i=l; i<=34; i++)
    2. for (int i=l5; i<=34; i++)
    3. for (int i=21; i<34; i++)
    4. for (int i=l; i<=34; i+=3)
    5. for (int i=17; i<77; i+=lO)
    6. for (int i=l; i<=9; i+=2)
    7. for (int i=19; i>=l; i--)
    8. for (int i= 19; i>=9; i--)
    9. for (int i=29; i> 10; i--)
    10. for (int i=9; i>=l; i-=4)
    11. for (int i=99; i>=O; i-=10)
     */
    public static void main(String[] args) {
        int a = 1, b = 34, c = 1;
        for (int i = 1; i <= 34; i++) {
            System.out.println(i);
        }
        System.out.printf("Переменная-счётчик будет принимать значения от %d до %d, увеличиваясь на %d, т.к. итерация равна i++", a, b, c);
        System.out.printf("Переменная-счётчик будет принимать значения от %d до %d, увеличиваясь на %d, т.к. итерация равна i++\n", a, b, c);

        int a2 = 15, b2 = 34, c2 = 1;
        for (int i = 15; i <= 34; i++) {
            System.out.println(i);
        }
        System.out.printf("Переменная-счётчик будет принимать значения от %d до %d, увеличиваясь на %d, т.к. итерация равна i++\n", a2, b2, c2);

        int a3 = 21, b3 = 33, c3 = 1;
        for (int i = 21; i < 34; i++) {
            System.out.println(i);
        }
        System.out.printf("Переменная-счётчик будет принимать значения от %d до %d, увеличиваясь на %d, т.к. итерация равна i++\n", a3, b3, c3);

        int a4 = 1, b4 = 34, c4 = 3;
        for (int i = 1; i <= 34; i+=3) {
            System.out.println(i);
        }
        System.out.printf("Переменная-счётчик будет принимать значения от %d до %d, увеличиваясь на %d, т.к. итерация равна i+=3\n", a4, b4, c4);

        int a5 = 17, b5 = 67, c5 = 10;
        for (int i = 17; i < 77; i+=10) {
            System.out.println(i);
        }
        System.out.printf("Переменная-счётчик будет принимать значения от %d до %d, увеличиваясь на %d, т.к. итерация равна i+=10\n", a5, b5, c5);

        int a6 = 1, b6 = 9, c6 = 2;
        for (int i = 1; i <= 9; i+=2) {
            System.out.println(i);
        }
        System.out.printf("Переменная-счётчик будет принимать значения от %d до %d, увеличиваясь на %d, т.к. итерация равна i+=2\n", a6, b6, c6);

        int a7 = 19, b7 = 1, c7 = 1;
        for (int i = 19; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.printf("Переменная-счётчик будет принимать значения от %d до %d, уменьшаясь на %d, т.к. итерация равна i--\n", a7, b7, c7);

        int a8 = 19, b8 = 9, c8 = 1;
        for (int i = 19; i >= 9; i--) {
            System.out.println(i);
        }
        System.out.printf("Переменная-счётчик будет принимать значения от %d до %d, уменьшаясь на %d, т.к. итерация равна i--\n", a8, b8, c8);

        int a9 = 29, b9 = 11, c9 = 1;
        for (int i = 19; i > 10; i--) {
            System.out.println(i);
        }
        System.out.printf("Переменная-счётчик будет принимать значения от %d до %d, уменьшаясь на %d, т.к. итерация равна i--\n", a9, b9, c9);

        int a10 = 9, b10 = 1, c10 = 4;
        for (int i = 9; i >= 1; i-=4) {
            System.out.println(i);
        }
        System.out.printf("Переменная-счётчик будет принимать значения от %d до %d, уменьшаясь на %d, т.к. итерация равна i-=4\n", a10, b10, c10);

        int a11 = 99, b11 = 9, c11 = 10;
        for (int i = 99; i >= 0; i-=10) {
            System.out.println(i);
        }
        System.out.printf("Переменная-счётчик будет принимать значения от %d до %d, уменьшаясь на %d, т.к. итерация равна i-=10\n", a11, b11, c11);
    }
}