package com.temperature;

import javax.swing.*;
import java.util.List;
import java.util.*;


/**
 * Created by Pavel on 03.09.2015.
 */
public class Temperature extends JFrame{
    private JPanel panel;
    private JLabel averageTemperatureLabel;
    private JLabel minTemperatureLabel;
    private JLabel maxTemperatureLabel;
    private JButton refresh;
    private JLabel firstTemperature;
    private JLabel secondTemperature;
    private JLabel thirdTemperature;
    private JLabel fourthTemperature;
    private JLabel fifthTemperature;

    public JButton getRefresh() {
        return refresh;
    }

    public  JLabel getAverageTemperatureLabel(){
        return averageTemperatureLabel;
    }

    public JLabel getMinTemperatureLabel(){
        return minTemperatureLabel;
    }

    public  JLabel getMaxTemperatureLabel(){return maxTemperatureLabel;}

    public Temperature(){
        super("Temperature");
        setContentPane(panel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public double[] initArray(){
        double arr[] = new double[5];
        for (int i = 0; i < 5; i++) {
            //После рандома округляем число до 1 знака после запятой
            arr[i] = (double) Math.round((35 + Math.random() * 6) * 10) / 10;
        }
        return arr;
    }
    public void outputTemperatures(double[] arr) {
        firstTemperature.setText(String.valueOf(arr[0]));
        secondTemperature.setText(String.valueOf(arr[1]));
        thirdTemperature.setText(String.valueOf(arr[2]));
        fourthTemperature.setText(String.valueOf(arr[3]));
        fifthTemperature.setText(String.valueOf(arr[4]));

    }
    public double averageTemperature(double arr[]){
        double averageTemperature=arr[0];
        for(int i=1; i<5;i++){
            averageTemperature += arr[i];
        }
    return averageTemperature/arr.length;
    }
    public  double minTemperature(double arr[]){
        double minTemperature = arr[0];
        for(int i=1;i<5;i++){
            if(minTemperature > arr[i]){
                minTemperature = arr[i];
            }
        }
        return minTemperature;
    }
    public double maxTemperature(double arr[]){
        double maxTemperature = arr[0];
        for(int i=1;i<5;i++){
            if(maxTemperature < arr[i]){
                maxTemperature = arr[i];
            }
        }
        return maxTemperature;
    }
    public  double[] quickSort(double arr[], int left, int right){
        int l = left;
        int r = right;
        double tmp = 0;
        double mid = arr[((l + r) / 2)];

        while (l<=r){
            while (arr[l]<mid && l<=right){
                l++;
            }
            while(arr[r]> mid && r>=left){
                r--;
            }
            if(l<=r){
                tmp = arr[l];
                arr[l]=arr[r];
                arr[r]=tmp;
                l++;
                r--;
            }
        }
        if(r>left){
            quickSort(arr,left,r);
        }
        if(l<right) {
            quickSort(arr, l, right);
        }
        return arr;
    }
}
