package com.company.kanel_fraiman.section_12;

import java.util.Scanner;

public class task_12_19 {
    /*
    Напишите класс, который принимает с клавиатуры следующие данные:
        • центр окружности (два действительных числа);
        • радиус окружности;
        • 15 пар координат точек на плоскости.
    Класс должен вывести на экран количество точек, лежащих внутри окружности и количество точек, лежащих на окружности.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int Xc, Yc, Xn, Yn, countInside = 0, countOn = 0, countInOut = 0;
        double R;
            System.out.println("Введите координату Х0 центра окружности: ");
        Xc = scanner.nextInt();
            System.out.println("Введите координату Y0 центра окружности: ");
        Yc = scanner.nextInt();
            System.out.println("Введите значение радиуса окружности R: ");
        R = scanner.nextDouble();

        System.out.printf("\nЦентр окружности - Xc(%d;%d); радиус R - %.0f!\n", Xc, Yc, R);

        for (int i = 1; i <= 15; i++) {
                System.out.printf("\nВведите координату X %d-й точки на плоскости: ", i);
            Xn = scanner.nextInt();
                System.out.printf("\nВведите координату Y %d-й точки на плоскости: \n", i);
            Yn = scanner.nextInt();
                System.out.printf("\nКоординаты %d-й точки на плоскости --> (%d; %d)\n", i, Xn, Yn);

                if (Math.sqrt(Math.pow((Xn - Xc), 2) + Math.pow((Yn - Yc), 2)) == R) {
                    System.out.printf("\n%d- точка лежит на окружности\n", i);
                    countOn++;
                }
                if (Math.sqrt(Math.pow((Xn - Xc), 2) + Math.pow((Yn - Yc), 2)) > R) {
                    System.out.printf("\n%d- точка лежит за пределами окружности\n", i);
                    countInOut++;
                }
                if (Math.sqrt(Math.pow((Xn - Xc), 2) + Math.pow((Yn - Yc), 2)) < R) {
                    System.out.printf("\n%d- точка лежит внутри окружности\n", i);
                    countInside++;
                }
        }
        System.out.printf("Количество точек, лежащих внутри окружности равно - %d, " +
                "на окружности - %d, за пределами окружности - %d!", countInside, countOn, countInOut);
    }
}
