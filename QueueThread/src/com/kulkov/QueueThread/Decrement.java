package com.kulkov.QueueThread;

/**
 * Created by Pavel on 25.11.2015.
 */

public class Decrement extends Thread {
    private final Demo waitObject;

    public Decrement(Demo waitObject) {
        this.waitObject = waitObject;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (waitObject) {
                while (waitObject.getValue() == 0) {
                    try {
                        waitObject.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                waitObject.setValue(waitObject.getValue() - 1);
                System.out.println(waitObject.getValue());
                waitObject.notifyAll();
            }
        }
    }
}
