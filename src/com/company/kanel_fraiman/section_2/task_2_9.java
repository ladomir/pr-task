package com.company.kanel_fraiman.section_2;

public class task_2_9 {
    /*
        Напишите класс, который присваивает переменной х значение 9,
        а затем выводит на экран:
        в первой строке - это значение с поясняющей надписью (например, «значение х равно 9»),
        а во второй - квадрат этого значения (тоже с поясняющей надписью).
         */
    public static void main(String[] args) {
        int x = 9;
        System.out.println("значение х равно " + x);
        System.out.println("квадрат значения х равен " + x * x);
        System.out.println("куб значения х равен " + Math.pow(x, 3));
    }
}
