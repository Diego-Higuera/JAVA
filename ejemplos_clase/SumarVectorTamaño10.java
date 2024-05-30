package ejemplos_clase;

import java.util.Scanner;

public class SumarVectorTamaño10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        //declarar vector tamaño 10
        int[] vector = new int[10];
        //llenar vector
        for (int i = 0; i < vector.length; i++) {
            System.out.print("ingrese numero posicion " + (i + 1) + "? ");
            vector[i] = sc.nextInt();
        }
        //sumar los numeros guardados
        for (int i = 0; i < vector.length; i++) {
            s = s + vector[i]; //acumulador
        }
        //mostrar salida
        System.out.println("Suma: " + s);
    }

}
