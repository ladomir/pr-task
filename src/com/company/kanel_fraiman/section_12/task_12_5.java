package com.company.kanel_fraiman.section_12;

public class task_12_5 {
    /*
    Напишите класс, который генерирует 15 целых чисел в интервале от -25 до 25, печатает их,
    а затем выводит на экран информацию о том, сколько из них были:
    • положительными;
    • четными;
    • однозначными.
     */
    public static void main(String[] args) {

        int a = -25, b = 25, i, c, countP = 0, countC = 0, countO = 0;

        for (i = 1; i <= 15; i++) {
            c = (int) (Math.random() * (b - a + 1) + a);

            System.out.print(c + " ");

            if (c > 0) {
                countP++;
            }
            if (c%2==0) {
                countC++;
            }
            if (c > 0 && c <10) {
                countO++;
            }
        }
        System.out.printf("\nСреди введённых чисел: \n\tположительных - %d; \n\tчётных - %d; \n\tоднозначных - %d!", countP, countC, countO);
    }
}
