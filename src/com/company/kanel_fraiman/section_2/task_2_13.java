package com.company.kanel_fraiman.section_2;

public class task_2_13 {
    /*
    Для заданий 1.4-1.7 из предыдущего раздела напишите класс,
    который не только будет присваивать переменным значения,
    но и выводить на экран эти значения
    вместе с соответствующими пояснительными текстами.
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c = a + b;
        System.out.println("значение переменной a равно " + a);
        System.out.println("значение переменной b равно " + b);
        System.out.println("сумма значений a и b равна " + c);
        double x = 7.5;
        double d = 2 * x;
        double e = 3 * x;
        System.out.println("значение переменной x равно " + x);
        System.out.println("значение переменной d вдвое больше значения x и равно " + d);
        System.out.println("значение переменной e верое больше значения x и равно " + e);
        int q = 4;
        int w = 7;
        String r = q + " " + w;
        System.out.println(r);
        System.out.println(q + " - однозначное положительное число");
        System.out.println(w + " - однозначное положительное число");
        System.out.println(r + " - сложеннное число, где q - десятки, а w - еденицы");
        int z = 0;
        double y = (double) z / 3;
        System.out.println(z + " - целочисленное число");
        System.out.println(y + " - число, значение которого равно одной трети значения z");
    }
}
