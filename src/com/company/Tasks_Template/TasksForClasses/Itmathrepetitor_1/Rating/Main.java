package com.company.Tasks_Template.TasksForClasses.Itmathrepetitor_1.Rating;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void fillStudentsArrayList(ArrayList<Student> students) {
        students.add(new Student("Zhuravlev I.I.", 7, (float) 99.70));
        students.add(new Student("Ladomir A.O.", 6, (float) 89.75));
        students.add(new Student("Ladograd I.U.", 4, (float) 74.84));
        students.add(new Student("Lada S.A.", 8, (float) 55.95));
        students.add(new Student("Lad K.I.", 9, (float) 19.85));
        students.add(new Student("Altay D.O.", 7, (float) 24.37));
        students.add(new Student("Crimea F.L.", 4, (float) 12.35));
        students.add(new Student("Odessa E.P.", 2, (float) 37.65));
        students.add(new Student("Ucraine R.H.", 1, (float) 64.52));
        students.add(new Student("Rasa F.H.", 7, (float) 28.95));
    }

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

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        fillStudentsArrayList(students);

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
