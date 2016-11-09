
package extra1;
/*Importar scanner*/
import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {
        /*Declarar variables*/
        int numero;
        
        /*Crear scanner*/
        Scanner teclado=new Scanner(System.in);
        
        /*Mensaje*/
        System.out.println("Introduce un numero entre 0 y 9999");
        numero=teclado.nextInt();
        
        /*Operaciones*/
        if(numero<10){
            System.out.println("El numero tiene una cifra");
        }
        if(numero>=10 && numero<100){
            System.out.println("El numero tiene dos cifras");
        }
        if(numero>=100 && numero<1000){
            System.out.println("El numero tiene tres cifras");
        }
        if(numero>=1000 && numero<10000){
            System.out.println("El numero tiene cuatro cifras");
        }
        
       
        

    }
    
}
