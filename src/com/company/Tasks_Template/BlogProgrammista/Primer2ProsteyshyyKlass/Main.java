package com.company.Tasks_Template.BlogProgrammista.Primer2ProsteyshyyKlass;

public class Main {
    public static void main(String[] args) {

        Test2 obj = new Test2();

        System.out.println("a: " + obj.getA());
        System.out.println("b: " + obj.getB());
        System.out.println("---------------------");

        obj.setA(123);
        obj.setB(43);

        System.out.println("a: " + obj.getA());
        System.out.println("b: " + obj.getB());
        System.out.println("---------------------");

        obj = new Test2(4, 3);

        System.out.println("a: " + obj.getA());
        System.out.println("b: " + obj.getB());
        System.out.println("---------------------");
    }
}
