/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Estudiantes
 */
public class Calculadora {

    
    public double Sumar(double numero1,double numero2){
    
        double Suma = 0;
        Suma=numero1 + numero2;
        return Suma;
    }
    public double Restar(double numero1,double numero2){
    
        double Resta = 0;
        Resta=numero1 - numero2;
        return Resta;
    }
    public double Multiplicar(double numero1,double numero2){
    
        double Multiplicacion = 0;
        Multiplicacion=numero1 * numero2;
        return Multiplicacion;
    }
    public double Dividir(double numero1,double numero2){
    
        double Division = 0;
        Division=numero1 / numero2;
        return Division;
    }
    
    
}
