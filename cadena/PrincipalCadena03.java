package cadena;

public class PrincipalCadena03 {

    public static void main(String[] args) {
        System.out.println("EJEMPLO 1");
        String cadena1 = "Hola Mundo";
        String er1 = "o";
        String resultado1 = cadena1.replaceAll(er1, "x");
        System.out.println("Resulado 1: " + resultado1);
        System.out.println("EJEMPLO 2");
        String cadena2 = "Walter     Ismael          Sagástegui Lescano";
        String er2 = "\\s+";
        String resultado2 = cadena2.replaceAll(er2, " ");
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("EJEMPLO 3");
        // Ejemplo 10: Reemplazar caracteres especiales en una URL
        String cadena3 = "https://www.ejemplo.com/página?query=valor#fragmento";
        cadena3 = cadena3.replaceAll("[^a-zA-Z0-9á]", "");
        System.out.println("Ejemplo 10: " + cadena3);
    }

}
