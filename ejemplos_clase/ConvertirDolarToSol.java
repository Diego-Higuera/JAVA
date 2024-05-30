package ejemplos_clase;
import java.util.Scanner;
public class ConvertirDolarToSol {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double d,s;
        System.out.print("Ingrese cantidad de dolares?");
        d = sc.nextDouble();
        s = d*3.73;
        System.out.print("soles = " + s);
    }
    
}
