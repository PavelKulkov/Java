package com.kulkov.QueueThread;

/**
 * Created by Pavel Kulkov on 24.11.2015.
 */
public class Demo {
    public static int value=0;
    static ChildThread childThread;


    public static void main(String[] args) {
        childThread = new ChildThread();
        childThread.start();
    }
}
