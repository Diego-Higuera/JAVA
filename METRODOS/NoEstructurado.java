package METRODOS;

public class NoEstructurado {

    public static void main(String[] args) {
        //definir tipo de datos
        int radio;               //variable de entrada
        double area, perimetro;  //variable de salida
        //entrada
        radio = (int) (Math.random() * 6 + 1);
        //proceso
        area = Math.PI * Math.pow(radio, 2);
        perimetro = 2 * Math.PI * radio;
        //salida
        //cabecera
        System.out.printf("-%-9s-%-9s-%-9s\n", "radio", "area", "perimetro");
       // System.out.println();
        System.out.printf("-%-9s-%-9s-%-9s\n", "-----", "----", "---------");
       // System.out.println();
        //cuerpo
        System.out.printf("%-9d%-9.2f%-9.2f", radio , area , perimetro);
        System.out.println();
    }

}
