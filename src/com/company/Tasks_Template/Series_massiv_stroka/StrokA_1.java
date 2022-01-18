package com.company.Tasks_Template.Series_massiv_stroka;

public class StrokA_1 {
    /*
       Напишите класс, который генерирует серию из 50 случайных целых чисел из диапазона от -40 до +40,
   и определяет наибольшее и наименьшее значение в сгенерированной серии.
    */
    public static void main(String[] args) {

        int a = -40, b = 40, c, cn, cm = 1, dn, dm = 1,n = 50, min= 0, max = 0;

        for (int i = 1; i <= n; i++) {

            c = (int) (Math.random() * (b - a + 1) + a);

            System.out.print(c + "\t");

            if(c < min){
                min = c;
                cn = i;
                cm = cn;
            }
            if(c > max){
                max = c;
                dn = i;
                dm = dn;
            }
        }
        System.out.printf("\nминимальное число - %d (%d-е по счёту); \nмаксимальное число - %d (%d-е по счёту).", min, cm, max, dm);
    }
}
