package com.company.Tasks_Template.TasksForClasses.Itmathrepetitor_1.Rating_3;

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
            System.out.println("Рейтинг:");
            double academicPerformance = Double.parseDouble(reader.readLine());

            students.add(new Student(FIO, groupNumber, academicPerformance));
        }

        Collections.sort(students, compareAcademicPerformance);

        //сортировка в обратном порядке
        //Collections.sort(students, Collections.reverseOrder(compareAcademicPerformance));

        System.out.println();
        System.out.println("Отсортированные данные:");
        System.out.println();

        for (Student s : students) {
            s.printStudent();
        }
    }
}
