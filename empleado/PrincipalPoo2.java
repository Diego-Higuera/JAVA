package empleado;

public class PrincipalPoo2 {

    public static void main(String[] args) {
        String[] nombre = {"Miguel","Carlos","Silvia","María","Arturo",
                           "Vanessa","Jose","Lucho","Herson","Luis"};
        for(int i=0; i<nombre.length; i++) {
            Empleado e = new Empleado(nombre[i],(int)(Math.random()*81+20));
            System.out.println(e);
        }
    }
}
