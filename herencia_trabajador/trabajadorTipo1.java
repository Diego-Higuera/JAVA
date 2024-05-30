
package herencia_trabajador;

public class trabajadorTipo1 extends Trabajador {
    
    private double salarioSemanalFijo;

    public trabajadorTipo1() {
    }

    public trabajadorTipo1(double salarioSemanalFijo) {
        this.salarioSemanalFijo = salarioSemanalFijo;
    }

    public trabajadorTipo1(double salarioSemanalFijo, String idTrabajador, String nombre, String apellido) {
        super(idTrabajador, nombre, apellido);
        this.salarioSemanalFijo = salarioSemanalFijo;
    }



    public double getSalarioSemanalFijo() {
        return salarioSemanalFijo;
    }

    public void setSalarioSemanalFijo(double salarioSemanalFijo) {
        this.salarioSemanalFijo = salarioSemanalFijo;
    }

    @Override
    public String toString() {
        return "trabajadorTipo1{" + "salarioSemanalFijo=" + salarioSemanalFijo + '}';
    }

    @Override
    public double salario() {
        return this.salarioSemanalFijo * 4;
    }
    
    
    
    
}
