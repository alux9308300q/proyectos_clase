
package extra4;
/*Importar scanner*/
import java.util.Scanner;
public class Extra4 {


    public static void main(String[] args) {
        /*Declaracion de variables*/
      int año;
      int mes;
      int dia;
        
        /*Creacion de scanner*/
        Scanner teclado=new Scanner(System.in);
        
        /*Operaciones*/
        System.out.println("¿Qué año es?");
        año=teclado.nextInt();
        if(año>3000){
            System.out.println("Año incorrecto");}
            
        System.out.println("¿Qué mes es?");
        mes=teclado.nextInt();
        if(mes<1 || mes>12){
            System.out.println("Mes incorrecto");
        }
         
        System.out.println("¿Qué dia es?");
        dia=teclado.nextInt();    
        if(mes==2 && año%4==0||año%100==0&&año%400==0){
            if(dia<1 || dia>29){
            System.out.println("Dia incorrecto");}
            }
        else{
            if(mes==2 && (año%4!=0 ||año%100!=0 && año%400!=0)) {
                if(dia<1 || dia>28){
        System.out.println("Dia incorrecto");}
        }
            else{
            if(mes==4 || mes==6 || mes==9 || mes==11) {
                if(dia<1 || dia>30){
        System.out.println("Dia incorrecto");}
        } 
            else{
                if(dia<1 || dia>31){
            System.out.println("Dia incorrecto");}
            }

    }
}
    }  
}


        



