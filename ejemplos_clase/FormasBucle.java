package ejemplos_clase;
public class FormasBucle {
    public static void main(String[] args) {
        System.out.println("Mientras");
        {
        //(1) bucle mientras (test inicio)
        int i=1, n=5;
        while(i<=n){
            System.out.println(i);
            i++;
        }
        }
        //(2) bucle hasta (test final)
        System.out.println("Hasta");
        {
        int i=1, n=5;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
        }
        //(3) bucle para  
        System.out.println("Para");
        int n = 5;
        for (int i=1; i<=n; i++) {
            System.out.println(i);
        }
    }
}
