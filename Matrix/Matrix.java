package com.matrix;


/**
 * Created by Pavel on 05.09.2015.
 */
public class Matrix {
    public static void main(String[] args) {

        int[][] arr = new int[5][];

        for(int i=0;i<5;i++){
            arr[i] = new  int[(int)Math.round(Math.random()*10)];
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = 0;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
