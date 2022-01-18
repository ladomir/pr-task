package com.company.Tasks_Template.SummaCifr;

import com.company.kanel_fraiman.section_15.pTask_15_21a.Programm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummaCifrCifroy {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Programm obj = new Programm();

        obj.a = Integer.parseInt(reader.readLine());

        System.out.println("a: " + obj.a);
        System.out.println("количество цифр числа равно " + obj.cc());
        System.out.println("окончательная сумма цифр числа равна " + obj.sc());
    }


    static class Programm {
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
}
