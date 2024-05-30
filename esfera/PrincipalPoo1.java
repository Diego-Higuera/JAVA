package esfera;

public class PrincipalPoo1 {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            Esfera e = new Esfera((int) (Math.random() * 81 + 10));
            System.out.println(e);
        }
    }

}
