package com.kulkov;

/**
 * Класс для представления животного Лошадь
 *
 * @author Pavel Kulkov, группа 12оит18к
 */
public class Horse extends Pet {

    @Override
    void move() {
        System.out.println("Скачет!");
    }

    @Override
    void talk() {
        System.out.println("И-го-го!");
    }

    @Override
    void species() {
        System.out.println("Млекопитающие");
    }
}
