package ejemplos_clase;

public class TablaMultiplicar2al12 {

    public static void main(String[] args) {
        for (int i = 2; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.println(i+"*"+j+"="+(i*j));
            }
        }
    }
}
