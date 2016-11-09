
package practica16;
/*Importar scanner*/
import java.util.Scanner;

public class Practica16 {

    public static void main(String[] args) {
        /*Declarar variables*/
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
        if(nota>=5 && nota<6.5){
            System.out.println("Aprobado");
        }
        if(nota>=6.5 && nota<8.5){
            System.out.println("Notable");
        }
        if(nota>=8.5 && nota<10){
            System.out.println("Sobresaliente");
        }
        
        if(nota==10){
            System.out.println("Matricula");
        }
}
}