package com.company.kanel_fraiman.section_3;

import java.util.Scanner;

public class task_3_3 {
    /*
    Во многих странах для измерения небольших размеров используется не только единица длины «сантиметр»,
    но и такая единица, как «дюйм» (1 дюйм= 2.54 сантиметра).
    Напишите класс, который принимает с клавиатуры значение,
    равное размеру в дюймах, и затем подсчитывает и выводит на экран это же значение, но в сантиметрах.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double dm, sm;
            System.out.println("Введите значение длины в дюймах:");
        dm = scanner.nextDouble();
            System.out.println("Значение длины в дюймах равно " + dm + " дюймов");

        sm = dm * 2.54;
            System.out.println("Длина равна " + sm + " см");
            System.out.printf("Значение длины в дюймах равно %.2f дюймов, в см - %.2f см", dm, sm);
    }
}
