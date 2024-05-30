
package herencia_trabajador;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Trabajador> trabajadores_al = Data.obtenerTrabajadoresArchivoCsv();
        util.cabecera();
        for(Trabajador t: trabajadores_al) {
           // System.out.println(t + " " + t.getNombre() + " " + t.salario());
        util.cuerpo(t.getIdTrabajador(),t.getNombre(),t.getApellido(),t.salario());
        }
        
    }
    
}
