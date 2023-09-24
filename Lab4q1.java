/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4q1;

/**
 *
 * @author DELL
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab4q1 
{
    static void greetings()
    {
        System.out.println("Hey I am greetings function,added for git question!");
    }
    
    
    public static void main(String[] args) 
    {
        JFrame frame1 = new JFrame("Swing Hello World");
        frame1.setSize(500, 250);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton button = new JButton("Click Me");

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                JOptionPane.showMessageDialog(frame1,"Hello,Swing!");
            }
        }
        );

        frame1.add(button);

        frame1.setVisible(true);
    }
}