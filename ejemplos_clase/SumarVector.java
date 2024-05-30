package ejemplos_clase;

import java.util.Scanner;

public class SumarVector {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese numero de elementos?");
        int n = sc.nextInt();
        int s = 0;
        //declarar vector tamaño 
        int[] vector = new int[n];
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
        for (int j = vector.length - 1; j >= 0; j--) {
            System.out.println(vector[j]);
        }

        System.out.println("media: " + s / n);
    }
}
