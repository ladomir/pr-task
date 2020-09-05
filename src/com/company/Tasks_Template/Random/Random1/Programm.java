package com.company.Tasks_Template.Random.Random1;

import java.util.Random;

public class Programm {
    public static void main(String[] args) {
        double d = Math.random()*5;
        int n = (int)Math.random()*0+5+2*4;
        System.out.println(d);
        System.out.println(n);

        Random random = new Random();
        System.out.println(random.nextInt(10));
    }
}
