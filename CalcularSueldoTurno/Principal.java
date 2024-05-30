package CalcularSueldoTurno;

//CALCULAR EL MONTO A PAGAR PARA EL TURNO MAÑANA Y TARDE
public class Principal {

    public static void main(String[] args) {
       //CENTRO DATOS (BASE DATOS)
       String[] nombre = {"Luis","Miguel","Carlos","Carmen","Arturo"};
       String[] turno =  {"M","T","M","T","M"};
       double[] sueldo = {1000, 1400, 1500, 1350, 1280};
       //ACUMULADOR
       double sueldoManana = 0;
       double sueldoTarde = 0;
       for(int i=0; i<nombre.length; i++) {
           if(turno[i].equalsIgnoreCase("M")) {
              sueldoManana = sueldoManana + sueldo[i]; 
           }else {
              sueldoTarde = sueldoTarde + sueldo[i]; 
           }
       }
       System.out.println("Gasto Sueldo Mañana: " + sueldoManana);
       System.out.println("Gasto Sueldo Tarde : " + sueldoTarde);
    }
}
