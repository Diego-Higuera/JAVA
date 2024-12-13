package hotel;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Hotel {

    public static void main(String[] args) {

        //INICIALIZAR ARRAY
        ArrayList<Habitacion> habitaciones = new ArrayList<>();

        // MENU
        while (true) {
            String[] opciones = {"Crear nueva habitación", "Ver habitaciones", "Reservar habitacion", "Liberar habitacion"};
            int opcion = JOptionPane.showOptionDialog(null, "Selecciona una opción", "Menú",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {

                // CREAR HABITACION
                case 0:

                    //INTRODUCIR NUMERO DE HABITACION
                    String numeroHabitacion = JOptionPane.showInputDialog("Introduce el número de habitación:");

                    if (numeroHabitacion == null || numeroHabitacion.isEmpty()) {
                        numeroHabitacion = "000";

                        for (Habitacion h : habitaciones) {
                            if (h.getNumeroHabitacion().equals(numeroHabitacion)) {
                                JOptionPane.showMessageDialog(null, "Habitacion ya creada.", "Error", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                        }
                    }

                    //SELECCIONAR TIPO DE HABITACION
                    String[] tiposHabitacion = {"doble", "individual", "triple", "suite", "suiteJunior"};
                    String tipoSeleccionado = (String) JOptionPane.showInputDialog(null, "Selecciona el tipo de habitación:", "Tipo de habitación", JOptionPane.QUESTION_MESSAGE, null, tiposHabitacion, tiposHabitacion[0]);
                    TipoHabitacion tipo = TipoHabitacion.valueOf(tipoSeleccionado.toLowerCase());

                    // CREAR HABITACION Y AÑADIRLA AL ARRAY
                    Habitacion nuevaHabitacion = new Habitacion(numeroHabitacion, tipo, false, 0);
                    habitaciones.add(nuevaHabitacion);

                    JOptionPane.showMessageDialog(null, "Habitación creada.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    break;

                // PRESENTACION DE INFORMACION
                case 1:
                    if (habitaciones.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay habitaciones creadas.", "Información", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        StringBuilder habitacionesInfo = new StringBuilder("Habitaciones:\n");
                        for (Habitacion h : habitaciones) {
                            habitacionesInfo.append(h.toString()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, habitacionesInfo.toString(), "Lista de Habitaciones", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                // RESERVAR HABITACION
                case 2:
                    if (habitaciones.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay habitaciones disponibles para reservar.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        String numeroHabitacionReserva = JOptionPane.showInputDialog("Introduce el número de habitación para reservar:");
                        Habitacion habitacionReservada = null;

                        for (Habitacion h : habitaciones) {
                            if (h.getNumeroHabitacion().equals(numeroHabitacionReserva)) {
                                habitacionReservada = h;
                                break;
                            }
                        }

                        if (habitacionReservada != null) {
                            habitacionReservada.reservarHabitacion(0);
                        } else {
                            JOptionPane.showMessageDialog(null, "Habitación no encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;

                // LIBERAR HABITACION
                case 3:

                    if (habitaciones.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay habitaciones disponibles para liberar.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        String numeroHabitacionLiberar = JOptionPane.showInputDialog("Introduce el número de habitación para liberar:");
                        Habitacion habitacionLiberada = null;

                        for (Habitacion h : habitaciones) {
                            if (h.getNumeroHabitacion().equals(numeroHabitacionLiberar)) {
                                habitacionLiberada = h;
                                break;
                            }
                        }

                        if (habitacionLiberada != null) {
                            habitacionLiberada.dejarLibre();
                            JOptionPane.showMessageDialog(null, "Habitación liberada.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Habitación no encontrada.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Sayonara baby.", "Cerrando programa", JOptionPane.INFORMATION_MESSAGE);
                    return;
            }
        }
    }
}
