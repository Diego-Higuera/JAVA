package hotel;

import javax.swing.JOptionPane;

public class Habitacion {

    //INICIALIZAR
    private String numeroHabitacion = "000";
    private TipoHabitacion tipo = TipoHabitacion.doble;
    private boolean ocupada = false;
    private int numeroOcupantes = 0;

    //CONSTRUCTORES
    public Habitacion() {
    }

    public Habitacion(String numeroHabitacion, TipoHabitacion tipo, boolean ocupada, int numeroOcupantes) {

        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.ocupada = ocupada;
        this.numeroOcupantes = numeroOcupantes;
    }

    //GETTERS
    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public int getNumeroOcupantes() {
        return numeroOcupantes;
    }

    //SETTERS
    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public void setNumeroOcupantes(int numeroOcupantes) {
        this.numeroOcupantes = numeroOcupantes;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Habitacion : " + "Numero Habitacion = " + numeroHabitacion + ", Tipo = " + tipo + ", Ocupada = " + ocupada + ", Numero Ocupantes = " + numeroOcupantes + '.';
    }

    //METODO RESERVAR HABITACION
    public void reservarHabitacion(int numeroOcupantes) {
        if (ocupada) {
            JOptionPane.showMessageDialog(null, "Habitacion ya ocupada.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int personas = (int) obtenerNumero("Introduce numero de personas:", true);

            if (personas > obtenerCapacidadMaxima()) {
                JOptionPane.showMessageDialog(null, "El número de personas excede la capacidad máxima de la habitación.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                this.numeroOcupantes = personas;
                this.ocupada = true;
                JOptionPane.showMessageDialog(null, "Reserva completada.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    //METODO DEJAR LIBRE HABITACION
    public void dejarLibre() {
        if (ocupada) {
            this.ocupada = false;
            this.numeroOcupantes = 0;
        } else {
            JOptionPane.showMessageDialog(null, "Habitacion ya libre", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // METODO OBTENER CAPACIDAD MAXIMA HABITACIONES
    public int obtenerCapacidadMaxima() {
        switch (tipo) {
            case individual:
                return 1;
            case doble:
                return 2;
            case triple:
                return 3;
            case suiteJunior:
                return 2;
            case suite:
                return 4;
            default:
                return 0;
        }
    }

    //METODO COMPROBAR NUMERO
    public int obtenerNumero(String mensaje, boolean soloPositivos) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                if (input == null || input.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Este campo no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                int numero = Integer.parseInt(input);
                if (soloPositivos && numero <= 0) {
                    JOptionPane.showMessageDialog(null, "El número debe ser positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                return numero;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, introduce un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
