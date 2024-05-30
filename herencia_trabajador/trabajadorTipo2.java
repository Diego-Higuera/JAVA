
package herencia_trabajador;

public class trabajadorTipo2 extends Trabajador {
    
    private double salarioBase;
    private double ventaRealizada;

    public trabajadorTipo2() {
    }

    public trabajadorTipo2(double salarioBase, double ventaRealizada) {
        this.salarioBase = salarioBase;
        this.ventaRealizada = ventaRealizada;
    }

    public trabajadorTipo2(double salarioBase, double ventaRealizada, String idTrabajador, String nombre, String apellido) {
        super(idTrabajador, nombre, apellido);
        this.salarioBase = salarioBase;
        this.ventaRealizada = ventaRealizada;
    }



    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getVentaRealizada() {
        return ventaRealizada;
    }

    public void setVentaRealizada(double ventaRealizada) {
        this.ventaRealizada = ventaRealizada;
    }

    @Override
    public String toString() {
        return "trabajadorTipo2{" + "salarioBase=" + salarioBase + ", ventaRealizada=" + ventaRealizada + '}';
    }

    @Override
    public double salario() {
        return this.salarioBase + this.ventaRealizada * 0.1;
    }
    
    
    
}
