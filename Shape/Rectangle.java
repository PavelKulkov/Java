package com.kulkov.shape;

/**
 * Класс для представления Прямоугольника
 *
 * @author Pavel Kulkov, группа 12оит18к
 */
public class Rectangle extends Shape {

    public Rectangle(){
        super();
    }
    public Rectangle(double a, double b) {
        super(a,b);
    }
    public Rectangle(double a){
        super(a);
    }
    @Override
    double getArea() {
        return a * b;
    }
}
