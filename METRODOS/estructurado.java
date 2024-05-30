package METRODOS;

public class estructurado {

    public static void main(String[] args) {
        //definir tipo de datos
        int radio;               //variable de entrada
        double area, perimetro;  //variable de salida
        
        //entrada
        radio = (int) (Math.random() * 6 + 1);
        //proceso
        area = area(radio);
        perimetro = perimetro(radio);
        cabecera();
        cuerpo(radio, area, perimetro);
        //salida
        //cabecera
        //System.out.printf("%-9s%-9s%-9s\n", "radio", "area", "perimetro");
        // System.out.println(); =     \n
        //System.out.printf("%-9s%-9s%-9s\n", "-----", "----", "---------");
        // System.out.println(); =     \n
        //cuerpo
       // System.out.printf("%-9d%-9.2f%-9.2f", radio, area, perimetro);
       // System.out.println();
    }

    public static double area(int radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double perimetro(int radio) {
        return 2 * Math.PI * radio;
    }

    public static void cabecera() {
        System.out.printf("%-9s%-9s%-9s\n", "radio", "area", "perimetro");
        // System.out.println(); =     \n
        System.out.printf("%-9s%-9s%-9s\n", "-----", "----", "---------");
        // System.out.println(); =     \n

    }

    public static void cuerpo(int radio, double area, double perimetro) {
        System.out.printf("%-9d%-9.2f%-9.2f", radio, area, perimetro);
        System.out.println();
    }

}
