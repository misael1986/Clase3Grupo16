/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase3grupo16;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ModeloGrafico {
    
    public double suma(double a, double b) {
        return a + b;
    }

    public double resta(double a, double b) {
        return a - b;
    }

    public double multiplicacion(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            JOptionPane.showMessageDialog(null,"no es posible dividir por zero");
            return 0;
        } else {
            return a / b;
        }
    }
}
