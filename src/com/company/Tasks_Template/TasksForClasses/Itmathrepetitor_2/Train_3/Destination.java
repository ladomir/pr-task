package com.company.Tasks_Template.TasksForClasses.Itmathrepetitor_2.Train_3;

public class Destination {
    private Train[] mas;

    public Destination(int i) {
        mas = new Train[i];
    }

    public void Add(int i, Train ob) {
        mas[i] = ob;
    }

    public void Info() {
        for(int i = 0; i < mas.length; i++) {
            mas[i].Sostoyanie();
        }
    }
}
