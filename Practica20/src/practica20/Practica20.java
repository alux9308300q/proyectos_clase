
package practica20;
import java.util.Scanner;

public class Practica20 {

    public static void main(String[] args) {
        /*Variables*/
        int plato;
        
        /*Creacion teclado*/
        Scanner teclado=new Scanner(System.in);
        
        /*Mensaje*/
        System.out.println("Cual es el numero de plato que has cocinado?");
        plato=teclado.nextInt();
        
        /*Operaciones*/
        switch(plato){
            case 1: System.out.println("Has cocinado espaguetis a la carbonara, cuyos ingredientes son: espaguetis, cebolla, bacon, nata y queso");
            break;
            case 2: System.out.println("Has cocinado paella valenciana, cuyos ingredientes son: garrofon, tomate, judia verde, pollo, sal, aceite, arroz, agua y azafran");
            break;
            case 3: System.out.println("Has cocinado un BigMac, cuyos ingredientes son: carne de vacuno, lechuga, cebolla, pepinillo, queso chedar y salsa especial");
            break;
            case 4: System.out.println("Has cocinado tarta de queso, cuyos ingredientes son: galletas, nata liquida, queso cremoso, mantequilla, gelatina, mermelada y azucar");

    }
    
}
}
