/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *
 * @author george
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* Declarar operantes */
    int num1;
    int num2;
    int resultado;
    int resto;
    
    /*Asignar operantes*/
    num1=19;
    num2=3;
    
    /* Operacion suma */
    resultado=num1/num2;
    
    /*Mostrar resultado*/
    System.out.println(resultado);
    
    /* Operacion resto */
    resto=num1-(num2*resultado);
    
    /*Mostrar resto*/
    System.out.println(resto);
    }
    
}
