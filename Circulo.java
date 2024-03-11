
public class Circulo {
    private double areaC;
    private double perimetroC;
    
    public double areaC( double raio){
        areaC = 3.14 *(Math.pow(raio, 2));
        return areaC;
    }
     
    public double perimetroC(double raio){
        perimetroC = 2 * 3.14 * raio;
        return perimetroC;
    }
     
    //Getter e Setter

    public double getAreaC() {
        return areaC;
    }

    public void setAreaC(double areaC) {
        this.areaC = areaC;
    }

    public double getPerimetroC() {
        return perimetroC;
    }

    public void setPerimetroC(double perimetroC) {
        this.perimetroC = perimetroC;
    }

    public Circulo(double areaC, double perimetroC) {
        this.areaC = areaC;
        this.perimetroC = perimetroC;
    }

    public Circulo() {
    }
    
    
    
}
