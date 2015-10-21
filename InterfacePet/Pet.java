package com.kulkov.interfacePet;

/**
 * Интерфейс животных
 *
 * @author Pavel Kulkov, группа 12оит18К
 */
public interface Pet {
    /**
     * Метод возвращающий имя животного
     *
     * @return имя животного
     */
    String getName();

    /**
     * Метод возвращающий звук, который издаёт животное
     *
     * @return звук животного
     */
    String getVoice();
}
