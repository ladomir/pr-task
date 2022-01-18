package com.company.Tasks_Template.CifryChisla;

public class task_1 {
    public static void main(String[] args) {

        int a = Integer.MAX_VALUE;

        StringBuilder s = new StringBuilder();

        System.out.println(a);

        while(a>0) {
            s.insert(0, a%10);
            a = a / 10;
        }

        System.out.println(s.toString());
    }
}
