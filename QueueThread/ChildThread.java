package com.kulkov.QueueThread;

/**
 * Created by Pavel Kulkov on 24.11.2015.
 */
public class ChildThread extends Thread {
    private int value=0;
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Increment();
                Decrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public synchronized void Increment() throws InterruptedException {
        while(value == 1){
            wait();
        }
        value++;
        System.out.println(value);
        notifyAll();
    }
    public synchronized void Decrement() throws InterruptedException {
        while(value == 0){
            wait();
        }
        value--;
        System.out.println(value);
        notifyAll();
    }
}
