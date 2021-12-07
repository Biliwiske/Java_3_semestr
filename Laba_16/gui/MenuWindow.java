package Laba_16.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuWindow  extends JFrame {
    JLabel Label;
    JButton Kitchen_button = new JButton("Меню обслуживания");
    JButton InternetUser_button = new JButton("Меню интернет заказа");
    JButton Waiters_button = new JButton("Меню официанта");
    JButton all_window = new JButton("Открыть все окна");

    public MenuWindow(KitchenWindow kwa, InternetUserWindow iwa, WaitersWindow wwa)
    {
        setSize(480, 480);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("Меню выбора окна");
        Label = new JLabel("Выберите интересующее вас окно");
        Container w = getContentPane();
        w.setLayout(null);
        Label.setBounds(125, 40, 250, 20);
        Kitchen_button.setBounds(100, 90, 250, 40);
        InternetUser_button.setBounds(100, 150, 250, 40);
        Waiters_button.setBounds(100, 210, 250, 40);
        all_window.setBounds(80, 350, 290, 40);
        w.add(Label);
        w.add(Kitchen_button);
        w.add(InternetUser_button);
        w.add(Waiters_button);
        w.add(all_window);
        all_window.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                kwa.setVisible(true);
                iwa.setVisible(true);
                wwa.setVisible(true);
            }
        });
        Kitchen_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                kwa.setVisible(true);
            }
        });
        InternetUser_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                iwa.setVisible(true);
            }
        });
        Waiters_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                wwa.setVisible(true);
            }
        });

    }


}