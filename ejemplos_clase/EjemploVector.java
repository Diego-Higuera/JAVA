package ejemplos_clase;

import java.util.Scanner;

public class EjemploVector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ingrese tamaño del vector?");
        n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = (int) (Math.random() * 64 + 45);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i + " -> " + x[i]);
        }
        for (int i = 0; i < n; i++) {
            if (x[i] % 2 != 0) {
                System.out.println(x[i]);
            }
        }

    }

}
