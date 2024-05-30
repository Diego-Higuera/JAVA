
package composicion_universidad;

public class Principal {

    public static void main(String[] args) {
        Universidad u = new Universidad("Complutense");
       // u.setNombre("Complutense");
        for(int i=0; i<Data.idEstudiante.length; i++) {
            u.agregarEstudiante(Data.idEstudiante[i], Data.nombre[i], Data.carrera[i]);
            
        }
        System.out.println(u);
        util.cabecera();
        for(Estudiante e: u.getEstudiantes_al()) {
           // System.out.println(e);
           util.cuerpo(e.getIdEstudiante(), e.getNombre(), e.getCarrera());
        }
    }
    
}
