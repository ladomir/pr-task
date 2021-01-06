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


    }
}
