package com.company.kanel_fraiman.section_13;

import java.util.Scanner;

public class task_13_11 {
    /*
        Для проверки уровня загрязненности в реке было выполнено 50 измерений, каждое из которых содержало информацию о том,
    в какой день недели было произведено измерение, и каким был уровень загрязнения (по 10-балльной шкале).
        Напишите класс, принимающий с клавиатуры данные 50 измерений (каждое измерение - два числа:
    первое - день недели, второе - уровень загрязнения) и выводящий на экран:
        • сообщение Опасно! - для дней, когда уровень загрязнения составлял 7 или более единиц;
        • сообщение Спокойный вторник - для вторников, в которые уровень загрязнения составлял менее 5 единиц.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x, y;

        for (int i = 1; i <= 50; i++) {
                System.out.println("Введите день недели: ");
            x = scanner.nextInt();
                System.out.println("Введите значение уровня загразнения по 10-й шкале: ");
            y = scanner.nextInt();
            if (y>=7) {
                System.out.printf("Опасно! \nУровень загрязнения составил %d единиц!", y);
            }
            if (y<5) {
                if (x==1){
                    System.out.printf("Спокойный понедельник! Уровень загрязнения составил %d единиц!", y);
                } else if (x==2) {
                    System.out.printf("Спокойный вторник! Уровень загрязнения составил %d единиц!", y);
                } else if (x==3) {
                    System.out.printf("Спокойная среда! Уровень загрязнения составил %d единиц!", y);
                } else if (x==4) {
                    System.out.printf("Спокойный четверг! Уровень загрязнения составил %d единиц!", y);
                } else if (x==5) {
                    System.out.printf("Спокойный пятница! Уровень загрязнения составил %d единиц!", y);
                } else if (x==6) {
                    System.out.printf("Спокойная суббота! Уровень загрязнения составил %d единиц!", y);
                } else {
                    System.out.printf("Спокойное воскресенье! Уровень загрязнения составил %d единиц!", y);
                }
            }
        }
    }
}