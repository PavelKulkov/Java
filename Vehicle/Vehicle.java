package com.vehicle;

/**
 * Класс для представления средств передвижения
 *
 * @author Pavel Kulkov, группа 12оит18к
 */
public class Vehicle {

    private int type;
    private int maxSpeed;

    /**
     * @param type 1 - Земля, 2 - Вода, 3 - Небо.
     * @param maxSpeed Максимальная скорость
     */
    public Vehicle(int type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Метод для вывода сообщения
     */
    public void Message(){
        System.out.println("This is a message from Vehicle class");
    }

    /**
     * Метод возвращающий индекс типа средства передвижения
     *
     * @return 1,2,3
     */
    public int getType() {
        return this.type;
    }

    /**
     * Метод возращающий тип средства передвижения
     *
     * @return Earth, Water, Sky
     */
    public String getTypeAsString(){
        switch (this.type) {
            case 1:
                return "Earth";
            case 2:
                return "Water";
            case 3:
                return "Sky";
        }
        return "";
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String toString() {
        return "type: " + this.getTypeAsString() + ", max speed: " + this.maxSpeed;
    }
}
