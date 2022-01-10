package com.company.kanel_fraiman.section_15.pTask_15_21;

public class Program {
    public int a, sum = 0, summ = 0;

    public int sc () {
        while (a>0) {
            sum += a % 10;
            a /= 10;
        }
        if (sum > 10) {
            a = sum;
            while (a>0) {
                summ += a % 10;
                a /= 10;
            }
            return summ;
        } else {
            return sum;
        }
    }
}
