package com.company.kanel_fraiman.section_3;

import java.util.Scanner;

public class task_3_4 {
    /*
    Для пересчета суммы в одной валюте - в сумму в другой валюте
    (например, между суммой в рублях и этой же суммой, но в евро)
    используется так называемый «банковский курс»: числовой коэффициент,
    показывающий, чему равна единица одной валюты в единицах другой.
    Напишите класс, который принимает с клавиатуры два числа:
    первое - сумму в одной валюте (например, в долларах),
    и второе - «банковский курс».
    Класс должен подсчитать и вывести на экран сумму во второй валюте.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double usd, uah, course = 27.8;
            System.out.println("Введите значение количества денег в долларах:");
        usd = scanner.nextDouble();
            System.out.println("Количество денег равно " + usd + " долларов");

        uah = usd * course;
            System.out.println(usd + " долларов по курсу " + course + " равно " + uah + " гривен");
            System.out.printf("%.2f долларов по курсу %.2f равно %.2f гривен", usd, course, uah);
    }
}
