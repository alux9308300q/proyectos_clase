package practica86;

public class Contador {
    /**
     * Declarar variables
     */
    int contador=0;
    int limite;


/**
 * Constructor
 */
    public Contador(){
        contador=1;
    }
    
    /**
     * Constructor con parámetros
     * @param contador Parametro contador
     */
    public Contador(int contador){
        this.contador=contador;
    }
    
    /**
     * Constructor copia
     * @param c Parametro Copia Contador
     */
    public Contador(final Contador c){
        contador=c.contador;
    }
    
    /**
     * Declarar Set
     * @param contador Parametro contador
     */
    public void setcontador(int contador){
        this.contador=contador;
    }
    /**
     * Declarar Set
     * @param limite Parametro Limite
     */
    public void setlimite(int limite){
        this.limite=limite;
    }
    
    /**
     * Operación
     * @param limite Parametro Limite
     */
    public void incrementar(double limite){
        /**
         * Bucle contador
         */
        while(contador<=limite){
            System.out.println(contador);
            contador++;
        }
    }
    /**
     * Operación
     * @param limite Parametro Limite
     */
    public void decrementar(double limite){
        /**
         * Bucle contador
         */
        while(limite>0){
            System.out.println(limite);
            limite--;
        }
    }
    
    /**
     * Declarar Get
     * @return contador
     */
    public int getcontador(){
        return contador;
    }
    /**
     * Declarar Get
     * @return limite
     */
    public int getlimite(){
        return limite;
    }
}
