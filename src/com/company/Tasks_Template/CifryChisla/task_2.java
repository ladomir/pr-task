package com.company.Tasks_Template.CifryChisla;

public class task_2 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        for(int a=Integer.MAX_VALUE; a>0; a/=10)
            s.insert(0, a%10);
        System.out.println(s + "\t");
    }
}
