package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_45 {
    /*
        Напишите класс, который принимает с клавиатуры положительное число (для переменной х) и
    положительное вещественное число (для переменной d).
        Класс будет заменять значение переменной х - на квадратный (положительный) корень из значения этой переменной до тех пор,
    пока значениет переменной х будет больше 1 на величину, превышающую значение переменной d.
        Класс должен вывести на экран все промежуточные значения и
    определить количество операций извлечения корня из переменной х, которое было произведено.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 0;
        double x, d;

        System.out.println("Введите число x: ");
        x = scanner.nextInt();

        System.out.println("Введите число d: ");
        d = scanner.nextInt();

                x = Math.sqrt(x);
                    System.out.println(x);
                n++;
                while (x > d) {
                    x = Math.sqrt(x);
                    n++;
//                    if (x > y) {
//                        System.out.println(x);
//                    } else {
//                        return;
//                    }
                }
        System.out.println("Общее количество преобразований - " + n);
    }
}
