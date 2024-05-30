package ejemplos_clase;

import java.util.Scanner;

public class OperacionesAritmeticas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //(1) DEFINIR TIPOS DE DATOS
        double n1, n2, resultado;
        String operacion, r;
        //(2) ENTRADA
        do {
        System.out.println("ingrese número 1?");
        n1 = sc.nextDouble();
        System.out.println("ingrese operación aritmetica (+ - * /)?");
        operacion = sc.next();
        System.out.println("ingrese número 2?");
        n2 = sc.nextDouble();
        
        //(3) PROCESO
        switch (operacion) {
            case "+": resultado = n1 + n2;
            System.out.println ("sumar = " + resultado);
            break;
            case "-": resultado = n1 - n2;
            System.out.println ("restar = " + resultado);
            break;
            case "*": resultado = n1 * n2;
            System.out.println ("multiplicar = " + resultado);
            break;
            case "/": resultado = n1 / n2;
            System.out.println ("dividir = " + resultado);
            break;
            default: System.out.println("Entrada incorrecta, deve introducir + - * o /");
        }
        System.out.println("Desea ejecutar de nuevo el programa (s/n)?");
        r = sc.next();
    }while(r.equalsIgnoreCase("s"));
        //(4) SALIDA
    }
    
}
