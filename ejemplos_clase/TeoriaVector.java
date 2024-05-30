package ejemplos_clase;

import java.util.Scanner;

public class TeoriaVector {

    public static void main(String[] args) {
        //Vector estatico nombres
        String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int tamaño = mes.length;
        //System.out.println("Tamaño Vector: " + tamaño);
        //Recorrer un vector
        for (int i = 0; i < tamaño; i++) {
            System.out.println((i + 1) + "->" + mes[i]);
        }
        int n = 12;
        int aleatorio = (int) (Math.random() * n);
        //System.out.println("Aleatorio: " + aleatorio);
        System.out.println("Mes Aleatorio: nº" + (aleatorio + 1) + " -> " + mes[aleatorio]);
        //System.out.println(mes[5]);

        //int[] edad = {21,30,24,28,29};
        //Vector dinamico
     Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas asignaturas Ingresaras?");
        int e = sc.nextInt();
        String[] asignatura = new String [e];
        for (int j=0; j<e; j++) {
            System.out.println("ingrese nombre asignatura?");
            asignatura[j] = sc.next();
        }
        for (int j=0; j<e; j++) {
         System.out.println(j+1 + " -> " + asignatura[j]);
        }
        }

    }


