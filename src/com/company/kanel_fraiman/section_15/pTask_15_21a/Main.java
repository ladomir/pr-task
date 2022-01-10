package com.company.kanel_fraiman.section_15.pTask_15_21a;

import com.company.kanel_fraiman.section_15.pTask_15_21.Program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Programm obj = new Programm();

        obj.a = Integer.parseInt(reader.readLine());

        System.out.println("a: " + obj.a);
        System.out.println("количество цифр числа равно " + obj.cc());
        System.out.println("окончательная сумма цифр числа равна " + obj.sc());
    }
}
