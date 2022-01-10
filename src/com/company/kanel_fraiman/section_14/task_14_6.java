package com.company.kanel_fraiman.section_14;

public class task_14_6 {
    /*
        Напишите класс, который принимает с клавиатуры серию из 27 целых чисел и сравнивает два значения:
    среднее арифметическое максимума и минимума, и среднее арифметическое всех значений серии.
     */
    public static void main(String[] args) {

        int a = -100, b = 100, c, sum = 0, sa, sA, n = 27, min = 0, max = 0;

        for (int i = 1; i <= n; i++) {

            c = (int) (Math.random() * (b - a + 1) + a);

            System.out.print(c + "\t");

            sum+=c;

            if(c < min){
                min = c;
            }
            if(c > max){
                max = c;
            }
        }

        sA = (max + min) / 2;
        sa = sum / n;

        System.out.printf("\nминимальное число - %d; \nмаксимальное число - %d; " +
                "\nсреднне арифметическое \"max\" и \"min\" - %d; " +
                "\nсреднне арифметическое всех значений серии - %d;", min, max, sA, sa);

        if (sA > sa) {
            System.out.println("\nсреднее значение \"max\" и \"min\" больше среднего значения всех членов серии!");
        } else if (sA < sa) {
            System.out.println("\nсреднее значение \"max\" и \"min\" меньше среднего значения всех членов серии!");
        } else {
            System.out.println("\nсредние значения \"max\" и \"min\" и среднее значение всех членов серии!");
        }
    }
}
