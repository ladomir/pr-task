package com.company.Tasks_Template.BlogProgrammista.Primer3ProsteyshyyKlass;

public class Student {
    private String name; // фамилия
    private String initials; // инициалы
    private int group; // группа
    private int grades[]; // успеваемость
    private int nGrades; // оценка

    public Student (String name_, String initials_, int group_) { // конструктор
        name = name_;
        initials = initials_;
        nGrades = 0;
        grades = new int[5];
    }

    boolean addGrade (int grade) { // добавление оценок
        if (nGrades >= 5) {
            return false;
        }
        grades [nGrades] = grade;
        nGrades++;
        return true;
    }

    boolean isGood() { // возвращает true, если оценки равны 9 или 10
        for (int i = 0; i < nGrades; i++) {
            if (grades[i] != 9 && grades[i] != 10)
                return false;
        }
        return true;
    }

    void print() {
        System.out.print(name + " " + initials);
        System.out.print(". Group: " + Integer.toString(group) + ". Grades: ");
        for (int i = 0; i < nGrades; i++) {
            System.out.print(Integer.toString(grades[i]) + " ");
            System.out.print("\n");
        }
    }
}
