package ejemplos_clase;

import java.util.Scanner;

public class ProyectoTarea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese número filas?");
        int filas = sc.nextInt();
        System.out.println("ingrese número columnas?");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];
        int a = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 200 + 1);
                a = a + matriz[i][j];
                System.out.printf("%4d %2s",matriz[i][j], "  ");
            }
            System.out.println();

        }
        System.out.println("suma total = " + a);
    }
}
