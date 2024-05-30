
package herencia_trabajador;

public class trabajadorTipo3 extends Trabajador{
    
    
    private int numeroArticulosProducidos;

    public trabajadorTipo3() {
    }

    public trabajadorTipo3(int numeroArticulosProducidos) {
        this.numeroArticulosProducidos = numeroArticulosProducidos;
    }

    public trabajadorTipo3(int numeroArticulosProducidos, String idTrabajador, String nombre, String apellido) {
        super(idTrabajador, nombre, apellido);
        this.numeroArticulosProducidos = numeroArticulosProducidos;
    }


    

    public int getNumeroArticulosProducidos() {
        return numeroArticulosProducidos;
    }

    public void setNumeroArticulosProducidos(int numeroArticulosProducidos) {
        this.numeroArticulosProducidos = numeroArticulosProducidos;
    }

    @Override
    public String toString() {
        return "trabajadorTipo3{" + "numeroArticulosProducidos=" + numeroArticulosProducidos + '}';
    }

    @Override
    public double salario() {
        return this.numeroArticulosProducidos * 0.01;
    }
    
    
}
