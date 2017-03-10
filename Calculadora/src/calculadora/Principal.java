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
public class Principal {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora miOperacion =new Calculadora();
        /*
        Terminal miTerminal = new Terminal();
        miTerminal.calculadoraTerm=miOperacion;
        boolean repeticion=true;
        do{
        miTerminal.operacion();
        }while(repeticion=true);
        
*/
        
        Grafico miGrafico=new Grafico();
        miGrafico.calculadoraGraf=miOperacion;
        miGrafico.setVisible(true);
        
        
         
        
    }
    
}
