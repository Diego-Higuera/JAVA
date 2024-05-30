
package herencia_figurageometrica;

public class Triangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    
    @Override
    public double area() {
        return this.base * this.altura /2;
        
    }
    
    @Override 
        public double perimetro() {
        return (Math.sqrt((this.base * this.base) + (this.altura * this.altura)))+this.base + this.altura;
    }
    
    
    
}
