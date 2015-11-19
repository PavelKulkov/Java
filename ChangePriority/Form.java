package com.kulkov.priorityThread;

import javax.swing.*;

/**
 * Created by Pavel Kulkov on 15.11.2015.
 */
public class Form extends JFrame{
    private JComboBox priorityFirstThread;
    private JComboBox prioritySecondThread;
    private JLabel valueFirstThread;
    private JLabel valueSecondThread;
    private JPanel panel;
    private JLabel difference;

    public void setDifference(String value) {
        difference.setText(value);
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
    }

}
