package com.kulkov;

/**
 * Created by Olga on 10.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        Point a = new Point("a",0.0,0.0);
        Point b = new Point("b",2.0,1.0);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println("Расстояние между точками = "+ a.howLong(b));
        System.out.println(a.howQuarter());
    }
}
