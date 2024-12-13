
package piedrapapeltijera;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Partida {
    private Jugador[] jugadores;
    private int puntosParaGanar;

    public Partida(Jugador jugador1, Jugador jugador2, int puntosParaGanar) {
        this.jugadores = new Jugador[] { jugador1, jugador2 };
        this.puntosParaGanar = puntosParaGanar;
    }

    public void ronda() {
        // Realizar las jugadas
        Jugada jugada1 = jugadores[0].realizarJugada();
        Jugada jugada2 = jugadores[1].realizarJugada();
        
        // Determinar el resultado de la ronda
        int resultado = ganadorRonda(jugada1, jugada2);
        
        
        // Mostrar las elecciones de los jugadores
        String mensaje = "Jugador 1 (" + jugadores[0].getNombre() + "): " + jugada1 + "\n" +
                         "Jugador 2 (" + jugadores[1].getNombre() + "): " + jugada2 + "\n";
        
        // Mostrar quién ha ganado o si es empate
        if (resultado == 0) {
            mensaje += "¡Es un empate!";
        } else if (resultado == 1) {
            jugadores[0].sumarPunto();
            mensaje += "¡" + jugadores[0].getNombre() + " ha ganado la ronda!";
        } else {
            jugadores[1].sumarPunto();
            mensaje += "¡" + jugadores[1].getNombre() + " ha ganado la ronda!";
        }
        
        // Mostrar el mensaje con las jugadas y el resultado
        JOptionPane.showMessageDialog(null, mensaje + "\n\n" + toString());
       
        
    }

    public int ganadorRonda(Jugada jugada1, Jugada jugada2) {
        if (jugada1 == jugada2) {
            return 0; // Empate
        }
        
        if ((jugada1 == Jugada.PIEDRA && jugada2 == Jugada.TIJERA) ||
            (jugada1 == Jugada.TIJERA && jugada2 == Jugada.PAPEL) ||
            (jugada1 == Jugada.PAPEL && jugada2 == Jugada.PIEDRA)) {
            return 1; // Gana el primer jugador
        } else {
            return -1; // Gana el segundo jugador
            
        }
        
    }

    public boolean comprobarGanador() {
        if (jugadores[0].getPuntos() >= puntosParaGanar && jugadores[0].getPuntos() - jugadores[1].getPuntos() >= 2) {
            finalizarPartida(0);
            return true;
        } else if (jugadores[1].getPuntos() >= puntosParaGanar && jugadores[1].getPuntos() - jugadores[0].getPuntos() >= 2) {
            finalizarPartida(1);
            return true;
        }
        return false;
    }

    public void finalizarPartida(int ganadorIndex) {
        JOptionPane.showMessageDialog(null, jugadores[0] + "\n" + jugadores[1]);
        JOptionPane.showMessageDialog(null, "¡Felicidades " + jugadores[ganadorIndex].getNombre() + " has ganado la partida!");
    }

    @Override
    public String toString() {
        return "Jugador 1: " + jugadores[0] + "\nJugador 2: " + jugadores[1] + 
               "\nPuntos necesarios para ganar: " + puntosParaGanar;
    }
}
