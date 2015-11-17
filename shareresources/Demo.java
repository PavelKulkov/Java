package com.kulkov.shareresources;

/**
 * Created by Pavel Kulkov on 17.11.2015.
 */
public class Demo {
    public  static int value=0;
    static ChildThread first;
    static ChildThread second;

    public static void main(String[] args) {
        first = new ChildThread();
        second = new ChildThread();

        first.start();
        second.start();

        try {
            first.join();
            second.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(value);
    }
}
