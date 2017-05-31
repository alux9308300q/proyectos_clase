package practica80;

public class cubo {
    private double arista;
    private double resultado;
    /**
     * Declaracion Set
     * @param arista Parametro de la arista
     */
    public void Setarista(double arista){
        this.arista=arista;
    }
    /**
     * Area
     * @param arista Dato para resolucion area
     */
    public void SetArea(double arista){
        this.arista=arista;
        this.resultado=6*(arista*arista);
    }
    /**
     * Declaracion Get
     * @return Resultado
     */
    public double GetArea(){
        return resultado;
    }
    
}
