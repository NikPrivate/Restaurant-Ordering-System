package com.mycompany.restaurantproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Welcome extends JFrame {


    JPanel jp = new JPanel();

    JButton myButton = new JButton("Order Here");

    JLabel label = new JLabel();
    
    public static void main(String[]args){
        Welcome wc = new Welcome();
        wc.setVisible(true);
    }
   

    Welcome() {
        
       
      
        label.setText("WELCOME TO ADEMS'S TOYE");
        add(label);


        myButton.setBounds(100, 300, 200, 40);
        myButton.setFocusable(false);
        
        ImageIcon image = new ImageIcon("C:\\Users\\nikiz\\Documents\\NetBeansProjects\\RestaurantProject\\src\\main\\java\\image\\image.png");
        Image img = image.getImage();
        Image imageScale = img.getScaledInstance(150,150,150);
        ImageIcon IconScale = new ImageIcon(imageScale);
        label.setIcon(IconScale);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0,0,0));
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setIconTextGap(10);
        label.setOpaque(false);  
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(50,0,300,250);


        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == myButton) {

                    dispose();
                    dine_in DineIn = new dine_in();

                }

            }
        });

        
        add(myButton);
        setSize(420, 420);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        getContentPane().setBackground(new Color(204,255,255));
        setTitle("Restaurant Ordering System");
        add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);
        setLocation(x, y);


    }
    
    
}