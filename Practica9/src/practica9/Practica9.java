/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9;
/*Importar scanner*/
import java.util.Scanner;
/**
 *
 * @author george
 */
public class Practica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Declarar variables*/
        int perimetro;
        int apotema;
        int resultado;
        /*Entrada por teclado*/
        Scanner teclado=new Scanner(System.in);
        /*Mensaje*/
        System.out.println("Dame perimetro");
        /*Lectura por teclado*/
        perimetro=teclado.nextInt();
         /*Mensaje*/
        System.out.println("Dame la apotema");
        /*Lectura por teclado*/
        apotema=teclado.nextInt();
        /*Operacion area*/
        resultado=perimetro*apotema/2;
        /*Mostrar resultado*/
        System.out.println("Resultado");
        System.out.println(resultado);
    }
    
}
