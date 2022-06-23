package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_47 {
    /*
        На спектакль в кассу театра было выделено определенное количество билетов, и продажа осуществлялась до тех пор,
    пока не были проданы все билеты.
        Напишите класс, который сначала принимает с клавиатуры количество билетов, переданных в кассу.
        Затем класс принимает с клавиатуры серию чисел, каждое из которых указывает на число билетов,
    которое желает приобрести очередной покупатель.
        Если нет возможности продать очередному покупателю требуемое им число билетов, принимается заказ от следующего покупателя.
        Класс должен вывести на экран следующую итоговую информацию:
            • какое число покупателей приобрели билеты;
            • какому числу покупателей было отказано в продаже билетов.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int cbC, cbP = 0, sum = 0, n = 0;

//      cbC - количество билетов, поступивших в кассу;
//      cbP - количество билетов, приобретённых очередным покупателем;

            System.out.println("Количество билетов, поступивших в кассу:");
        cbC = scanner.nextInt();

        while (sum <= cbC) {
            cbP = scanner.nextInt();
            sum+=cbP;
            n++;
            System.out.println(n+ "-й покупатель приобрел " + cbP + " билетов;");
        }
        System.out.println("Количество покупателей - " + n + "\nОтказано 1-му покупателю.");
        System.out.println("Количество приобретённых билетов - " + (sum-cbP));
    }
}
