
package ejemplos_clase;
import java.util.Scanner;
public class InvertirNumerosEntrada {
    public static void main (String[]args){
    int a,b,c,d;
    Scanner sc = new Scanner (System.in);
    System.out.println ("ingrese cuatro numeros");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();
    System.out.println(d + " " + c + " " + b + " " + a);
    }
}
