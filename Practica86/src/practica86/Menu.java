package practica86;
import java.util.*;
public class Menu {
    /**
     * Declarar las variables
     */
    private char opciones;
    private Scanner read= new Scanner(System.in);
    /**
     * Declarar Set Menu(INICIALIZACION)
     */
    public void setMenu(){
        opciones='.';
    }
    /**
     * Declarar Set
     */
    public void setmostrar(){
        System.out.println("¿Qué deseas hacer?");
        System.out.println("i=incrementar");
        System.out.println("d=decrementar");
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

