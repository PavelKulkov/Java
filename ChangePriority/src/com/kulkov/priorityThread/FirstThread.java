package com.kulkov.priorityThread;

/**
 * Created by Pavel on 12.11.2015.
 */
public class FirstThread extends Thread {
    public void run() {
        setPriority(10);

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(10);
            } catch (Exception ex) {
            }

        }
    }
}
