/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase3grupo16;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Usuario
 */
public class VistaGrafica extends JFrame{
    
    JLabel L_Num1;
    JLabel L_Num2;
    JTextField T_Num1;
    JTextField T_Num2;
    JButton calc;
    JTextArea respu;
    JPanel panel;

    VistaGrafica(){
    panel=new JPanel(new FlowLayout());
    panel.setBackground(Color.GREEN);
    this.setSize(500,300);
    this.L_Num1=new JLabel("Numero a:");
    this.L_Num1.setFont(new Font("Comic Sans MS",Font.ITALIC,20));
    this.L_Num2=new JLabel("Numero b:");
    this.T_Num1=new JTextField(10);
    this.T_Num2=new JTextField(10);
    this.calc=new JButton("Calcular");
    this.respu= new JTextArea();
    panel.add(L_Num1);panel.add(T_Num1);panel.add(L_Num2);
    panel.add(T_Num2);
    panel.add(calc);
    panel.add(respu);
    this.add(panel);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }

    
    
    
}
