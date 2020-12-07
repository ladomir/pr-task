package com.company.kanel_fraiman.section_10;

public class task_10_11 {
    /*
    Как известно, при игре в «двадцать одно» («очко») у каждой карты есть численное значение.
    Напишите класс, который «выбрасывает три карты» (генерирует три
    случайных числа - в каких пределах?) и определяет, какой из вариантов
    (недобор, перебор, «очко») реализовался.
     */
    public static void main(String[] args) {
        int a, b, c;

        a = (int)(Math.random()*9+2);
        b = (int)(Math.random()*9+2);
        c = (int)(Math.random()*9+2);

        System.out.printf("Три выброшенные карты - %d %d и %d\n", a, b, c);

        if ((a + b + c) < 21) {
            System.out.println("Недобор!");
        }
        if ((a + b + c) == 21) {
            System.out.println("Очко!");
        }
        if ((a + b + c) == 21) {
            System.out.println("Перебор!");
        }
    }
}
