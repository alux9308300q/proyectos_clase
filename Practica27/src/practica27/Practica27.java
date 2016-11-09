
package practica27;
import java.util.Scanner;

public class Practica27 {

    public static void main(String[] args) {
        /*Varibles*/
        int numero;
        int tabla;
        
        /*Scanner*/
        Scanner teclado=new Scanner(System.in);
        
        /*Mensaje*/
        System.out.println("Introduce un numero:");
        numero=teclado.nextInt();
        System.out.println("Los resultados de la tabla de multiplicar del numero introducido es:");
        /*Operaciones*/
        for(int contador=0;contador<=10;contador++){
            tabla=numero*contador;
            
            System.out.println(tabla);
            
        }
        
        

    }
    
}
