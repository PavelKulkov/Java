package com.kulkov;

/**
 * Класс для представления животного Лягушка
 *
 * @author Pavel Kulkov, 12оит18к
 */
public class Frog extends Pet {
    @Override
    void move() {
        System.out.println("Прыгает!");
    }

    @Override
    void talk() {
        System.out.println("Ква-ква!");
    }

    @Override
    void species() {
        System.out.println("Земноводные");
    }
}
