package com.company.Tasks_Template.BlogProgrammista.Primer1ProsteyshyyKlass;

public class Main {
    public static void main(String[] args) {
        Test1 obj = new Test1();

        System.out.println("a: " + obj.a);
        System.out.println("b: " + obj.b);
        System.out.println("max: " + obj.max());
        System.out.println("sum: " + obj.sum());
        System.out.println("--------------------------");

        obj.a = 123;
        obj.b = 43;

        System.out.println("a: " + obj.a);
        System.out.println("b: " + obj.b);
        System.out.println("max: " + obj.max());
        System.out.println("sum: " + obj.sum());
        System.out.println("--------------------------");

        obj.b = 433;

        System.out.println("a: " + obj.a);
        System.out.println("b: " + obj.b);
        System.out.println("max: " + obj.max());
        System.out.println("sum: " + obj.sum());
        System.out.println("--------------------------");
    }
}
