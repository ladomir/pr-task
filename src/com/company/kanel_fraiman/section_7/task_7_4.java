package com.company.kanel_fraiman.section_7;

import java.util.Scanner;

public class task_7_4 {
    /*
    Ответьте на вопросы в соответствии с исполнением этого фрагмента:
    1. Какая информация будет выведена на экран, если с клавиатуры
        будет введено значение 165? Обоснуйте ответ.
    2. Какая информация будет выведена на экран, если с клавиатуры
        будет введено значение 5555? Обоснуйте ответ.
    3. Приведите пример значения, вводимого с клавиатуры, для которого
        на экран будет выведена информация Ok.
    4. Какими должны быть вводимые с клавиатуры значения, чтобы на
        экран выводилось сообщение Ok.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x, a;
            System.out.println("Введите число");
        x = scanner.nextInt();

        a = x%100;

        System.out.println(a);

        if (x == a) {
            System.out.println("OK!");
        } else {
            System.out.println("NO!");
        }
    }

    /*
    1 - NO!
    2 - NO!
    3 - x < 100
    4 - x < 100
     */
}
