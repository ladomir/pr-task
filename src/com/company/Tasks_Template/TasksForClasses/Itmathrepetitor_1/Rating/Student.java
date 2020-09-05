package com.company.Tasks_Template.TasksForClasses.Itmathrepetitor_1.Rating;

public class Student {
    /*
    Создайте структуру с именем student, содержащую поля:
    фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
    Создать массив из десяти элементов такого типа, упорядочить записи по возрастанию среднего балла.
    Добавить возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 4 или 5.
     */

    private String FIO; // фамилия и инициалы студента
    private int groupNumber; // номер группы
    private float academicPerformance; // успеваемость

    /*
    public double[5] AcademicPerformance; // успеваемость
    public String[10] list; // список
     */

    // конструктор

    public Student(String FIO, int groupNumber, float academicPerformance) {
        this.FIO = FIO;
        this.groupNumber = groupNumber;
        this.academicPerformance = academicPerformance;
    }
    // геттеры и сеттеры
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

    public float getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(float academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    // вывод информации о студенте в консоль
    public void printStudent() {
        System.out.printf("%s - студент %d группы со средним балом успеваемости - %.2f\n", FIO, groupNumber, (float) academicPerformance);
    }
}
