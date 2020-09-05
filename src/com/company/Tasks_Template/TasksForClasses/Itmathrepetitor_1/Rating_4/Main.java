package com.company.Tasks_Template.TasksForClasses.Itmathrepetitor_1.Rating_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    //компаратор ("сравниватель") для сравнения по среднему баллу
    static Comparator<Student> compareAcademicPerformance = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {

            if(o1.getAcademicPerformance() < o2.getAcademicPerformance()) {
                return -1;
            } else if(o1.getAcademicPerformance() > o2.getAcademicPerformance()) {
                return 1;
            } else {
                return 0;
            }
        }
    };

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Student> students = new ArrayList<Student>();

        for(int i = 0; i < 10; i++) {
            System.out.println("Фамилия:");
            String FIO = reader.readLine();
            System.out.println("Номер группы:");
            int groupNumber = Integer.parseInt(reader.readLine());
            System.out.println("Отметки:");
            int[] arrayMark = new int[5]; // массив отметок

                double average = 0;
            for (int j = 0; j < 5; j++){
                arrayMark[j] = Integer.parseInt(reader.readLine());
                    average += (double) arrayMark[j]/ arrayMark.length;

            }
                double academicPerformance = average;
            students.add(new Student(FIO, groupNumber, academicPerformance));
        }

        System.out.println();
        System.out.println("Списочнные данные:");
        System.out.println();

        for (Student s : students) {
            s.printStudent();
        }

        Collections.sort(students, compareAcademicPerformance);

        System.out.println();
        System.out.println("Сортировка по возрастанию:");
        System.out.println();

        for (Student s : students) {
            s.printStudent();
        }

        Collections.sort(students, Collections.reverseOrder(compareAcademicPerformance));

        System.out.println();
        System.out.println("Рейтинг:");
        System.out.println();

        for (Student s : students) {
            s.printStudent();
        }
    }
}
