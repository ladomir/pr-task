package com.company.Tasks_Template.TasksForClasses.Itmathrepetitor_2.Train_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void allTrains(ArrayList<Train> trains) {
        trains.add(new Train("Kiev", 278, "12:15"));
        trains.add(new Train("Lyvov", 612, "00:03"));
        trains.add(new Train("Uzhgorod", 55, "02:44"));
        trains.add(new Train("Lugansk", 2325, "16:27"));
        trains.add(new Train("Simferopol", 358, "07:59"));
        trains.add(new Train("Harkov", 2, "18:06"));
        trains.add(new Train("Kiev", 254, "16:28"));
        trains.add(new Train("Lyvov", 257, "22:23"));
        trains.add(new Train("Zaporizhya", 42, "12:19"));
        trains.add(new Train("Uzhgorod", 55, "10:04"));
        trains.add(new Train("Uzhgorod", 55, "08:09"));
        trains.add(new Train("Harkov", 300, "18:18"));
        trains.add(new Train("Odessa", 20, "18:15"));
        trains.add(new Train("Lyvov", 12, "13:03"));
        trains.add(new Train("Uzhgorod", 55, "05:34"));
        trains.add(new Train("Luck", 35, "07:45"));
        trains.add(new Train("Rivne", 36, "07:49"));
        trains.add(new Train("Harkov", 285, "03:44"));
        trains.add(new Train("Одесса", 27, "08:30"));
    }

    public  static Comparator<Train> compareDestination = new Comparator<Train>() {
        @Override
        public int compare(Train o1, Train o2) {
            return o1.getDestination().compareTo(o2.getDestination());
        }
    };

    public static Comparator<Train> compareNumberTrain = new Comparator<Train>() {
        @Override
        public int compare(Train o1, Train o2) {
            if(o1.getNumberTrain() < o2.getNumberTrain()) {
                return -1;
            } else if(o1.getNumberTrain() > o2.getNumberTrain()) {
                return 1;
            } else {
                return 0;
            }
        }
    };

    public static Comparator<Train> compareDepartureTime = new Comparator<Train>() {
        @Override
        public int compare(Train o1, Train o2) {
            return o1.getDepartureTime().compareTo(o2.getDepartureTime());
        }
    };

    public static void main(String[] args) throws IOException {
        ArrayList<Train> trains = new ArrayList<>();
        allTrains(trains);

        System.out.println("Расписание поездов:\n");

        for (Train t: trains) {
            t.generalTrain();
        }

        Collections.sort(trains, compareDestination.thenComparing(compareDepartureTime).thenComparing(compareNumberTrain));

        System.out.println();
        System.out.println("Сортировка по пункту назначения:");
        System.out.println();

        for (Train t: trains) {
            t.destinationTrain();
        }

        Collections.sort(trains, compareNumberTrain);

        System.out.println();
        System.out.println("Сортировка по номеру поезда (по возрастанию):");
        System.out.println();

        for (Train t: trains) {
            t.printTrain();
        }

        Collections.sort(trains, Collections.reverseOrder(compareNumberTrain));

        System.out.println();
        System.out.println("Сортировка по номеру поезда (нисходящая):");
        System.out.println();

        for (Train t: trains) {
            t.printTrain();
        }

        // Train.search(trains, 55);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nВведите номер поезда:");

        int NumberTrain = Integer.parseInt(reader.readLine());

        System.out.println();
        System.out.println("Информация о расписании движения поезда по его номеру: ");
        System.out.println();

        Train.search(trains, NumberTrain);
    }
}
