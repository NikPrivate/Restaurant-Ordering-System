package com.mycompany.restaurantproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class table_number implements ActionListener {

        JFrame frame = new JFrame();
        JButton myButton = new JButton("Order Now");
        JButton btn = new JButton("Back");
        JLabel label = new JLabel("TABLE NUMBER");

        JTextField name_field = new JTextField();
        
        public static void main(String[]args){
        table_number TN = new table_number();
        TN.setVisible(true);
            
        }

        table_number() {


            label.setBounds(110,50,200,20);
            frame.add(label);
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setFont(new Font("Arial",Font.PLAIN,20));

            name_field.setBounds(160,130,100,30);
            
            
            myButton.setBounds(160, 200, 100, 40);
            myButton.setFocusable(false);
            myButton.addActionListener(this);
            
            btn.setBounds(160, 250, 100, 40);
            btn.setFocusable(false);
            btn.addActionListener(this);


            frame.add(name_field);
            frame.add(myButton);
            frame.add(btn);
            frame.getContentPane().setBackground(new Color(204,255,255));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(420, 420);
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setResizable(false);

            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
            int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
            frame.setLocation(x, y);


        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == myButton) {

                frame.dispose();
                FoodMenu foodmenu = new FoodMenu();
                foodmenu.setLocationRelativeTo(null);
                foodmenu.setVisible(true);
            }else if(e.getSource() == btn){
                frame.dispose();
                dine_in DineIn = new dine_in();
            }
        }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

