package com.kulkov.QueueThread;

/**
 * Created by Pavel Kulkov on 24.11.2015.
 */

public class Increment extends Thread {
    private final Demo waitObject;

    public Increment(Demo waitObject) {
        this.waitObject = waitObject;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            synchronized (waitObject) {
                while (waitObject.getValue() == 1) {
                    try {
                        waitObject.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                waitObject.setValue(waitObject.getValue() + 1);
                System.out.println(waitObject.getValue());
                waitObject.notifyAll();
            }
        }
    }
}
