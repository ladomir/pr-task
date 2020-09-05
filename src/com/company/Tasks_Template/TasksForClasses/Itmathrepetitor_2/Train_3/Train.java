package com.company.Tasks_Template.TasksForClasses.Itmathrepetitor_2.Train_3;

public class Train {
    private String Destination; // пункт назначения
    private int NumberTrain; // номер поезда
    private String DepartureTime; // время отправления

    public void Sostoyanie() {
        System.out.println("Номер поезда: "+ NumberTrain+"\nПункт назначения: "+Destination+"\n"
                +"Время отправления: "+DepartureTime+"\n");
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
}
