
package practica17;
/*Importar scanner*/
import java.util.Scanner;

public class Practica17 {


    public static void main(String[] args) 
    {
        /*Declarar variables*/
        int año;
        
        /*Crear scanner*/
        Scanner teclado=new Scanner(System.in);
        
        /*Mensaje*/
        System.out.println("¿Qué año es?");
        año=teclado.nextInt();
        
        /*Operaciones*/
        if(año%4==0 ||año%100==0 && año%400==0){
        System.out.println("Es bisiesto");
        }
        else {
        System.out.println("No es bisiesto");
        }    
        
            }
    }
    

