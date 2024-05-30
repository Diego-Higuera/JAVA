
package herencia_figurageometrica;

public  class Rectangulo extends FiguraGeometrica {

   private double ancho;
   private double alto;

    public Rectangulo() {
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "ancho=" + ancho + ", alto=" + alto + '}';
    }
   
    
    
    
    
    
    @Override
    public double area() {
       return this.ancho * this.alto;
    
    }
    
    @Override
    public double perimetro() {
        return this.ancho + this.ancho + this.alto + this.alto;
    }
}
