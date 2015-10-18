package com.kulkov;

/**
 * Created by Olga on 10.09.2015.
 */
public class Point {
    private String nameOfPoint;
    private double x;
    private double y;

    public String getNameOfPoint() {
        return nameOfPoint;
    }

    public void setNameOfPoint(String nameOfPoint) {
        this.nameOfPoint = nameOfPoint;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(){
        this.nameOfPoint = "a";
        this.x = 0.0;
        this.y = 0.0;
    }
    public Point(String nameOfPoint, double x, double y){
        this.nameOfPoint = nameOfPoint;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "nameOfPoint='" + nameOfPoint + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
    public double howLong(Point b){
        return  Math.sqrt(Math.pow(b.getX() - this.getX(),2) + Math.pow(b.getY() - this.getY(),2));
    }
    public  String  howQuarter(){
        String tmp="";
        if(this.getX() == 0.0 && this.getY() == 0){
            tmp = "Точка находится в начале координат";
        }
        else {
            if (this.getX() == 0.0) {
                tmp = "Точка находится на оси X";
            }
            if (this.getY() == 0.0) {
                tmp = "Точка находится на оси Y";
            }
        }
        if(this.getX() > 0){
           if(this.getY() > 0 ){
               tmp = "1";
           }
            else{
               tmp = "4";
           }
        }
        if(this.getX() <0 ) {
            if(this.getY() < 0 ){
                tmp = "3";
            }
            else{
                tmp = "2";
            }
        }
        return tmp;
    }
}