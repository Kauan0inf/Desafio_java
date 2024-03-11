public class Geometria {
    private double areaCriculo;
    private double areaTriangulo;
    private double areaRetângulo;
    
    public double areaTri(double base, double altura){
 
        areaTriangulo = (base * altura) /2;
        return areaTriangulo;
    }
    public double areaCri( double raio){
        areaCriculo = 3.14 *(Math.pow(raio, 2));
      return areaCriculo;
    }
    
    public double  areaRet(double base, double altura){
        areaRetângulo = base * altura;
        return areaRetângulo;
    }
    
    //Getter e Setter
    public double getAreaCriculo() {
        return areaCriculo;
    }

    public void setAreaCriculo(double areaCriculo) {
        this.areaCriculo = areaCriculo;
    }

    public double getAreaTriangulo() {
        return areaTriangulo;
    }

    public void setAreaTriangulo(double areaTriangulo) {
        this.areaTriangulo = areaTriangulo;
    }

    public double getAreaRetângulo() {
        return areaRetângulo;
    }

    public void setAreaRetângulo(double areaRetângulo) {
        this.areaRetângulo = areaRetângulo;
    }
    public Geometria(double areaCriculo, double areaTriangulo, double areaRetângulo) {
        this.areaCriculo = areaCriculo;
        this.areaTriangulo = areaTriangulo;
        this.areaRetângulo = areaRetângulo;
    }

    public Geometria() {
      
    }    
}
