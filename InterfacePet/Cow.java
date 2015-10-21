package com.kulkov.interfacePet;

/**
 * Класс для представления животного корова с помощью интерфейса Pet
 *
 * @author Pavel Kulkov, группа 12оит18к
 */
public class Cow implements Pet{

    @Override
    public String  getName() {
        return "Корова";
    }

    @Override
    public String getVoice() {
       return "Му-му!";
    }
}
