/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11;
/*Importar scanner*/
import java.util.Scanner;
/**
 *
 * @author george
 */
public class Practica11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Declarar variables*/
        double radio;
        double resultado;
        /*Entrada por teclado*/
        Scanner teclado=new Scanner(System.in);
        /*Mensaje*/
        System.out.println("AREA Y VOLUMEN");
        System.out.println("Introduce el radio:");
        /*Lectura por teclado*/
        radio=teclado.nextInt();
        /*Operacion area*/
        resultado=4*Math.PI*Math.pow(radio, 2);
        /*Mostrar resultado*/
        System.out.println("Resultado area:");
        System.out.println(resultado);
        
        /*Operacion volumen*/
        resultado=Math.PI*4/3*Math.pow(radio,3);
        /*Mostrar resultado*/
        System.out.println("Resultado volumen:");
        System.out.println(resultado);
        
                
    }
    
}
