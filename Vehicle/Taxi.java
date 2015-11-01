package com.vehicle;

/**
 * Класс для представления Такси
 *
 * @author Pavel Kulkov, группа 12оит18к
 */

public class Taxi extends Car {
    private int numberOfPassengers;

    /**
     *
     * @param passengers Количество пассажиров
     */
    public Taxi(int passengers) {
        super(200, 4);
        this.numberOfPassengers = passengers;
    }

    /**
     * Метод для вывода сообщения
     */
    public void Message() {
        super.Message();
        System.out.println("This is a message from Taxi class");
    }

    public String toString() {
        return "Taxi: " + super.toString() + ", numberOfPassengers: " + this.numberOfPassengers;
    }

}