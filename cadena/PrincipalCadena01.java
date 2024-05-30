package cadena;

import java.util.Arrays;

public class PrincipalCadena01 {

    public static void main(String[] args) {
        System.out.println("EJEMPLO 1 SPLIT");
        String cadena1 = "A1;Luis;32;1.72;true";
        String[] parte1 = cadena1.split(";");
        System.out.println("Vector Parte 1: "
                + Arrays.toString(parte1));

        System.out.println("EJEMPLO 2 SPLIT");
        String cadena2 = "datasagamadrid@gmail.com";
        String[] parte2 = cadena2.split("@");
        System.out.println("Vector Parte 2: "
                + Arrays.toString(parte2));
        String[] parte3 = parte2[1].split("\\.");
        System.out.println("Vector Parte 3: "
                + Arrays.toString(parte3));

        System.out.println("EJEMPLO 3 SPLIT");
        String cadena3 = "Walter12341Ismael12Sagastegui904Lescano";
        String[] parte4 = cadena3.split("[0-9]+");
        System.out.println("Vector Parte 4: "
                + Arrays.toString(parte4));

        System.out.println("EJEMPLO 4 SPLIT");
        String cadena4 = "Walter     Ismael Sagastegui   Lesano";
        String[] parte5 = cadena4.split("\\s+");
        System.out.println("Vector Parte 5: "
                + Arrays.toString(parte5));
    } // CERRAR MAIN
} // CERRAR CLASE
