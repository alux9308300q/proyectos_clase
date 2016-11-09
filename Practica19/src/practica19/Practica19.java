
package practica19;
import java.util.Scanner;

public class Practica19 {

    public static void main(String[] args) {
        /*Variables*/
        int dia;
        
        /*Creacion teclado*/
        Scanner teclado=new Scanner(System.in);
        
        /*Mensaje*/
        System.out.println("Introduce el numero del dia de la semana:");
        dia=teclado.nextInt();
        
        /*Operaciones*/
        switch(dia){
            case 1: System.out.println("Lunes");
            break;
            case 2: System.out.println("Martes");
            break;
            case 3: System.out.println("Miercoles");
            break;
            case 4: System.out.println("Jueves");
            break;
            case 5: System.out.println("Viernes");
            break;
            case 6: System.out.println("Sabado");
            break;
            case 7: System.out.println("Domingo");
        }

    }
    
}
