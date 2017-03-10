/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Terminal {
    
    Calculadora calculadoraTerm;
    int opcion;
    Scanner miescaner=new Scanner(System.in);
    double numero1;
    double numero2;
    
    
    public void operacion(){
        
        System.out.println("DIGITE LA OPCION");
        System.out.println("1.SUMAR");
        System.out.println("2.RESTAR");
        System.out.println("3.MULTIPLICAR");
        System.out.println("4.DIVIDIR");
        opcion = miescaner.nextInt();
        System.out.println("Ingrese el primer numero");
        numero1 = miescaner.nextDouble();
        System.out.println("Ingrese el segundo numero");
        numero2 = miescaner.nextDouble();
        switch (opcion)
        {
            case 1: System.out.println(calculadoraTerm.Sumar(numero1,numero2));break;
            case 2: System.out.println(calculadoraTerm.Restar(numero1,numero2));break;
            case 3: System.out.println(calculadoraTerm.Multiplicar(numero1,numero2));break;
            case 4: System.out.println(calculadoraTerm.Dividir(numero1,numero2));break;
            
        }  
        
    }
}
    
    
    

    
    
    
    
