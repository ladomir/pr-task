package com.company.kanel_fraiman.section_13;

public class task_13_19 {
    /*
        Назовем «стабильным» положительное двузначное число, которое при умножении на 2 дает такое двузначное число,
    в котором сумма цифр равна сумме цифр в двузначном числе до умножения.
        Напишите класс, который выводит на экран все «стабильные» числа, а также их количество и сумму этих чисел.
     */

    public static void main(String[] args) {

        int i1, i2, a, a1, a2, count = 0, sum = 0;

        for (int i = 10; i <= 49; i++) {
            i1 = i / 10;
            i2 = i % 10;

            a = i * 2;
            a1 = a / 10;
            a2 = a % 10;

                if ((i1+i2)==(a1+a2)) {
                    System.out.println(i + ",\t" + a + "\t");
                    count++;
                    sum += i;
                }
            System.out.println();
            System.out.println(count);
            System.out.println(sum);
        }
    }
}
