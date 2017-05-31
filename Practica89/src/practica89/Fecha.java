package practica89;
import java.time.LocalDate;
public class Fecha {
        /**
         * Declarar variables
         */
        int dia,mes,año; 
        /**
         * Extraer la fecha local
         */
        LocalDate date=LocalDate.now();
        
        /**
         * Declarar Set
         * @param dia Parametro dia
         */
        public void setdia(int dia){
        this.dia=dia;
        }   
        /**
         * Declarar Set
         * @param mes Parametro mes
         */
        public void setmes(int mes){
            this.mes=mes;
        }
        /**
         * Declarar Set
         * @param año Parametro año
         */
        public void setaño(int año){
            this.año=año;
        }
        
        /**
         * Declarar Get
         * @return dia
         */
        public int getdia(){
        return dia;
        }
        /**
         * Declarar Get
         * @return mes
         */
        public int getmes(){
            return mes;
        }
        /**
         * Declarar Get
         * @return año
         */
        public int getaño(){
            return año;
        }
        
        /**
         * Introduccion fecha
         * @param dia Parametro dia
         * @param mes Parametro mes
         * @param año Parametro año
         */
        public void fechaactual(int dia, int mes, int año){
            this.dia=date.getDayOfMonth();
            this.mes=date.getMonthValue();
            this.año=date.getYear();    
        }
        
        /**
         * Operaciones fecha valida
         * @param dia Parametro dia
         * @param mes Parametro mes
         * @param año Parametro año
         */
        public void fechavalida(int dia, int mes, int año){
            /**
             * Boolean año bisiesto
             */
            boolean bisiesto=false;
            /**
             * Boolean fecha valida
             */
            boolean valido=true;
            /**
             * Condiciones para el año bisiesto, dias y meses /Fecha invalida
             */
            if(año%4==0){
                if(año%100==0 && año%400!=0){
                    
                }
                else{
                    bisiesto=true;
                }
            }
            if (bisiesto==true){
                if((mes==2 && (dia>29 || dia<1)) || ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (dia<1 || dia>31)) || ((mes==4 || mes==6 || mes==9 || mes==11) && (dia<1 || dia>30)) || (mes<1 || mes>12) ){
                    valido=false;
                }
                else{
                    valido=true;
                }
            }
            else{
                if((mes==2 && (dia>28 || dia<1)) || ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (dia<1 || dia>31)) || ((mes==4 || mes==6 || mes==9 || mes==11) && (dia<1 || dia>30) || (mes<1 || mes>12)) ){
                    valido=false;
                }
                else{
                    valido=true;
                }
            }
            
            if(valido==true){
                System.out.println("La fecha que has introducido es CORRECTA");
            }
            else{
                System.out.println("La fecha que has introducido es ERRÓNEA");
            }
            

         }       
}
    
