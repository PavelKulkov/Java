package com.temperature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Pavel on 04.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        Temperature t = new Temperature();
        t.getRefresh().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double[] arr = t.initArray();
                arr = t.quickSort(arr, 0, 4);
                //На вывод отправляем отсортированный по возрастанию массив
                t.outputTemperatures(arr);
                t.getAverageTemperatureLabel().setText(String.valueOf(t.averageTemperature(arr)));
                t.getMinTemperatureLabel().setText(String.valueOf(t.minTemperature(arr)));
                t.getMaxTemperatureLabel().setText(String.valueOf(t.maxTemperature(arr)));
                t.pack();
            }
        });
    }
}
