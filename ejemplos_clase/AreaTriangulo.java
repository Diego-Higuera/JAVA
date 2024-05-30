package ejemplos_clase;
import java.util.Scanner;
public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //(1) definir tipos de datos
        double b,h,a;
        //(2) entrada
        System.out.print ("ingrese base triangulo?");
        b = sc.nextDouble ();
        System.out.print ("ingrese altura triangulo?");
        h = sc.nextDouble ();
        //(3) proceso
        a = (b * h)/2;
        // (4) salida
        System.out.println("area triangulo = " + a);
    } 
    
}
