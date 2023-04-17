package org.launchcode.java.demos.lsn6inheritance.Technology;

public class Laptop extends Computer{

    private Double batteryLife;

    public Laptop(String color, Integer memoryMB, String brand, Double batteryLife) {
        super(color, memoryMB, brand);
        this.batteryLife = batteryLife;
    }
}
