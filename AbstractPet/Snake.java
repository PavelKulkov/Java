package com.kulkov;

/**
 * Класс для представления животного Змея
 *
 * @author Pavel Kulkov, группа 12оит18к
 */
public class Snake extends Pet {
    @Override
    void move() {
        System.out.println("Ползёт!");
    }

    @Override
    void talk() {
        System.out.println("Пщщ!");
    }

    @Override
    void species() {
        System.out.println("Пресмыкающие");
    }
}
