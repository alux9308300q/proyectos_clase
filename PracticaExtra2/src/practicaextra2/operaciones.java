package practicaextra2;

public class operaciones {
    /**
     * Declarar las variables
     */
    private int segundos;
    private int [] tiempoarray = new int [5];
    int i=0;
    int [] tiemposec= {604800, 86400, 3600, 60, 1};
    private String[] nombre = {"semanas", "dias", "horas", "minutos", "segundos"};
    
    /**
     * Declarar Set
     * @param segundos Parametro segundos
     */
    public void setsegundos(int segundos){
        this.segundos=segundos;
    }
    /**
     * Declarar Set
     * @param tiempoarray Parametro tiempo(Array)
     */
    public void settiempoarray(int [] tiempoarray){
        this.tiempoarray=tiempoarray;
}
    /**
     * Declarar Set
     * @param tiemposec Parametro/Array/Desglosar para sacar el resto
     */
    public void settiemposec(int[] tiemposec){
        this.tiemposec=tiemposec;
    }
    
    /**
     * Declarar Set
     * @param nombre Parametro/Array/Nombres de minutos, segundos, etc
     */
    public void settnombre(String[] nombre){
        this.nombre=nombre;
    }
    
    /**
     * Declarar Get
     * @return segundos
     */
    public int getsegundos(){
        return segundos;
    }
    
    /**
     * Declarar Get
     * @return tiemposec 
     */
    public int [] gettiemposec(){
        return tiemposec;
    }
    
    /**
     * Declarar Get
     * @return nombre
     */
    public String [] getnombre(){
        return nombre;
    }
    
    /**
     * Operación
     * @param segundos Parametro segundos introducidos
     * @param tiemposec Parametro/Array/Desglosar para sacar el resto
     * @param tiempoarray Parametro tiempo(Array)
     */
    public void operacion(int segundos, int[] tiemposec, int[] tiempoarray){
        for(i=0; i<5; i++){//Bucle recorredor del array del tiempo/Desglosar segundos
            tiempoarray[i]= (segundos/tiemposec [i]);
            segundos=segundos%tiemposec [i];
        }
    }
    
    /**
     * Declarar Get
     * @return tiempoarray
     */
    public int [] gettiempoarray(){
        return tiempoarray;
    }
}


