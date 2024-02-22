package Principal;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private String pais;
    private String posicion;
    private int goles;

    public Jugador(String nombre, String pais, String posicion, int goles) {
        this.nombre = nombre;
        this.pais = pais;
        this.posicion = posicion;
        this.goles = goles;
    }

    // Getters y setters aquí

    public static List<Jugador> obtenerListaJugadores() {
        List<Jugador> jugadores = new ArrayList<>();

        // Aquí agregamos algunos jugadores de ejemplo
        jugadores.add(new Jugador("Lionel Messi", "Argentina", "Delantero", 25));
        jugadores.add(new Jugador("Cristiano Ronaldo", "Portugal", "Delantero", 23));
        jugadores.add(new Jugador("Neymar Jr", "Brasil", "Delantero", 20));
        jugadores.add(new Jugador("Jesús Navas", "España", "Delantero", 12));
        jugadores.add(new Jugador("Álvaro Negredo", "España", "Delantero", 10));
        jugadores.add(new Jugador("Luis Fabiano", "Brasil", "Delantero", 15));
        // Agrega más jugadores según sea necesario

        return jugadores;
    }

    public static List<Jugador> obtenerMaximosGoleadores() {
        List<Jugador> maximosGoleadores = new ArrayList<>();

        // Aquí agregamos algunos máximos goleadores del Sevilla FC de ejemplo
        maximosGoleadores.add(new Jugador("Jesús Navas", "España", "Delantero", 12));
        maximosGoleadores.add(new Jugador("Lionel Messi", "Argentina", "Delantero", 25));
        maximosGoleadores.add(new Jugador("Luis Fabiano", "Brasil", "Delantero", 15));
        // Agrega más jugadores según sea necesario

        return maximosGoleadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    
    
}
