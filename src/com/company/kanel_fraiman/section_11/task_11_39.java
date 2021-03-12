package com.company.kanel_fraiman.section_11;

public class task_11_39 {
    /*
    Напишите класс, который выводит на экран все положительные двузначные числа
    (выберите самостоятельно - в возрастающем или убывающем порядке),
    произведение цифр которых является тоже двузначным числом.
     */
    public static void main(String[] args) {

        int i, i1, i2;

        System.out.println("Отображение чисел: ");
        for (i = 10; i < 100; i++) {
            i1 = i / 10;
            i2 = i % 10;
            if (i1*i2>=10 && i1*i2<100) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nВсе числа отображены.");
    }
}
