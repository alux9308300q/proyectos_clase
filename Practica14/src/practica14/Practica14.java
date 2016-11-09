
package practica14;
/*Importar scanner*/
import java.util.Scanner;
public class Practica14 {

    public static void main(String[] args) {

       /*Declarar variables*/
       int edad;
       int resultado;
       
       /*Entrada por teclado*/
       Scanner teclado=new Scanner(System.in);
       
       /*Mensaje*/
       System.out.println("Introduce la edad");
       
       /*Lectura por teclado*/
       edad=teclado.nextInt();
       
       /*Operacion*/
       
       if(edad>=21){
           System.out.println("Es apto para sacarse el carnet");          
          
       }
       else {
           System.out.println("No es apto para sacarse el carnet");
       }
               
    }
    
}
