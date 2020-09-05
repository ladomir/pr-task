package com.company.Tasks_Template.TasksForClasses.Itmathrepetitor_2.Train_2;

/*
Создайте структуру с именем train, содержащую поля: название пункта назначения, номер поезда, время отправления.
Ввести данные в массив из пяти элементов типа train, упорядочить элементы по номерам поездов.
Добавить возможность вывода информации о поезде, номер которого введен пользователем.
Добавить возможность сортировки массива по пункту назначения,
причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
*/
/*
LocalTime time = LocalTime.of(8, 23);
System.out.println(time);
*/

import java.util.ArrayList;

public class Train {
    private String Destination; // пункт назначения
    private int NumberTrain; // номер поезда
    private String DepartureTime; // время отправления

    public Train(String destination, int numberTrain, String departureTime) {
        Destination = destination;
        NumberTrain = numberTrain;
        DepartureTime = departureTime;
    }

    public Train(int numberTrain) {
        NumberTrain = numberTrain;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public int getNumberTrain() {
        return NumberTrain;
    }

    public void setNumberTrain(int numberTrain) {
        NumberTrain = numberTrain;
    }

    public String getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(String departureTime) {
        DepartureTime = departureTime;
    }

    // общая информация о ж/д движении
    public void generalTrain() {
        System.out.printf("Пункт назначения: %s; номер поезда: %d; отправление: %s\n", Destination, NumberTrain, DepartureTime);
    }

    // информация о ж/д движении - сортировка по пункту назначения
    public void destinationTrain() {
        System.out.printf("%s: время отправления поезда № %d - %s\n", Destination, NumberTrain, DepartureTime);
    }

    // информация о ж/д движении по номерам поездов
    public void printTrain() {
        System.out.printf("Поезд № %d в %s отправляется в %s\n", NumberTrain, Destination, DepartureTime);
    }

    // поиск информации о движении поездов по их номерам
public static void search(ArrayList<Train> trains, int numberTrain) {
    int num = 0;
    for(Train t : trains) {
        if(t.getNumberTrain()==numberTrain) {
            System.out.println(t);
            num++;
        }
    }
    if(num==0) {
        System.out.println("Информация отсутствует!");
    }
}

    @Override
    public String toString() {
        return "Поезд № " + getNumberTrain() + " отправляется в " + getDestination() + " в " + getDepartureTime();
    }
}
