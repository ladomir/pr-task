package com.company.Tasks_Template.TasksForClasses.Itmathrepetitor_3;

/*
Создать класс с двумя переменными.
Добавить функцию вывода на экран и функцию изменения этих переменных.
Добавить функцию, которая находит сумму значений этих переменных,
и функцию которая находит наибольшее значение из этих двух переменных.
 */

public class Main {
    public static void main(String[] args) {
        Variable v = new Variable(5, 5.7);
        System.out.println(v.summ());
        System.out.println(v.comparison());
    }
}
