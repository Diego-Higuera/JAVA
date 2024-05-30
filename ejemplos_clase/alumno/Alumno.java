package ejemplos_clase.alumno;

public class Alumno {

    //(1)ATRIBUTOS O VARIABLES DE INSTANCIA (OBJETO)
    private int idAlumno;
    private String nombre;
    private int edad;
    private double estatura;
    private char sexo;
    private boolean casado; //true,false
    //(2) CONSTRUCTOR/ES: INICIALIZAR LOS VALORES DEL OBJETO

    public Alumno(int idAlumno, String nombre, int edad, double estatura, char sexo, boolean casado) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.sexo = sexo;
        this.casado = casado;
    }
    //(3) METODOS SET(PONER) Y GET(RECUPERAR)

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean getCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
        
        
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + ", sexo=" + sexo + ", casado=" + casado + '}';
    }

}
