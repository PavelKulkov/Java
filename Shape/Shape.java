package com.kulkov.shape;

/**
 * Абстрактный класс для представления Фигуры
 *
 * @author Pavel Kulkov, группа 12оит18к
 */
public abstract class Shape {
    double a;
    double b;

    /**
     * Конструктор по умолчанию
     */
    public Shape(){
        this.a = 1;
        this.b = 1;
    }

    /**
     * Конструктор для фигур у которых не равные катеты или не равные стороны
     *
     * @param a ширина или катет
     * @param b высота или катет
     */
    public Shape(double a, double b){
        this.a = a;
        this.b = b;

    }

    /**
     * Конструктор для фигур у которых равные катеты или равные стороны
     *
     * @param a значение стороны или катета
     */
    public Shape(double a){
        this(a,a);
    }

    /**
     * Метод для вычисления площади фигуры
     *
     * @return значение площади фигуры
     */
    abstract double getArea();
}
