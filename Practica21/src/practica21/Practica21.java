
package practica21;
import java.util.Scanner;

public class Practica21 {

    public static void main(String[] args) {
        /*Variables*/
        double numero;
        double valor;
        
        
        /*Creacion teclado*/
        Scanner teclado=new Scanner(System.in);
        
        /*Mensaje*/
        System.out.println("Introduce un numero:");
        numero=teclado.nextInt();
        
        valor=(Math.log(numero)/Math.log(2));
        
        /*Operaciones*/
        if (numero==30){
            System.out.println("El numero es 30");
        }
        else if(numero>30){
            System.out.println("El numero es mayor de 30");
        }
        else if(numero<0){
            System.out.println("El numero es negativo");  
        }
       
        
        else if (numero%2==0){
            System.out.println("El numero es par");
            if(valor==2 || valor==3 || valor==4){
            System.out.println("Es potencia de dos");
            }
        }
        else {
            System.out.println("El numero es impar");
        }
        

    }
    
}
