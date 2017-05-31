package practica79;

public class pentagono {
    private double perimetro;
    private double apotema;
    private double resultado;
    /**
     * Declarar Set Perimetro
     * @param perimetro Parametro del perimetro
     */
    public void Setperimetro(double perimetro){
        this.perimetro=perimetro;
    }
    /**
     * Declarar Set Apotema
     * @param apotema Parametro de la apotema
     */
    public void Setapotema(double apotema){
        this.apotema=apotema;
    }
    /**
     * Area
     * @param perimetro Dato para resolucion area
     * @param apotema Dato para resolucion area
     */    
    public void SetArea(double perimetro, double apotema){
        this.perimetro=perimetro;
        this.apotema=apotema;
        this.resultado=(perimetro*apotema)/2;       
    }
    /**
     * Declaracion Get
     * @return Resultado
     */
    public double GetArea(){
        return resultado;
    }
    
}
