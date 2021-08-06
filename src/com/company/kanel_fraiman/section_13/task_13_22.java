package com.company.kanel_fraiman.section_13;

public class task_13_22 {
    /*
    Трехзначное число называется «числом Армстронга», если куб суммы цифр числа равен самому числу.
    Напишите класс, который выводит на экран все трехзначные «числа Армстронга».
    Класс также должен подсчитывать (и выводить на экран с соответствующим текстовым сообщением) количество и сумму этих чисел.
     */
    public static void main(String[] args) {

        int i1, i2, i3, count = 0, sum = 0;

        for (int i = 100; i <= 999; i++) {
            i1 = i / 100;
            i2 = i % 100 / 10;
            i3 = i % 10;

//            System.out.println(i1 + " " + i2 + " " + i3);

            if (Math.pow((i1+i2+i3), 3)==i) {
                System.out.print(i + "\t");
                count++;
                sum += i;
            }
        }
        System.out.println();
        System.out.println(count);
        System.out.println(sum);
    }
}
