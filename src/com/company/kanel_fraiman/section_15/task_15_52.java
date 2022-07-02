package com.company.kanel_fraiman.section_15;

import java.util.Scanner;

public class task_15_52 {
    /*
        Игра в кости проходит по следующим правилам:
    в каждом «круге» игры два игрока бросают каждый по два кубика, на гранях которых - цифры от 1 до6.
        Игра заканчивается, если хотя бы один из победителей набрал больше 100 очков. Если один из игроков набрал больше 100 очков,
    а второй - нет, набравший более 100 объявляется победителем. Если оба игрока набрали более 100 очков, объявляется ничья.
        Напишите класс, реализующий модель этой игры и определяющий результат, в соответствии с которым на экран выводится текстовое сообщение.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 0, y = 0, a = 1, b = 12, sumX = 0, sumY = 0, n = 0;

        while (sumX <= 100 || sumY <= 100) {
                System.out.printf("\nХод первого игрока - %d", x = (int) (Math.random() * (b - a + 1) + a));
                System.out.printf("\nХод второго игрока - %d", y = (int) (Math.random() * (b - a + 1) + a));

            sumX += x;
            sumY += y;
            n++;

            System.out.printf("\nСчёт после %d-го хода игры - %d:%d\n", n, sumX, sumY);
            if (sumX > 100 && sumY > 100){
                System.out.printf("\nИгра закончилась в ничью на %d-м ходе со счётом - %d:%d\n", n, sumX, sumY);
                return;
            }
            if (sumX > 100) {
                System.out.printf("\nИгра закончилась победой первого игрока на %d-м ходе со счётом - %d:%d\n", n, sumX, sumY);
                return;
            }
            if (sumY > 100){
                System.out.printf("\nИгра закончилась победой второго игрока на %d-м ходе со счётом - %d:%d\n", n, sumY, sumX);
                return;
            }
        }
    }
}
