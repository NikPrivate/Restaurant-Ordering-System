package com.mycompany.restaurantproject;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dine_in implements ActionListener {

    JFrame frame = new JFrame();

    JButton myButton = new JButton("DINE IN ");

    JButton b = new JButton("TAKE AWAY");
    
    public static void main(String[]args){
        dine_in Di = new dine_in();
        Di.setVisible(true);
    }

    dine_in() {


        myButton.setBounds(100 , 100, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        b.setBounds(100, 250, 200, 40);
        b.setFocusable(false);
        b.addActionListener(this);

        frame.add(myButton);
        frame.add(b);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(204,255,255));
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == myButton) {

            frame.dispose();
            table_number TableNumber = new table_number();

        }
        else if(e.getSource() == b){

            frame.dispose();
            FoodMenu foodmenu = new FoodMenu();
            foodmenu.setLocationRelativeTo(null);
            foodmenu.setVisible(true);
        }
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}