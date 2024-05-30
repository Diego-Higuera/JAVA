package METRODOS;

public class PrincipalPoo1 {

    public static void main(String[] args) {
        int radio = (int) (Math.random() * 6 + 1);
        Circulo c = new Circulo(radio);
        c.cabecera();
        c.cuerpo();

    }

}
