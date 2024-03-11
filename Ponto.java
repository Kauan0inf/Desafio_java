public class Ponto {
    private double x;
    private double y;


    public double calcularDistancia(Ponto outroPonto) {
        double distancia = Math.sqrt(Math.pow((outroPonto.getX() - x), 2) + Math.pow((outroPonto.getY() - y), 2));
        return distancia;
    } 
  
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
