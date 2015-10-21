package com.kulkov.interfacePet;

/**
 * Класс для демонстрации возможностей классов Cow,Chicken,Cat,Dog
 *
 * @author Pavel Kulkov, группа 12оит18к
 */
public class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getName() + " говорит " + cat.getVoice());

        Chicken chicken = new Chicken();
        System.out.println(chicken.getName() + " говорит " + chicken.getVoice());

        Cow cow = new Cow();
        System.out.println(cow.getName() + " говорит " + cow.getVoice());

        Dog dog =new Dog();
        System.out.println(dog.getName()+" говорит "+dog.getVoice());
    }
}
