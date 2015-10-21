package com.kulkov.shape;

/**
 * Класс для демонстрации возможностей классов Rectangle, Triangle
 *
 * @author Pavel Kulkov, группа 12оит18к
 */
public class Demo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea());

        Rectangle square = new Rectangle(2);
        System.out.println(square.getArea());

        rectangle = new Rectangle(2,4);
        System.out.println(rectangle.getArea());

        Triangle triangle = new Triangle();
        System.out.println(triangle.getArea());

        triangle = new Triangle(5);
        System.out.println(triangle.getArea());

        triangle = new Triangle(4,1);
        System.out.println(triangle.getArea());
    }
}
