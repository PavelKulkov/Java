package com.kulkov.chickenoregg;

/**
 * Created by Pavel Kulkov on 05.11.2015.
 */
public class Chicken {
    static Egg childThread;

    public static void main(String[] args) {

        childThread = new Egg();
        System.out.println("Let's go!");
        childThread.start();
        for(int i=0;i<5;i++){
            try {
                childThread.sleep(1000);
            }catch (InterruptedException ex){
                ex.getMessage();
            }
            System.out.println("Chicken!");
        }

        if(childThread.isAlive()){
            try{
                childThread.join();
            }catch (InterruptedException ex){
                ex.getMessage();
            }
            System.out.println("First chicken!");
        }
        else{
            System.out.println("First egg");
        }
        System.out.println("end!");
    }
}
