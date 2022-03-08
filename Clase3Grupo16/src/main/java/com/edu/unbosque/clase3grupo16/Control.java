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
public class Control {/*La idea del controlador es que haga validaciones
    de los datos de cliente 
    Por ejemplo: en BD no es bueno dejat que entren consultas como dato entreada
    entonces en el controlador limpio datos peligrosos
    */
    
      
    Control(Vista v1,Modelo m1){
        
        System.out.println("Suma: "+m1.suma(v1.x,v1.y));
        System.out.println("Resta: "+m1.resta(v1.x,v1.y));
        System.out.println("Multiplicacion: "+m1.multiplicacion(v1.x,v1.y));
        System.out.println("Division: "+m1.division(v1.x,v1.y));
        
    
    }
      
    
}
