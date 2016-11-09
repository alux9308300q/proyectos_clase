/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;
/*Importar scanner*/
import java.util.Scanner;
/**
 *
 * @author george
 */
public class Practica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Declarar variables*/
        int lado;
        double resultado;
        /*Entrada por teclado*/
        Scanner teclado=new Scanner(System.in);
        /*Mensaje*/
        System.out.println("Dime el lado");
        /*Lectura por teclado*/
        lado=teclado.nextInt();
        /*Operacion area*/
        resultado=6*Math.pow(lado,2);
        /*Mostrar resultado*/
        System.out.println("Resultado");
        System.out.println(resultado);
        
         /*Mensaje*/
        System.out.println("Dime el lado");
        /*Lectura por teclado*/
        lado=teclado.nextInt();
        /*Operacion volumen*/
        resultado=Math.pow(lado,3);
        /*Mostrar resultado*/
        System.out.println("Resultado");
        System.out.println(resultado);
    }
    
}
