
package extra3;
import java.util.Scanner;
        
public class Extra3 {

    public static void main(String[] args) {
        /*Declaracion de variables*/
        int numero;
        int division;
        int resto = 0;
        int division2;
        int resto2 = 0;  
        int division3;
        int resto3;
        
        /*Creacion de escaner*/
        Scanner teclado=new Scanner(System.in);
        
        /*Mensaje*/
        System.out.println("Introduce un numero entre 0 y 9999");
        numero=teclado.nextInt();
        
        /*Operaciones*/
        if(numero<10){
            System.out.println(numero);
        }
        if(numero>=10 && numero<100){
        division=numero/10;
        resto=numero%10;
            System.out.println("No es capicua");
        }
        if(numero>=100 && numero<1000){
        division2=numero/100;
        resto2=numero%100;
        division=resto2/10;
        resto=resto2%10;
            System.out.println("No es capicua");
        }
        if(numero>=1000 && numero<10000){
        division3=numero/1000;
        resto3=numero%1000;
        division2=resto3/100;
        resto2=resto3%100;
        division=resto2/10;
        resto=resto2%10;
            if((resto == division3) && (division == division2)){
                System.out.println("Es capicua");
            }
            else{
                System.out.println("No es capicua");
            }
        }

    }
    
}
