package com.company.kanel_fraiman.section_12;

import java.util.Scanner;

public class task_12_8 {
    /*
    Напишите класс, который выводит на экран все целые положительные двузначные числа,
    в которых разница между первой (число десятков) и последней (число единиц) цифрами не превышает 3.
    Класс должен также подсчитать количество этих чисел
    и вывести результат на экран вместе с соответствующим текстовым сообщением.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int i, i1, i2, count = 0;
            System.out.println("Числовой ряд: ");
        for (i = 10; i < 100; i++) {
            i1 = i/10;
            i2 = i%10;
            if ((i1-i2)>0&&(i1-i2)<=3) {
                count++;
                System.out.print(i + "\t");
            }
        }
        System.out.printf("\nКоличество двухзначных чисел - %d!", count);
    }
}
