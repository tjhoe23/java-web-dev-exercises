package org.launchcode.java.demos.lsn6inheritance.Technology;

public class Computer {

    public static Integer nextId = 0;

    private Integer id;

    private String color;

    private Integer memoryMB;

    private String brand;

    public Computer(String color, Integer memoryMB, String brand) {
        this.id = nextId++;
        this.color = color;
        this.memoryMB = memoryMB;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getMemoryMB() {
        return memoryMB;
    }

    public void setMemoryMB(Integer memoryMB) {
        this.memoryMB = memoryMB;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getId() {
        return id;
    }

    public void setBrand(String brand) {
        this.brand = brand;


    }
}
