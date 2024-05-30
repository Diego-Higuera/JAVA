package empleado;

public class Empleado {

    public static int SUELDOBASE = 200;
    public static int PRECIOXHORATRABAJADA = 20;

    //(1) VARIABLE INSTANCIA
    //ENTRADA
    private String nombre;
    private int horasTrabajadas;

    //SALIDA (CALCULO)
    private double sueldo;

    //(2) CONSTRUCTORES
    public Empleado(String nombre, int horasTrabajadas) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
    }

    public Empleado() {
    }

    //(3) METODOS SET Y GET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    //(4) METODO SALIDA CALCULO
    public double sueldo() {
        return Empleado.SUELDOBASE + this.horasTrabajadas * Empleado.PRECIOXHORATRABAJADA;
    }

    //(5) METODOS MOSTRAR ATRIBUTOS DE LA CLASE
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", horasTrabajadas=" + horasTrabajadas + ", sueldo=" + sueldo() + '}';
    }
}
