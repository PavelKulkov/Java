package com.kulkov.interfacePet;

/**
 * Класс для представления животного кошка с помощью интерфейса Pet
 *
 * @author Pavel Kulkov, группа 12оит18к
 */
public class Cat implements Pet {

    @Override
    public String getName() {
        return "Кошка";
    }

    @Override
    public String getVoice() {
        return "Мяу-Мяу!";
    }
}
