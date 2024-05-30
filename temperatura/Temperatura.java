package temperatura;

public class Temperatura {

    //(1) VARIABLES DE INSTANCIA
    //ENTRADA
    private double temperaturaEntrada;
    private String opcion;

    //SALIDA (CALCULO)
    private double temperaturaSalida;

    //(2) CONSTRUCTORES
    public Temperatura(double temperaturaEntrada, String opcion) {
        this.temperaturaEntrada = temperaturaEntrada;
        this.opcion = opcion;
    }

    public Temperatura() {
    }

    //(3) METODOS SET Y GET
    public double getTemperaturaEntrada() {
        return temperaturaEntrada;
    }

    public void setTemperaturaEntrada(double temperaturaEntrada) {
        this.temperaturaEntrada = temperaturaEntrada;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    //(4) METODO SALIDA (CALCULO)
    public double temperaturaSalida() {
        switch (this.opcion) {
            case "FC":
                this.temperaturaSalida = 5 / 9.0 * (this.temperaturaEntrada - 32);    //CELSIUS
                break;
            case "CF":
                this.temperaturaSalida = 9 / 5.0 * this.temperaturaEntrada + 32;      //FAHRENHEIT
                break;
            default: System.out.println("ENTRADA INCORRECTA");
        }
        return this.temperaturaSalida;
    }
    
    //(5) METODOS MOSTRAR ATRIBUTOS DE LA CLASE

    @Override
    public String toString() {
        return "Temperatura{" + "temperaturaEntrada=" + this.temperaturaEntrada + ", opcion=" + this.opcion + ", temperaturaSalida=" + this.temperaturaSalida() + '}';
    }

}
