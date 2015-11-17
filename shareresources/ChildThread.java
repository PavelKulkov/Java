package com.kulkov.shareresources;

/**
 * Created by Pavel Kulkov on 17.11.2015.
 */
public class ChildThread extends Thread {
    @Override
    public  void run() {
        synchronized (ChildThread.class){
        for (int i = 0; i < 1000; i++) {
                Demo.value++;
            }
        }
    }

}
