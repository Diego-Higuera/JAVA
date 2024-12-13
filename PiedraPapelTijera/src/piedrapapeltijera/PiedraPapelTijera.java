package piedrapapeltijera;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PiedraPapelTijera {
    
    public static void main(String[] args) {
        // Crear el JFrame para la aplicación
        JFrame frame = new JFrame("Piedra, Papel o Tijera");
        
        // Configurar la acción cuando se cierre la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establecer el tamaño de la ventana
        frame.setSize(300, 200);  // Ajusta el tamaño según lo que necesites

        // Hacerla visible
        frame.setVisible(false);
        
        while (true) {
            // Crear los jugadores
            Jugador jugador1 = new Jugador();
            Jugador jugador2 = new Jugador("Ordenador", TipoJugador.ORDENADOR);
            
            // Establecer los puntos para ganar (mejor de 3, es decir, 2 puntos)
            int puntosParaGanar = 2;
            
            // Crear la partida
            Partida partida = new Partida(jugador1, jugador2, puntosParaGanar);
            
            // Jugar hasta que haya un ganador
            while (!partida.comprobarGanador()) {
                partida.ronda();
            }
            
            // Preguntar si desea jugar otra partida
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres jugar otra partida?", "Repetir", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "¡Gracias por jugar! Hasta luego.");
                frame.dispose();  // Cierra la ventana cuando el juego termina
                break;
            }
        }
    }
}