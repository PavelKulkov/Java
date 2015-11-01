package com.circle;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Класса для представления окружности (круга).
 *
 * @author Pavel Kulkov, группа 12оит18к
 */
public class Circle {
    private double radius;
    private double centerX;
    private double centerY;
    final double PI = 3.14;

    public double getRadius() {
        return radius;
    }

    public double getX() {
        return centerX;
    }

    public double getY() {
        return centerY;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setX(double x) {
        this.centerX = x;
    }

    public void setY(double y) {
        this.centerY = y;
    }

    /**
     * Конструктор по умолчанию, инициализирующий объект координатами(x,y)=(0, 0) и радиусом(radius)=1.
     */
    public Circle(){
        radius = 1.0;
        centerX = 0.0;
        centerY = 0.0;
    }

    /**
     * Конструктор, позволяющий инициализировать объект при объявлении.
     *
     * @param radius Радиус окружности.
     * @param x Абсцисса центра окружности.
     * @param y Ордината центра окружности.
     */
    public Circle(double radius, double x, double y){
        this.radius = radius;
        this.centerX = x;
        this.centerY = y;
    }

    /**
     *  Метод, позволяющий координаты центра и радиус окружности вводить с клавиатуры.
     *
     */
    public void inputCircle(){
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("введите радиус:");
            radius = s.nextDouble();
            System.out.println("Введите координату X центра окружности");
            centerX = s.nextDouble();
            System.out.println("Введите координату Y центра окружности");
            centerY = s.nextDouble();
            s.close();

        }catch (InputMismatchException ex){
            System.out.println("Неверно введены данные");
            inputCircle();
        }
    }

    /**
     * Метод для вывода информации об объекте
     */
    public void outputCircle(){
        System.out.println("Circle{" +
                "radius=" + radius +
                ", x=" + centerX +
                ", y=" + centerY +
                '}');
    }

    /**
     *  Метод, вычисляющий длину окружности.
     *
     * @return Длина окружности.
     */
    public double lengthOfCircle(){
        return 2* PI *this.radius;
    }

    /**
     *  Метод, вычисляющий площадь круга.
     *
     * @return Площадь круга.
     */
    public double areaOfCircle(){
        return PI *(this.radius*this.radius);
    }

    /**
     *  Метод, определяющий равны или не равны круги по площади.
     *
     * @param circle объект содержащий информацию  о второй окружности. Из этого объекта нужна площадь.
     * @return Результат сравнения.
     */
    public boolean equalsCircle(Circle circle){
        if(this.areaOfCircle() == circle.areaOfCircle()){
            return  true;
        }
        else{
            return false;
        }
    }

    /**
     *  Метод, перемещающий центр круга в случайную точку квадрата координатной плоскости с диагональю
     *  от [-99;-99] до [99;99].
     */
    public void movingCenter(){
        this.setX((double)Math.round((Math.random()*199)-99*10)/10);
        this.setY((double)Math.round((Math.random()*199)-99*10)/10);
    }

    /**
     * Метод, вычисляющий расстояние между центрами двух окружностей.
     *
     * @param circle  Одна из окружностей.
     * @return Расстояние между центрами окружностей.
     */
    public double distanceBetweenMid(Circle circle){
        return  Math.sqrt(Math.pow(circle.getX() - this.getX(),2) + Math.pow(circle.getY() - this.getY(),2));
    }

    /**
     *  Метод, проверяющий, касаются ли окружности в одной точке.
     *
     * @param circle Одна из окружностей.
     * @return Результат проверки.
     */
    public boolean pointOfTouch(Circle circle){
        double d = distanceBetweenMid(circle);
        if((this.getRadius()+circle.getRadius()) == d || Math.abs(this.getRadius() - circle.getRadius()) == d){
            return true;
        }
        else{
            return false;
        }
    }
}
