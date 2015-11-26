package com.kulkov.QueueThread;

/**
 * Created by Pavel Kulkov on 24.11.2015.
 */
public class Demo {
    private int value;
    static Increment increment;
    static Decrement decrement;

    public int getValue() {
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }

    public Demo() {
        value = 0;
    }

    public static void main(String[] args) {
        Demo waitObject  = new Demo();
        increment = new Increment(waitObject);
        decrement = new Decrement(waitObject);

        increment.start();
        decrement.start();
    }
}
