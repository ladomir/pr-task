package com.company.kanel_fraiman.section_13;

import java.util.Scanner;

public class task_13_1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x;
        int s1 = 0;
        int s2 = 0;

        for (int i = 1; i < 7; i++) {
            x = scanner.nextInt();
            if (x%2==0) {
                s1 = s1 + x;
            }
            if (x%3==0) {
                s2 = s2 + x;
            }
        }
        System.out.printf("При введённом значениях x (5, 12, 6, 8, 9, 7): \n\ts1 = %d, s2 = %d", s1, s2); // 26, 27
    }
}
