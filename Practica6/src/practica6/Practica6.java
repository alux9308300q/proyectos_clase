/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;
/*Importar scanner*/
import java.util.Scanner;
/**
 *
 * @author george
 */
public class Practica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*Declarar variables*/
    int num1;
    int num2;
    int resultado;
        /*Entrada por teclado*/
        Scanner teclado=new Scanner(System.in);
        /*Mensaje*/
        System.out.println("SUMA");
        System.out.println("Introduce el primer numero");
        /*Lectura por teclado*/
        num1=teclado.nextInt();
        /*Mensaje*/
        System.out.println("Introduce el segundo numero");
        /*Lectura por teclado*/
        num2=teclado.nextInt();
        /*Operacion suma*/
        resultado=num1+num2;
        /*Mostrar resultado*/
        System.out.println("Resultado"); 
        System.out.println(resultado);

            /*Mensaje*/
            System.out.println("RESTA");
            System.out.println("Introduce el primer numero");
            /*Lectura por teclado*/
            num1=teclado.nextInt();
            /*Mensaje*/
            System.out.println("Introduce el segundo numero");
            /*Lectura por teclado*/
            num2=teclado.nextInt();
            /*Operacion resta*/
            resultado=num1-num2;
            /*Mostrar resultado*/
            System.out.println("Resultado");
            System.out.println(resultado);
            
                /*Mensaje*/
                System.out.println("MULTIPLICACION");
                System.out.println("Introduce el primer numero");
                /*Lectura por teclado*/
                num1=teclado.nextInt();
                /*Mensaje*/
                System.out.println("Introduce el segundo numero");
                /*Lectura por teclado*/
                num2=teclado.nextInt();
                /*Operacion resta*/
                resultado=num1*num2;
                /*Mostrar resultado*/
                System.out.println("Resultado");
                System.out.println(resultado);
            
            /*Mensaje*/
            System.out.println("DIVISION");
            System.out.println("Introduce el primer numero");
            /*Lectura por teclado*/
            num1=teclado.nextInt();
            /*Mensaje*/
            System.out.println("Introduce el segundo numero");
            /*Lectura por teclado*/
            num2=teclado.nextInt();
            /*Operacion resta*/
            resultado=num1/num2;
            /*Mostrar resultado*/
            System.out.println("Resultado");
            System.out.println(resultado);
            
    
    
    
    }
    
}
