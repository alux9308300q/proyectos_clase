
package practica34;
import java.util.Scanner;

public class Practica34 {

    public static void main(String[] args) {
        /*Variables*/
        int cuenta;
        int dinerointroducido;
        int dinerocuenta=0;
        int dineroretirado;
        int a = 1;
               
        /*Creacion teclado*/
        Scanner teclado=new Scanner(System.in);                     
        
        /*Operaciones*/
        while(a==1){
            /*Mensaje*/
            System.out.println("¿Que quieres hacer?");
            System.out.println("1.Ingresar dinero");
            System.out.println("2.Retirar dinero");
            System.out.println("3.Recibo");
            System.out.println("4.Salir");
            cuenta=teclado.nextInt();
        switch(cuenta){
            case 1: System.out.println("---Ingresa el dinero---");
                    dinerointroducido=teclado.nextInt();
                    dinerocuenta=dinerointroducido+dinerocuenta;
            break;
            
            case 2: System.out.println("---Retire el dinero---");
                    dineroretirado=teclado.nextInt();
                    dinerocuenta=dinerocuenta-dineroretirado;
            break;
                
            case 3: System.out.println("Tienes "+dinerocuenta+" euros en la cuenta");
            break;
            
            case 4: a=2;
            break;
                    
        }
        }

    }
    
}
