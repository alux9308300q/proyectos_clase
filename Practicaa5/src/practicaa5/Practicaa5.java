/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaa5;
/*Importar scanner*/
import java.util.Scanner;
/**
 *
 * @author george
 */
public class Practicaa5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Declaracion variables*/
        int edad; 
        /*Entrada por teclado*/
        Scanner teclado=new Scanner(System.in);
        /*Mensaje*/
        System.out.println("Dame la edad");
        /*Lectura por teclado*/
        edad=teclado.nextInt();
        /*Mostrar edad*/
        System.out.println("Edad"+edad+"años");
        
    }
    
}
