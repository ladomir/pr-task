package com.company.Tasks_Template.TasksForClasses.SumOfDigits_a;

public class Program {
    public static void main(String[] args) {
        Test1 obj = new Test1();

        System.out.println("a: " + obj.a);
        System.out.println("b: " + obj.b);
        System.out.println("max: " + obj.max());
        System.out.println("sum: " + obj.sum());

        obj.a = 123;
        obj.b = 43;

        System.out.println("\na: " + obj.a);
        System.out.println("b: " + obj.b);
        System.out.println("max: " + obj.max());
        System.out.println("sum: " + obj.sum());

        obj.b = 433;

        System.out.println("\na: " + obj.a);
        System.out.println("b: " + obj.b);
        System.out.println("max: " + obj.max());
        System.out.println("sum: " + obj.sum());
    }
static class Test1 {
        public int a, b;

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
