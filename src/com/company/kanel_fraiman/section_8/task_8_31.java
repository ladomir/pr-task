package com.company.kanel_fraiman.section_8;

import java.util.Scanner;

public class task_8_31 {
    /*
    Напишите класс, который принимает с клавиатуры трехзначное число
	и изменяет его следующим образом:
	• для четных чисел - все четные цифры увеличиваются на 1, а нечетные уменьшаются на 1;
		в случае если это невозможно, они остаются неизменными;
	• в нечетных числах все изменения производятся «наоборот».
	Программа должна вывести на экран новое значение переменной.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, a1, a2, a3;
            System.out.println("Введите трёхзначное число a:");
        a = scanner.nextInt();

        a1 = a / 100;
        a2 = (a % 100) / 10;
        a3 = a % 10;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        if (a%2==0) {
            System.out.println("Число чётное!");
        }

        if (a%2==1) {
            System.out.println("Число нечётное!");
        }

        if (a%2==0) {
            if (a1%2==0) {
                a1++;
            } else if (a1%2==1) {
                a1--;
            }
            if (a2%2==0 && a2 != 0) {
                a2++;
            } else if (a2%2==1) {
                a2--;
            } else if (a2==0) {
                a2=0;
            }
            if (a3%2==0 && a3 != 0) {
                a3++;
            } else if (a3%2==1) {
                a3--;
            } else if (a3==0) {
                a3=0;
            }
                System.out.println(a1 * 100 + a2 * 10 + a3);
        }
        if (a%2==1) {
            if (a1%2==0) {
                a1--;
            } else if (a1%2==1) {
                a1++;
            }
            if (a2%2==0 && a2 != 0) {
                a2--;
            } else if (a2%2==1) {
                a2++;
            } else if (a2==0) {
                a2=0;
            }
            if (a3%2==0 && a3 != 0) {
                a3--;
            } else if (a3%2==1) {
                a3++;
            } else if (a3==0) {
                a3=0;
            }
                System.out.println(a1 * 100 + a2 * 10 + a3);
        }
    }
}
