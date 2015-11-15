package com.kulkov.priorityThread;

/**
 * Created by Pavel on 12.11.2015.
 */
public class Demo extends Thread {
    static  FirstThread firstThread;
    static SecondThread secondThread;

    public static void main(String[] args) {
        firstThread = new FirstThread();
        secondThread = new SecondThread();
        firstThread.start();
        secondThread.start();
    }
}
