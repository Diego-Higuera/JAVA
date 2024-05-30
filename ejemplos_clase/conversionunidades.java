
package ejemplos_clase;

import java.util.Scanner;

public class conversionunidades {
    
    public static void main(String[]args) {
        
        String[] unidadesinformaticas = {"BYTE","KILOBYTE","MEGABYTE","GIGABYTE","TERABYTE","PENTABYTE","EXABYTE","ZETTABYTE","YOTTABYTE"};
        int[] conversion ={0,10,20,30,40,50,60,70,80};
        Scanner sc = new Scanner(System.in);
        System.out.println("origen");
        System.out.println("------");
        mostrarunidades();
        System.out.println("ingrese origen");
        int origen = sc.nextInt();
        System.out.println("cantidad origen");
        int cantidadorigen = sc.nextInt();
        System.out.println("destino");
        System.out.println("-------");
        mostrarunidades();
        System.out.println("ingrese destino");
        int destino = sc.nextInt();
        
        int exponente = origen - destino;
        double resultado = 0;
        if(exponente > 0) {
            resultado = cantidadorigen * Math.pow(2,Math.abs(exponente)*10);
        }else {
            resultado = cantidadorigen / Math.pow(2,Math.abs(exponente)*10);
        }
        System.out.println("conversion: " + unidadesinformaticas[origen] + " to " + unidadesinformaticas[destino]);
        System.out.println(resultado);
    }
    
    public static void mostrarunidades() {
        System.out.println("0. byte");
        System.out.println("1. kilo byte");
        System.out.println("2. mega byte");
        System.out.println("3. giga byte");
        System.out.println("4. tera byte");
        System.out.println("5. penta byte");
        System.out.println("6. exa byte");
        System.out.println("7. zetta byte");
        System.out.println("8. yotta byte");
    }
}
