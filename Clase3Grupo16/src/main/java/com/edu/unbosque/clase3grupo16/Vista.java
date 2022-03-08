/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase3grupo16;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Vista {
    double x;
    double y;
    
    Vista(){
        Scanner tec=new Scanner(System.in);
        System.out.println("digite el valor de X: ");
        x=tec.nextDouble();//recoerdemos en en teclado el español TOCA
        //digitar los flotantes con ','
        System.out.println("digite el valor de Y: ");
        y=tec.nextDouble();
    }
    
    
}
