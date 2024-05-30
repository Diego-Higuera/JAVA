package cadena;

public class PrincipalCadena02 {

    public static void main(String[] args) {
        System.out.println("EJEMPLO 1 SUBSTRING");
        String cadena1 = "A1;Luis;32;1.72;true";
        String cadenaResultado1 = cadena1.substring(8);
        System.out.println("Resultado 1: " + cadenaResultado1);
        String cadenaResutado2 = cadena1.substring(11,15);
        System.out.println("Resultado 2: " + cadenaResutado2);
    }

}
