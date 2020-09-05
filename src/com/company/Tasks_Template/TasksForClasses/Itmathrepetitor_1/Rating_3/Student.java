package com.company.Tasks_Template.TasksForClasses.Itmathrepetitor_1.Rating_3;

public class Student {
    private String FIO; // фамилия и инициалы студента
    private int groupNumber; // номер группы
    private double academicPerformance; // успеваемость

    public Student(String FIO, int groupNumber, double academicPerformance) {
        this.FIO = FIO;
        this.groupNumber = groupNumber;
        this.academicPerformance = academicPerformance;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public double getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(double academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    // вывод информации о студенте в консоль
    public void printStudent() {
        System.out.printf("%s - студент %d группы со средним балом успеваемости - %.2f\n", FIO, groupNumber, (float) academicPerformance);
    }
}
