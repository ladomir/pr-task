package com.company.Tasks_Template.BufferedReader.Input.Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Test num = new Test();
        num.a = Integer.parseInt(reader.readLine());

        System.out.println("a: " + num.a);
        System.out.println("сумма цифр: " +num.summCyfr());

    }
    static class Test {
        public int a, b, summa = 0;

        public int summCyfr() {
            while (a>0) {
                summa += a % 10;
                a /= 10;
            }
            return a;
        }

        public int max() {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        }

        public int sum() {
            return a+b;
        }

        void displayInfo() {

        }
    }
}
