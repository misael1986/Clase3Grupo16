/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase3grupo16;

/**
 *
 * @author Usuario
 */
public class Clase3Grupo16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VMC en texto
        /*Modelo model=new Modelo();
        Vista vista=new Vista();
        Control contr=new Control(vista,model);
        */
        //VMC en Grafico
        ModeloGrafico MG=new ModeloGrafico();
        VistaGrafica VG=new VistaGrafica();
        ControlGrafico CG=new ControlGrafico(VG,MG);
                
    }
    
}
