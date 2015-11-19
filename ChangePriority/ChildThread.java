package com.kulkov.priorityThread;

/**
 * Created by Pavel on 12.11.2015.
 */
public class ChildThread extends Thread {
    private  String value;

    public String getValue() {
        return value;
    }

    public void run() {

        for (int i = 0;;i++) {
            this.value = String.valueOf(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
