package com.company.kanel_fraiman.section_6;

import java.util.Scanner;

public class task_6_1 {
    /*
    1. Что будет выведено на экран, если с клавиатуры введены значения 5 и 9?
    2. Что будет выведено на экран, если с клавиатуры введены значения 9 и 9?
    3. Что будет выведено на экран, если с клавиатуры введены значения 9 и 5?
    4. Приведите пример вводимых с клавиатуры данных, для которых на экран будет выведено сообщение х меньше у.
    5. Приведите пример вводимых с клавиатуры данных, для которых на экран будет выведено сообщение х теперь больше у.
    6. Приведите пример вводимых с клавиатуры данных, для которых на экран будет выведено сообщение х теперь меньше у.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y;
            System.out.println("Введите значение x:");
        x = scanner.nextInt();
            System.out.println("Введите значение y:");
        y = scanner.nextInt();

        if(x < y) {
            System.out.println("x меньше y");
        }
        if(x == y) {
            System.out.println("x теперь равен y");
        }
        if(x > y) {
            System.out.println("x теперь больше y");
        }
    }
    /*
    1. Что будет выведено на экран, если с клавиатуры введены значения 5 и 9?
        --> x меньше y
    2. Что будет выведено на экран, если с клавиатуры введены значения 9 и 9?
        --> x теперь равен y
    3. Что будет выведено на экран, если с клавиатуры введены значения 9 и 5?
        --> x теперь больше y
    4. Приведите пример вводимых с клавиатуры данных, для которых на экран будет выведено сообщение х меньше у.
        --> при значениях x меньше y
    5. Приведите пример вводимых с клавиатуры данных, для которых на экран будет выведено сообщение х теперь больше у.
        --> при значениях x больше y
    6. Приведите пример вводимых с клавиатуры данных, для которых на экран будет выведено сообщение х теперь меньше у.
        --> не прописано такого выводимого на экран выражения
     */
}
