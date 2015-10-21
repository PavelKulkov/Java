package com.kulkov.interfacePet;

/**
 * Класс для представления животного цыплёнок с помощью интерфейса Pet
 *
 * @author Pavel Kulkov, группа 12оит18к
 */
public class Chicken implements Pet{

    @Override
    public String getName() {
        return "Цыплёнок";
    }

    @Override
    public String getVoice() {
        return "Ко-Ко!";
    }
}
