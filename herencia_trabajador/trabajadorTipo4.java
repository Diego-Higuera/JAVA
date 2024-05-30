
package herencia_trabajador;

public class trabajadorTipo4 extends Trabajador {
    
    private int numeroHorasTrabajadas;
    private int mumeroHorasExtra;

    public trabajadorTipo4() {
    }

    public trabajadorTipo4(int numeroHorasTrabajadas, int mumeroHorasExtra) {
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
        this.mumeroHorasExtra = mumeroHorasExtra;
    }

    public trabajadorTipo4(int numeroHorasTrabajadas, int mumeroHorasExtra, String idTrabajador, String nombre, String apellido) {
        super(idTrabajador, nombre, apellido);
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
        this.mumeroHorasExtra = mumeroHorasExtra;
    }


    

    public int getNumeroHorasTrabajadas() {
        return numeroHorasTrabajadas;
    }

    public void setNumeroHorasTrabajadas(int numeroHorasTrabajadas) {
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
    }

    public int getMumeroHorasExtra() {
        return mumeroHorasExtra;
    }

    public void setMumeroHorasExtra(int mumeroHorasExtra) {
        this.mumeroHorasExtra = mumeroHorasExtra;
    }

    @Override
    public String toString() {
        return "trabajadorTipo4{" + "numeroHorasTrabajadas=" + numeroHorasTrabajadas + ", mumeroHorasExtra=" + mumeroHorasExtra + '}';
    }

    @Override
    public double salario() {
        return this.numeroHorasTrabajadas * 15 + this.mumeroHorasExtra * 20;
    }
    
    
    
}
