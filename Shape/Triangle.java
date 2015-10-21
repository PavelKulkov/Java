package com.kulkov.shape;

/**
 * Класс для представления Треугольника
 *
 * @author Pavel Kulkov, группа 12оит18к
 */
public class Triangle extends Shape {
    public Triangle(){
        super();
    }

    public Triangle(double a, double b) {
        super(a,b);
    }
    public Triangle(double a){
        super(a);
    }
    @Override
    double getArea() {
        return (a * b) * 0.5;
    }
}
