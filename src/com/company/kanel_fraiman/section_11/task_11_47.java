package com.company.kanel_fraiman.section_11;

public class task_11_47 {
    /*
    Для целого положительного трехзначного числа определим следующие требования:
    • корень 2-й степени из произведения данного числа на число,
    составленное из тех же цифр в обратном порядке - целое число;
    • данное число не равно числу, составленному из тех же цифр в обратном порядке;
    • данное число не содержит двух рядом стоящих нулей.
    Например, числом, соответствующим этим условиям, является 144 (проверьте!).
    Напишите класс, который выводит на экран все целые положительные трехзначные числа,
    соответствующие указанным условиям.
     */
    public static void main(String[] args) {

        int i1, i2, i3, b;
        double c;

        System.out.println("Отображение чисел: ");
        for (int i = 100; i < 1000; i++) {
            i1 = i / 100;
            i2 = (i%100)/10;
            i3 = i % 10;
            b = i3*100+i2*10+i1;
            c = Math.sqrt(i*b);
            if ((c==1.0*Math.round(c))&&i2!=0&&i3!=0&&i!=b) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nВсе числа отображены.");
    }
}
