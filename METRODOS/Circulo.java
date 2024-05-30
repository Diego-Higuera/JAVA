package METRODOS;

public class Circulo {
    //(1) atributos o variables de instancia o variables de objetos

    //entrada
    private int radio;

    //salida (calculables)
    private double area;
    private double perimetro;
    //(2) constructores

    public Circulo(int radio) {
        this.radio = radio;
    }

    public Circulo() {
    }
    //(3) metodos set y get

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    //(4) metodos de calculo
    public double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    public double perimetro() {
        return 2 * Math.PI * this.radio;
    }

    
    
    //metodo de clase (static) sin la variable de instancia (this.)
    public static void cabecera() {
       
        System.out.printf("%-9s%-9s%-9s\n", "radio", "area", "perimetro");
        // System.out.println(); =     \n
        System.out.printf("%-9s%-9s%-9s\n", "-----", "----", "---------");
        // System.out.println(); =     \n

    }
//metodo de objeto (sin static) con la variable de instancia (this.)
    public void cuerpo() {
        System.out.printf("%-9d%-9.2f%-9.2f\n", this.radio, area(), perimetro());
        System.out.println();
    }
}
