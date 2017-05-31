package practica87;

public class Libro {
     /**
     * Declarar variables
     */
    private String titulo, autor;
    private int ejemplares=1;

    /**
     * Constructor con parámetros
     * @param titulo Parametro titulo
     * @param autor Parametro Autor
     * @param ejemplares Parametro ejemplares
     */
    public Libro(String titulo, String autor, int ejemplares){
        this.titulo=titulo;
        this.autor=autor;
        this.ejemplares=ejemplares;
    }
    
    /**
     * Declarar Set
     * @param titulo Parametro titulo
     */
    public void settitulo(String titulo){
        this.titulo=titulo;
    }
    /**
     * Declarar Set
     * @param autor Parametro autor
     */
    public void setautor(String autor){
        this.autor=autor;
    }
    /**
     * Declarar Set
     * @param ejemplares Parametro ejemplares
     */
    public void setejemplares(int ejemplares){
        this.ejemplares=ejemplares;
    }
    
    /**
     * Operacion
     */
    public void prestamo(){
        ejemplares=ejemplares-1;
    }
    /**
     * Parametro devolucion
     */
    public void devolucion(){
        ejemplares=ejemplares+1;
    }
    
    /**
     * Declarar Get
     * @return titulo
     */
    public String gettitulo(){
        return titulo;
    }
    /**
     * Declarar Get
     * @return autor
     */
    public String getautor(){
        return autor;
    }
    /**
     * Declarar Get
     * @return ejemplares
     */
    public int getejemplares(){
        return ejemplares;
    }
}

