
package piedrapapeltijera;

import javax.swing.*;

public class Jugador {
    private String nombre;
    private TipoJugador tipo;
    private int puntos;

    // Constructor por defecto
    public Jugador() {
        // Crear un JFrame para la interfaz de la aplicación
        JFrame frame = new JFrame("Jugador");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150); // Ajusta el tamaño de la ventana
        frame.setVisible(false);

        // Crear un JTextField para ingresar el nombre
        JTextField campoTexto = new JTextField(20); // 20 es el tamaño del campo de texto

        // Crear un panel para colocar el campo de texto
        JPanel panel = new JPanel();
        panel.add(new JLabel("Introduce el nombre del jugador:"));
        panel.add(campoTexto);

        // Mostrar el cuadro de entrada sin opción de cancelar
        int opcion = JOptionPane.showOptionDialog(frame, panel, "Nombre del Jugador", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Aceptar" }, "Aceptar");

        // Validar la entrada: si no se ingresa nada o se cierra la ventana, se asigna un nombre por defecto
        if (opcion == JOptionPane.CLOSED_OPTION) {
            //JOptionPane.showMessageDialog(frame, "La ventana fue cerrada. Terminando el programa.");
            System.exit(0);  // Cierra la aplicación si el usuario cierra la ventana
        } else {
            this.nombre = campoTexto.getText().trim();
        }

        // Selección del tipo de jugador (Humano u Ordenador)
        Object[] tipos = { "Humano", "Ordenador" };
        int tipoSeleccionado = JOptionPane.showOptionDialog(frame, "Selecciona el tipo de jugador", "Tipo de jugador",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tipos, tipos[0]);

        if (tipoSeleccionado == JOptionPane.CLOSED_OPTION) {
            //JOptionPane.showMessageDialog(frame, "La ventana fue cerrada. Terminando el programa.");
            System.exit(0);  // Cierra la aplicación si el usuario cierra la ventana
        }

        this.tipo = (tipoSeleccionado == 0) ? TipoJugador.HUMANO : TipoJugador.ORDENADOR;
        this.puntos = 0;

        // Cerrar la ventana de selección del jugador
        frame.dispose();  // Cierra la ventana una vez se haya completado el ingreso de datos
    }

    // Constructor sobrecargado
    public Jugador(String nombre, TipoJugador tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.puntos = 0;
    }

    // Método para sumar puntos
    public void sumarPunto() {
        this.puntos++;
    }

    // Método para realizar una jugada
    public Jugada realizarJugada() {
        
        if (this.tipo == TipoJugador.HUMANO) {
            Object[] opciones = { "Piedra", "Papel", "Tijera" };
            int eleccion = JOptionPane.showOptionDialog(null, "Selecciona tu jugada", "Jugada", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
            return Jugada.values()[eleccion];
            
        } else {
            return Jugada.values()[(int) (Math.random() * 3)];
        }
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public TipoJugador getTipo() {
        return tipo;
    }

    public int getPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ") - Puntos: " + puntos;
    }
}