/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase3grupo16;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class ControlGrafico implements ActionListener{
    
    VistaGrafica Vista;
    ModeloGrafico Modelo;
    
    ControlGrafico(VistaGrafica V,ModeloGrafico M){
        this.Vista=V;
        this.Modelo=M;
        this.Vista.calc.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if( e.getSource()==this.Vista.calc){
           double dato1=Double.parseDouble(this.Vista.T_Num1.getText());
           //getText captura los datos en el JTextField
           //Double.parseDouble() convertor el String a double
           double dato2=Double.parseDouble(this.Vista.T_Num2.getText());
           
           //System.out.println(dato1+" -----  "+dato2);
           
           double suma=this.Modelo.suma(dato1, dato2);
           double resta=this.Modelo.resta(dato1, dato2);
           double mult=this.Modelo.multiplicacion(dato1, dato2);
           double divi=this.Modelo.division(dato1, dato2);
           
           this.Vista.respu.setText(suma+"\n"+resta+"\n"+mult+"\n"+divi+"\n");
           //setText envía a JTextArea datos
           
       }
    }
}
