package com.vehicle;

public class Demo {
    public static void main(String[] args) {

        Airplane plane = new Airplane(1000, 10000, 52);
        System.out.println(plane.toString());
        plane.Message();

        Boat boat = new Boat(250,150);
        System.out.println(boat.toString());
        boat.Message();

        Car car = new Car(200, 4);
        System.out.println(car.toString());
        car.Message();

        Taxi taxi = new Taxi(3);
        System.out.println(taxi.toString());
        taxi.Message();

        Truck truck = new Truck(3000);
        System.out.println(truck.toString());
        truck.Message();
    }
}
