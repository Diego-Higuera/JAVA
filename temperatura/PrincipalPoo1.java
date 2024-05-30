package temperatura;

public class PrincipalPoo1 {

    public static void main(String[] args) {
       
        //ENTRADA
        double temperaturaEntrada = 7.5; //Fahrenheit 45.5
        String opcion = "CF";
        Temperatura t = new Temperatura(temperaturaEntrada,opcion);
        System.out.println(t);
    }

}
