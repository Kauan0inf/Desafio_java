public class Triangulo extends Geometria {
     private double area;
     private double perimetro;
  
    public double areaTria(double base, double altura){
 
        area = (base * altura) /2;
        return area;
    }
    public double periTri(double la1, double la2, double la3){
        perimetro = la1 + la2 + la3;
        return perimetro;
    }

    //Getter e Seterr
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeto() {
        return perimetro;
    }

    public void setPerimeto(double perimetro) {
        this.perimetro = perimetro;
    }
    
    //Constructor
    public Triangulo(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public Triangulo() {
    }
    
    
}
