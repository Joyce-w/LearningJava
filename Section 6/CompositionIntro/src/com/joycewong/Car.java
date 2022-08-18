package com.joycewong;

public class Car extends Vehicle{
    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}

// Inheritance: Car extends from Vehicle meaning a Car is a Vehicle
//Compisition: modeling parts of the greater whole

