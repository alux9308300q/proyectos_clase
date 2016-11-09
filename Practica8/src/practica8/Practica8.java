/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8;
/*Importar scanner*/
import java.util.Scanner;

/**
 *
 * @author george
 */
public class Practica8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Declarar variables*/
        int altura;
        int base;
        int resultado;
        /*Entrada por teclado*/
        Scanner teclado=new Scanner(System.in);
        /*Mensaje*/
        System.out.println("Dame la altura");
        /*Lectura por teclado*/
        altura=teclado.nextInt();
         /*Mensaje*/
        System.out.println("Dame la base");
        /*Lectura por teclado*/
        base=teclado.nextInt();
        /*Operacion area*/
        resultado=base*altura/2;
        /*Mostrar resultado*/
        System.out.println("Resultado");
        System.out.println(resultado);
                
    }
    
}
