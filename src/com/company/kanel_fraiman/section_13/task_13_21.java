package com.company.kanel_fraiman.section_13;

public class task_13_21 {
    /*
    Напишите класс, который выводит на экран все двузначные числа, равные утроенному произведению его цифр.
    Класс также должен подсчитывать (и выводить на экран с соответствующим текстовым сообщением) количество и сумму этих чисел.
     */
    public static void main(String[] args) {

        int i1, i2, count = 0, sum = 0;

        for (int i = 10; i <= 99; i++) {
            i1 = i / 10;
            i2 = i % 10;

            if (i==3*i1*i2) {
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
