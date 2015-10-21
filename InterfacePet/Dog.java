package com.kulkov.interfacePet;

/**
 * Класс для представления животного собака с помощью интерфейса Pet
 *
 * @author Pavel Kulkov, группа 12оит18к
 */
public class Dog implements Pet {

    @Override
    public String getName() {
        return "Собака";
    }

    @Override
    public String getVoice() {
        return "Гав-Гав!";
    }
}
