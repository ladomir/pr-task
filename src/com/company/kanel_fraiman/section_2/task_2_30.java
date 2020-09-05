package com.company.kanel_fraiman.section_2;

import java.util.Scanner;

public class task_2_30 {
    /*
    Напишите класс,
    который принимает с клавиатуры два целых числа,
    образующих ответ на вопрос «который час?»
    (первое - часы, второе - минуты, например 15 и 42) и
    выводит на экран слудующие значения (каждое в отдельной строке):
    сколько секунд прошло с полуночи до «данного момента»
    и сколько минут прошло за это же время,
    а также сколько минут осталось до полуночи.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int hours, minutes, seconds1, minutes1, minutes2;
            System.out.println("Введите значение часов:");
        hours = scanner.nextInt();
            System.out.println("Введите значение минут:");
        minutes = scanner.nextInt();

        seconds1 = hours * 3600 + minutes * 60;
            System.out.println("с полуночи прошло " + seconds1 + " секунд;");
        minutes1 = hours * 60 + minutes;
            System.out.println("с полуночи прошло " + minutes1 + " минут;");
        minutes2 = 24 *60 - minutes1;
            System.out.println("до полуночи осталось " + minutes2 + " минут;");
    }
}
