package com.company.kanel_fraiman.section_15.pTask_15_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Program obj = new Program();

        obj.a = Integer.parseInt(reader.readLine());

        System.out.println("a: " + obj.a);
        System.out.println("сумма цифр числа равна " + obj.sc());
    }
}
