package com.company.kanel_fraiman.section_9;

import java.util.Scanner;

public class task_9_14 {
    /*
    Определим «текстовую форму оценки» следующим образом:
    1 или 2 - «неудовлетворительно», 3 - «удовлетворительно», 4 - «хорошо»,
    5 - «ОТЛИЧНО».
    Напишите класс, который принимает с клавиатуры целое число и, если
    оно соответствует оценке, выводит на экран соответствующую «текстовую форму оценки».
    В случае если число не является оценкой, следует вывести на экран соответствующее текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
            System.out.println("Введите значение оценки a:");
        a = scanner.nextInt();

        if (a == 1 || a == 2) {
            System.out.println("Неудовлетворительно");
        }
        if (a == 3) {
            System.out.println("Удовлетворительно");
        }
        if (a == 4) {
            System.out.println("Хорошоо");
        }
        if (a == 5) {
            System.out.println("Отлично!");
        } else {
            System.out.println("Число не является оценкой!");
        }
    }
}
