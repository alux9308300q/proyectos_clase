package practica82;
import java.util.*;

public class Practica82 {

    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    /**
     * Declarar Variables
     */
    int dinero[]= new int [9]; 
    int i=0;
    /**
     * Introduccion por teclado
     */
    System.out.println("Introduce una cantidad de dinero: "); 
    int cant=teclado.nextInt();
    /**
     * Objeto
     */
    desglosar dineros=new desglosar(); 
    /**
     * Problema
     */
    dineros.SetDesglosar(cant,i);
    } 
} 

    
    

