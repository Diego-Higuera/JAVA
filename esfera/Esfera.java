package esfera;

public class Esfera {

    //(1) VARIABLES DE INSTANCIAS
    //ENTRADA
    private double radio;

    //SALIDA (CALCULO)
    private double area;
    private double volumen;

    //(2) CONSTRUCTORES
    public Esfera(double radio) {
        this.radio = radio;
    }

    public Esfera() {
    }
    
    //(3) METODOS SET Y GET

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //(4) METODOS SALIDA CALCULO
    public double area() {
       return redondear(4 * Math.PI * Math.pow(radio,2)); 
    }
    
    public double volumen() {
        return redondear(4 * Math.PI * Math.pow(radio,3) / 3.0);
    }
    
    //(5) METODOS MOSTRAR ATRIBUTOS DE LA CLASE

    @Override
    public String toString() {
        return "Esfera{" + "radio=" + radio + ", area=" + area() + ", volumen=" + volumen() + '}';
    }
    
    //(6) OTROS METODOS
    public double redondear(double x) {
        return Math.round(x * 100.0) / 100.0;
    }
    
}
