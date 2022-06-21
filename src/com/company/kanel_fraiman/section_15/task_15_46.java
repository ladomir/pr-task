package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_46 {
    /*
        В инструкции по пользованию лифтом в торговом центре написано:
    «Не более 6 человек или не более 450 кг». Перед входом в лифт установлен прибор,
    который подсчитывает входящих в лифт и определяет вес до входа в лифт.
    Прибор автоматически прекращает доступ к лифту, если вход очередного человека может нарушить инструкцию.
    Напишите класс, который принимает с клавиатуры значения, каждое из которых - вес очередного человека, входящего в лифт.
    Ввод данных продолжается до тех пор, пока соблюдается требование, указанное в инструкции.
    Класс должен выводить на экран следующую итоговую информацию:
    • количество людей, вошедших в лифт;
    • общий их вес;
    • причина, по которой прекращен вход людей в лифт.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int massa = 0, maxChel = 6, maxMassa = 450, count = 0, sum = 0;

        while (sum<=maxMassa && count <= maxChel) {
            massa = scanner.nextInt();
            sum+=massa;
            count++;
            System.out.println("Количество людей - " + count + ", общий вес - " + sum);
        }
        if (count>maxChel && sum<maxMassa) {
            System.out.println("Много людей");
        }
        if (count<maxChel && sum>maxMassa) {
            System.out.println("Перегруз");
        }
        if (count>maxChel && sum>maxMassa) {
            System.out.println("Много людей и перегруз");
        }
        System.out.println("Количество людей - " + (count-1) + ", общий вес - " + (sum-massa));
    }
}
