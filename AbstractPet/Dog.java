package com.kulkov;

/**
 * Класс для представления животного Собака
 *
 * @author Pavel Kulkov, группа 12оит18к
 */
public class Dog extends Pet {
    @Override
    void move() {
        System.out.println("Бежит!");
    }

    @Override
    void talk() {
        System.out.println("Гав-Гав!");
    }

    @Override
    void species() {
        System.out.println("Млекопитающие");
    }
}
