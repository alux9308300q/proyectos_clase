
package practica22;
import java.util.Scanner;

public class Practica22 {


    public static void main(String[] args) {
        /*Declaracion de variables*/
        double nota;
        
        /*Crear scanner*/
        Scanner teclado=new Scanner(System.in);
        
        /*Mensaje*/
        System.out.println("¿Qué nota has sacado?");
        nota=teclado.nextDouble();
        
        /*Operaciones*/
        if(nota<5){
            System.out.println("Suspenso");
        }
        else if(nota>=5 && nota<6.5){
            System.out.println("Aprobado");
        }
        else if(nota>=6.5 && nota<8.5){
            System.out.println("Notable");
        }
        else if(nota>=8.5 && nota<10){
            System.out.println("Sobresaliente");
        }
        
        else{
            System.out.println("Matricula");
        }

    }
    
}
