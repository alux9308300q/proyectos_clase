package practica82;

import java.util.Scanner;

public class desglosar {
    Scanner teclado=new Scanner(System.in);
    private int cant;
    private int dineros[]= new int [9]; 
    private int i=0; 
    
    /**
     * Declaracion Set Cantidad
     * @param cant Parametro de cantidad
     */
    public void Setcant(int cant){
        this.cant=cant;
    }
    
    /**
     * Declaracion Set Dinero
     * @param dineros Parametro de dinero
     */
    public void Setdinero(int dineros){
        this.cant=cant;
    }
    
    /**
     * Declaracion Set Contador
     * @param i Parametro contador
     */
    public void Seti(int i){
        this.i=i;
    }
    
    /**
     * Desglosar la cantidad introducida de dinero
     * @param cant Cantidad
     * @param i Contador
     */
    public void SetDesglosar(int cant, int i){
        this.cant=cant;
        while(cant>0){ 
        while(cant-500>=0){ 
            cant=cant-500; 
            dineros[0]++; 
        } 

        while(cant-200>=0){ 
            cant=cant-200; 
            dineros[1]++; 
        } 

        while(cant-100>=0){ 
            cant=cant-100; 
            dineros[2]++; 
        } 

        while(cant-50>=0){ 
            cant=cant-50; 
            dineros[3]++; 
        } 

        while(cant-20>=0){ 
            cant=cant-20; 
            dineros[4]++; 
        } 

        while(cant-10>=0){ 
            cant=cant-10; 
            dineros[5]++; 
        } 

        while(cant-5>=0){ 
            cant=cant-5; 
            dineros[6]++; 
        } 

        while(cant-2>=0){ 
            cant=cant-2; 
            dineros[7]++; 
        } 

        while(cant-1>=0){ 
            cant=cant-1; 
            dineros[8]++; 
        } 
    } 
    /**
     * Impresion de mensaje final
     */
    for(i=0;i<9;i++){ 
        if(i==0) 
            System.out.println(dineros[i]+ " billetes de 500"); 
            if(i==1) 
                System.out.println(dineros[i]+ " billetes de 200"); 
            if(i==2) 
                System.out.println(dineros[i]+ " billetes de 100"); 
            if(i==3) 
                System.out.println(dineros[i]+ " billetes de 50"); 
            if(i==4) 
                System.out.println(dineros[i]+ " billetes de 20"); 
            if(i==5) 
                System.out.println(dineros[i]+ " billetes de 10"); 
            if(i==6) 
                System.out.println(dineros[i]+ " billetes de 5"); 
            if(i==7) 
                System.out.println(dineros[i]+ " monedas de 2"); 
            if(i==8) 
                System.out.println(dineros[i]+ " monedas de 1"); 
    }
    }
    
}
