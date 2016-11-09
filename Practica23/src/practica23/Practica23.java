
package practica23;
import java.util.Scanner;

public class Practica23 {


    public static void main(String[] args) {
        /*Variables*/
        int sueldo;
        double importe;
        char estado;
        int hijo;
        double importeañadido;
        double sueldofinal;
        double sueldofinal2;
        
        /*Creacion teclado*/
        Scanner teclado=new Scanner(System.in);
        
        /*Mensaje*/
        System.out.println("Introduce tu estado civil:");
        estado=teclado.next().charAt(0);
        
        System.out.println("Introduce el salario anual bruto:");
        sueldo=teclado.nextInt();
        
        System.out.println("Introduce el numnero de hijos que tienes:");
        hijo=teclado.nextInt();
        
        /*Operaciones*/
        switch (estado){
            case 's':importe=sueldo*0.25;
            sueldofinal=sueldo-importe;
            System.out.println("El importe es de "+importe);
            System.out.println("EL sueldo se le queda en "+sueldofinal);
            if (hijo==0){
                System.out.println("No recibe ninguna ayuda");
            }
            else if (hijo==1 || hijo==2){
                importeañadido=(sueldofinal/0.15)-sueldofinal;
                sueldofinal2=sueldofinal+importeañadido;
                System.out.println("Recibe una ayuda de "+importeañadido);
                System.out.println("El sueldo final se queda en "+sueldofinal2);
                }
            else{
                importeañadido=(sueldofinal/0.5)-sueldofinal;
                sueldofinal2=sueldofinal+importeañadido;
                System.out.println("Recibe una ayuda de "+importeañadido);
                System.out.println("El sueldo final se queda en "+sueldofinal2);
                }
            
            break;
            case 'c':importe=sueldo*0.05;
            sueldofinal=sueldo-importe;
            System.out.println("El importe es de "+importe);
            System.out.println("EL sueldo se le queda en "+sueldofinal);
            if (hijo==0){
                System.out.println("No recibe ninguna ayuda");
            }
            else if (hijo==1 || hijo==2){
                importeañadido=(sueldofinal/0.15)-sueldofinal;
                sueldofinal2=sueldofinal+importeañadido;
                System.out.println("Recibe una ayuda de "+importeañadido);
                System.out.println("El sueldo final se queda en "+sueldofinal2);
                }
            else{
                importeañadido=(sueldofinal/0.5)-sueldofinal;
                sueldofinal2=sueldofinal+importeañadido;
                System.out.println("Recibe una ayuda de "+importeañadido);
                System.out.println("El sueldo final se queda en "+sueldofinal2);
                }
            
            break;
            case 'd':importe=sueldo*0.20;
            sueldofinal=sueldo-importe;
            System.out.println("El importe es de "+importe);
            System.out.println("EL sueldo se le queda en "+sueldofinal);
            if (hijo==0){
                System.out.println("No recibe ninguna ayuda");
            }
            else if (hijo==1 || hijo==2){
                importeañadido=(sueldofinal/0.15)-sueldofinal;
                sueldofinal2=sueldofinal+importeañadido;
                System.out.println("Recibe una ayuda de "+importeañadido);
                System.out.println("El sueldo final se queda en "+sueldofinal2);
                }
            else{
                importeañadido=(sueldofinal/0.5)-sueldofinal;
                sueldofinal2=sueldofinal+importeañadido;
                System.out.println("Recibe una ayuda de "+importeañadido);
                System.out.println("El sueldo final se queda en "+sueldofinal2);
                }
            
            break;
            case 'o':importe=sueldo*0.0;
            sueldofinal=sueldo-importe;
            System.out.println("El importe es de "+importe);
            System.out.println("EL sueldo se le queda en "+sueldofinal);
            if (hijo==0){
                System.out.println("No recibe ninguna ayuda");
            }
            else if (hijo==1 || hijo==2){
                importeañadido=(sueldofinal/0.15)-sueldofinal;
                sueldofinal2=sueldofinal+importeañadido;
                System.out.println("Recibe una ayuda de "+importeañadido);
                System.out.println("El sueldo final se queda en "+sueldofinal2);
                }
            else{
                importeañadido=(sueldofinal/0.5)-sueldofinal;
                sueldofinal2=sueldofinal+importeañadido;
                System.out.println("Recibe una ayuda de "+importeañadido);
                System.out.println("El sueldo final se queda en "+sueldofinal2);
                }
            
        }
        

    }
    
}
