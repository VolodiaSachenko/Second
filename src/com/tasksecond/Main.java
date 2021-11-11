package com.tasksecond;

/**
 * @author Volodia Sachenko
 * @version 0.1
 * @since 10.11.21
 */

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car carSecond = new Car(3);
        Car carThird = new Car(6, "yellow");

        System.out.println("It's a first constructor. Year: " + car.getYear() + " Color: " + car.getColor());
        System.out.println("It's a second constructor. Year: " + carSecond.getYear() + " Color: " + carSecond.getColor());
        System.out.println("It's a third constructor. Year: " + carThird.getYear() + " Color: " + carThird.getColor());
    }
}
