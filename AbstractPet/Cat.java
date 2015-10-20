package com.kulkov;
/**
 * Класс для представления животного Кошка
 *
 * @author Pavel Kulkov, группа 12оит18к
 */
public class Cat extends Pet{

    @Override
    void move() {
        System.out.println("Крадётся!");
    }

    @Override
    void talk() {
        System.out.println("Мяу-мяу!");
    }

    @Override
    void species() {
        System.out.println("Млекопитающие");
    }
}


