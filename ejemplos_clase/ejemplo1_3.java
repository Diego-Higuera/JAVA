
package ejemplos_clase;
import java.util.Scanner;
public class ejemplo1_3 {
     public static void main (String[]args){
          double a,b;
    Scanner sc = new Scanner (System.in);
    System.out.println ("ingrese dos numeros");
    a = sc.nextDouble();
    b = sc.nextDouble();
        System.out.println("resultado =" + Math.pow(a+b,2)/3);
     }
    
}
