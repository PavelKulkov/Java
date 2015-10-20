package com.kulkov;

/**
 * Класс для демонтстрации 
 */
public class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.move();
        cat.talk();
        cat.species();

        Frog frog = new Frog();
        frog.move();
        frog.talk();
        frog.species();

        Dog dog = new Dog();
        dog.move();
        dog.talk();
        dog.species();

        Horse horse = new Horse();
        horse.move();
        horse.talk();
        horse.species();

        Snake snake = new Snake();
        snake.move();
        snake.talk();
        snake.species();
    }
}
