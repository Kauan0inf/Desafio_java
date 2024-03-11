 public class Retangulo extends Geometria {
    private double areaR;
    private double perimetroR;
    
    public double  areaR(double base, double altura){
        areaR = base * altura;
        return areaR;
    }
        
    public double periR(double la1, double la2, double la3, double la4){
        perimetroR = la1 + la2 + la3 + la4;
        return perimetroR;
    }
    
    //Getter e Setter

    public double getAreaR() {
        return areaR;
    }

    public void setAreaR(double areaR) {
        this.areaR = areaR;
    }

    public double getPerimetroR() {
        return perimetroR;
    }

    public void setPerimetroR(double perimetroR) {
        this.perimetroR = perimetroR;
    }
    //Constructor
    public Retangulo(double areaR, double perimetroR) {
        this.areaR = areaR;
        this.perimetroR = perimetroR;
    }

    public Retangulo() {
    }
    
    
    
}
