package com.vehicle;

/**
 * Класс для представления Судна
 *
 * @author Pavel Kulkov, группа 12оит18к
 */

public class Boat extends Vehicle {
    private int numberOfCrew;

    /**
     *
     * @param maxSpeed Максимальная скорость
     * @param numberOfCrew Количество экипажа
     */
    public Boat(int maxSpeed,int numberOfCrew) {
        super(2, maxSpeed);
        this.numberOfCrew = numberOfCrew;
    }

    /**
     * Метод для вывода сообщения
     */
    public void Message() {
        super.Message();
        System.out.println("This is a message from Boat class");
    }

    public String toString() {
        return "Boat: " + super.toString()+", numberOfCrew: "+this.numberOfCrew;
    }

}