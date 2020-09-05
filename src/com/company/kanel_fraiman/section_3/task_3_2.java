package com.company.kanel_fraiman.section_3;

import java.util.Scanner;

public class task_3_2 {
    /*
    Во многих странах для измерения небольших размеров используется не только единица длины «сантиметр»,
    но и такая единица, как «дюйм>> (1 = 2.54 сантиметра).
    Напишите класс, который принимает с клавиатуры значение,
    равное размеру в сантиметрах, и затем подсчитывает и
    выводит на экран это же значение, но в дюймах.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double sm, dm;
            System.out.println("Введите значение длины в сантиметрах:");
        sm = scanner.nextDouble();
            System.out.println("Значение длины в сантиметрах равно " + sm + " см");

        dm = sm / 2.54;
            System.out.println("Длина равна " + dm + " дюймов");
            System.out.printf("Значение длины в сантиметрах равно %.2f см, в дюймах - %.2f дюймов", sm, dm);
    }
}
