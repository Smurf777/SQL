package com.company;

public class Car {
    String enigine;
    int id;

    public Car(String enigine, int id) {
        this.enigine = enigine;
        this.id = id;
    }

    public String getEnigine() {
        return enigine;
    }

    public void setEnigine(String enigine) {
        this.enigine = enigine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String toString(){
        return String.format("Двигатель %s,  id  - %d", this.enigine, this.id);
    }

}
