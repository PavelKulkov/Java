package com.kulkov.chickenoregg;

/**
 * Created by Pavel Kulkov on 05.11.2015.
 */
public class Egg extends Thread {

    public void run(){
        for(int i=0;i<5;i++){
            try{
                sleep(1000);
            }catch (InterruptedException ex){
                ex.getMessage();
            }
            System.out.println("Egg!");
        }
    }
}
