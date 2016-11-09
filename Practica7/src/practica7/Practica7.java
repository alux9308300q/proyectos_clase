/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;
/*Importar scanner*/
import java.util.Scanner;

/**
 *
 * @author george
 */
public class Practica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            /*Declarar variables*/
            int radio;
            double pi=3.14;
            double resultado;
            /*Entrada por teclado*/
            Scanner teclado=new Scanner(System.in);
            /*Mensaje*/
            System.out.println("AREA");
            System.out.println("Dame el radio");
            /*Lectura por teclado*/
            radio=teclado.nextInt();
            /*Operacion area*/
            resultado=pi*(radio*radio);
            /*Mostrar resultado*/
            System.out.println("Resultado"); 
            System.out.println(resultado);
            
            /*Mensaje*/
            System.out.println("PERIMETRO");
            System.out.println("Dame el radio");
            /*Lectura por teclado*/
            radio=teclado.nextInt();
            /*Operacion perimetro*/
            resultado=2*pi*radio;
            /*Mostrar resultado*/
            System.out.println("Resultado"); 
            System.out.println(resultado);
    }
    
}
