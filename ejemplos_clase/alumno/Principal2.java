package ejemplos_clase.alumno;

public class Principal2 {

    public static void main(String[] args) {

        Alumno[] vector = new Alumno[3];

        vector[0] = new Alumno(1, "Carmen", 21, 1.61, 'm', true);
        vector[1] = new Alumno(2, "Arturo", 22, 1.62, 'h', false);
        vector[2] = new Alumno(3, "Silvia", 23, 1.63, 'm', true);

        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getCasado() == false) {
                System.out.println(vector[i]);
            }
        }

    }

}
