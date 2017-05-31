package practica89;
import java.util.*;
public class Menu {
    /**
     * Declarar variables
     */
    private char opciones;
    /**
     * Teclado
     */
    private Scanner read= new Scanner(System.in);
    
    /**
     * Declarar Set Menu(INICIALIZACION)
     */
    public void setMenu(){
        opciones='.';
    }
    /**
     * Declarar Set Menu
     */
    public void setmostrar(){
        System.out.println("¿Qué desea hacer?");
        System.out.println("m= Mostrar fecha actual");
        System.out.println("v= validar fecha");
        System.out.println("s=salir");
    }
    /**
     * Declarar Set
     */
    public void setopcion(){
        this.opciones=read.next().charAt(0);
        System.out.println();
    }
    /**
     * Declarar Get
     * @return opciones
     */
    public char getopcion(){
        return opciones;
    }
}
    
