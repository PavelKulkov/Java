package com.kulkov.priorityThread;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Pavel Kulkov on 15.11.2015.
 */
public class Demo {
    static ChildThread firstThread;
    static ChildThread secondThread;

    public static void main(String[] args) {
        Form form = new Form();
        JComboBox priorityFirstThread = form.getPriorityFirstThread();
        JComboBox prioritySecondThread = form.getPrioritySecondThread();
        firstThread = new ChildThread();
        secondThread = new ChildThread();
        firstThread.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        secondThread.start();
        int tmp;
        for(;;){
            form.setValueFirstThread(firstThread.getValue());
            form.setValueSecondThread(secondThread.getValue());
            priorityFirstThread.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    firstThread.setPriority(priorityFirstThread.getSelectedIndex() + 1);
                }
            });
            prioritySecondThread.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    secondThread.setPriority(prioritySecondThread.getSelectedIndex()+1);
                }
            });
            tmp = Integer.valueOf(firstThread.getValue())-Integer.valueOf(secondThread.getValue());
            form.setEq(String .valueOf(tmp));
            /*
            if(firstThread.getValue().equals(secondThread.getValue())){
                form.setEq("=");
            }
            if(Integer.valueOf(firstThread.getValue()) > Integer.valueOf(secondThread.getValue())){
                form.setEq(">");
            }else {
                form.setEq("<");
            }
        */
        }

    }
}
