package com.company.kanel_fraiman.section_15.pTask_15_21a;

public class Programm {
    public int a, count = 0, sum = 0;

    public int sc () {

        while (a > 0) {
            while (a > 0) {
                sum += a % 10;
                a /= 10;
            }
            if (sum >= 10) {
                a = sum;
                sum = 0;
            }
        }
        return sum;
    }

    public int cc () {
        for (int i = a; i != 0; i /= 10) {
            count++;
            sum += (i % 10);
        }
        return count;
    }
}
