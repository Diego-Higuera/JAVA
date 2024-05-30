package operaciones_vector;

import java.util.Arrays;

public class OperacionVector {

    //(1)VARIABLES DE INSTANCIA
    //ENTRADA
    private int[] vector;
    //SALIDA (CALCULO)
    private int longitudVector;
    private double promedioVector;
    private int sumaVector;
    private int maximoVector;
    private int[] paresVector;

    //(2)CONSTRUCTORES
    public OperacionVector(int[] vector) {
        this.vector = vector;
    }

    public OperacionVector() {
    }

    //(3)METODOS SET Y GET (ENTRADA)
    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    //(4)METODOS CALCULO (SALIDA)
    public int logitudVector() {
        return this.vector.length;
    }

    public double promedioVector() {
        double s = 0;
        for (int i = 0; i < this.vector.length; i++) {
            s = s + this.vector[i];
        }
        return s / vector.length;
    }

    public int sumaVector() {
        int s = 0;
        for (int i = 0; i < this.vector.length; i++) {
            s = s + this.vector[i];
        }
        return s;
    }

    public int maximoVector() {
        int maximo = this.vector[0];
        for (int i = 0; i < this.vector.length; i++) {
            if (this.vector[i] > maximo) {
                maximo = vector[i];
            }
        }
        return maximo;
    }

    public int[] paresVector() {
        String x = "";
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                x = x + vector[i] + ","; // ACUMULADOR CONCATENA(JUNTA)
            }
        }
        x = x.substring(0, x.length() - 1);
        String[] y = x.split(",");
        int[] pares = new int[y.length];
        for (int i = 0; i < y.length; i++) {
            pares[i] = Integer.parseInt(y[i]);
        }
        return pares;
    }

    //(5)METODOS MOSTRAR LAS VARIABLES DE INSTANCIA
}
