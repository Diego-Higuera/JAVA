
package ejemplos_clase;
import java.util.Scanner;
public class LeerTeclado {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("ingrese su nombre");
    String nombre = sc.next();
    System.out.println("Hola " + nombre + " ,¿como estas?");
}   
}
