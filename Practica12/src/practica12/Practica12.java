/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica12;
/*Importar scanner*/
import java.util.Scanner;

/**
 *
 * @author george
 */
public class Practica12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        /*Declarar variables*/
        int dinero;
        int resultado500,resultado200,resultado100,resultado50,resultado20,resultado10,resultado5,resultado2,resultado1;
        int quinientos,doscientos,cien,cincuenta,veinte,diez,cinco,dos,uno;
            
      
        /*Entrada por teclado*/
        Scanner teclado=new Scanner(System.in);

        /*Mensaje*/
        System.out.println("Introduce la cantidad de dinero:");
        
        /*Lectura por teclado*/
        dinero=teclado.nextInt();
       
        /*Operacion*/
        resultado500=dinero/500; 
        quinientos=dinero-(500*resultado500); /*Quinientos=Resto de la operacion anterior*/
        /*Mostrar resultado*/
        System.out.println(resultado500+" Billetes de 500");
        
        /*Operacion*/
        resultado200=quinientos/200; /*Resto de la anterior operacion dividido entre el siguiente correspondiente billete*/
        doscientos=quinientos-(200*resultado200); /*Doscientos=Resto de la operacion anterior*/
        /*Mostrar resultado*/
        System.out.println(resultado200+" Billetes de 200");
          
        /*Operacion*/
        resultado100=doscientos/100; /*Resto de la anterior operacion dividido entre el siguiente correspondiente billete*/
        cien=doscientos-(100*resultado100); /*Cien=Resto de la operacion anterior*/
        /*Mostrar resultado*/
        System.out.println(resultado100+" Billetes de 100");
        
        /*Operacion*/
        resultado50=cien/50; /*Resto de la anterior operacion dividido entre el siguiente correspondiente billete*/
        cincuenta=cien-(50*resultado50); /*Cincuenta=Resto de la operación anterior*/
        /*Mostrar resultado*/
        System.out.println(resultado50+" Billetes de 50");
        
        /*Operacion*/
        resultado20=cincuenta/20; /*Resto de la anterior operacion dividido entre el siguiente correspondiente billete*/
        veinte=cincuenta-(20*resultado20); /*Veinte=Resto de la operación anterior*/
        /*Mostrar resultado*/
        System.out.println(resultado20+" Billetes de 20");
        
         /*Operacion*/
        resultado10=veinte/10; /*Resto de la anterior operacion dividido entre el siguiente correspondiente billete*/
        diez=veinte-(10*resultado10); /*Diez=Resto de la operación anterior*/
        /*Mostrar resultado*/
        System.out.println(resultado10+" Billetes de 10");
        
        /*Operacion*/
        resultado5=diez/5; /*Resto de la anterior operacion dividido entre el siguiente correspondiente billete*/
        cinco=diez-(5*resultado5); /*Cinco=Resto de la operación anterior*/
        /*Mostrar resultado*/
        System.out.println(resultado5+" Billetes de 5");
        
        /*Operacion*/
        resultado2=cinco/2; /*Resto de la anterior operacion dividido entre el siguiente correspondiente billete*/
        dos=cinco-(2*resultado2);/*Dos=Resto de la operación anterior*/
        /*Mostrar resultado*/
        System.out.println(resultado2+" Monedas de 2");
        
        /*Operacion*/
        resultado1=dos/1; /*Resto de la anterior operacion dividido entre el siguiente correspondiente billete*/
        uno=dos-(1*resultado1);/*Uno=Resto de la operación anterior*/
        /*Mostrar resultado*/
        System.out.println(resultado1+" Modenas de 1");
                
}
        
   
    
}
