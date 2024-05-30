
package herencia_figurageometrica;

public class Cuadrado extends FiguraGeometrica {

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
    
    
    
    
    
    @Override
    public double area() {
        return this.lado * this.lado;
    }
    
    @Override
    public double perimetro() {
        return this.lado * 4; 
    }
    
}
