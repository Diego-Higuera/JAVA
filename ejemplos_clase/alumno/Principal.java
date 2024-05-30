
package ejemplos_clase.alumno;

public class Principal {

    public static void main(String[] args) {
    
        Alumno alumno1 = new Alumno(1,"Luis",23,1.72,'h',false);
        Alumno alumno2 = new Alumno(2,"Carmen",22,1.62,'m',true);
        
        System.out.println("Nombre: " + alumno1.getNombre());
        
    }
    
}
