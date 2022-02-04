package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_26 {
    /*
        Напишите класс, который принимает с клавиатуры целое положительное число, а затем генерирует случайную цифру.
        Класс должен определить, встречается ли во введенном с клавиатуры числе сгенерированная цифра,
    и вывести на экран соответствующее сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x, flag = 0, c, a = 0, b = 9;

        System.out.println("Введите целое пожительное число: ");

        x = scanner.nextInt();
        c = (int) (Math.random() * (b - a + 1) + a);

        System.out.println(x);
        System.out.println(c);

        while (x>0) {
            if (x % 10 == c & flag == 0)
                flag = 1;
                x /= 10;
        }
            if (flag==1) {
                System.out.println("Да");
            } else  {
                System.out.println("Нет");
            }
    }
}
