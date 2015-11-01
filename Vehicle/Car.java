package com.vehicle;

/**
 * Класс для представления Машины
 *
 * @author Pavel Kulkov, группа 12оит18к
 */

public class Car extends Vehicle {
    private int wheels;

    /**
     *
     * @param maxSpeed Максимальная скорость
     * @param numberOfWheels Количество колёс
     */
    public Car(int maxSpeed, int numberOfWheels) {
        super(1, maxSpeed);
        this.wheels = numberOfWheels;
    }

    /* Вообще не понимаю зачем это нужно, и в частности что такое int vel,
        но на всякий случай переделал, но под комментами

    public Car(Vehicle auto, int wheels) {
        super(auto.getType(), auto.getMaxSpeed());
        this.wheels = wheels;
    }

    public Car(Vehicle auto, int vel, int wheels) {
        super(auto.getType(), vel);
        this.wheels = wheels;
    }
    */

    /**
     * Метод для вывода сообщения
     */
    public void Message() {
        super.Message();
        System.out.println("This is a message from Car class");
    }

    public String toString() {
        return "Car: " + super.toString() + ", wheels: " + this.wheels;
    }

}