package com.tasksecond;

public class Car {
    private final int year;
    private final String color;

    // Геттеры:
    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    /*

    Конструкторы:

     */
    public Car() {
        this.year = 5;
        this.color = "blue";
    }

    public Car(int year) {
        this.year = year;
        this.color = "red";
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }
}
