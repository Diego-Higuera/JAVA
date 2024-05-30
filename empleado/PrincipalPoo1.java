package empleado;

public class PrincipalPoo1 {

    public static void main(String[] args) {
       
        int horasTrabajadas = (int)(Math.random()*81+20);
        Empleado e = new Empleado("Miguel",horasTrabajadas);
        System.out.println("Nombre          : " + e.getNombre());
        System.out.println("Horas Trabajadas: " + e.getHorasTrabajadas());
        System.out.println("Sueldo          : " + e.sueldo());
    }
}
