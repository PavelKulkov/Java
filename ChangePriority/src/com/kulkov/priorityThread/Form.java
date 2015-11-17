package com.kulkov.priorityThread;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Pavel Kulkov on 15.11.2015.
 */
public class Form extends JFrame{
    private JComboBox priorityFirstThread;
    private JComboBox prioritySecondThread;
    private JLabel valueFirstThread;
    private JLabel valueSecondThread;
    private JPanel panel;
    private JLabel eq;

    public void setEq(String value) {
        eq.setText(value);
    }

    public void setValueFirstThread(String value) {
        valueFirstThread.setText(value);
    }

    public void setValueSecondThread(String value) {
        valueSecondThread.setText(value);
    }

    public JComboBox getPriorityFirstThread() {
        return priorityFirstThread;
    }

    public JComboBox getPrioritySecondThread() {
        return prioritySecondThread;
    }

    public Form(){
        super("Form");
        setContentPane(panel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        priorityFirstThread.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
