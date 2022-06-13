import javax.swing.ImageIcon;

/**
 * Clase que representa un jugador de la seleccion de futbol.
 * 
 * @author Ana Sofia Mecalco Rosas
 * @version 12/06/2022.
 */
public class Jugador extends SeleccionFutbol {
    private int edad;
    private final ImageIcon fotografia = new ImageIcon();
    private String posicionQueJuega;

    /**
     * Constructor que recibe cuatro parametros.
     * 
     * @param id               El id del jugador.
     * @param nombre           EL nombre del jugador.
     * @param edad             La edad del jugador.
     * @param posicionQuejuega La posicion en la que juega el jugador.
     */
    public Jugador(int id, String nombre, int edad, String posicionQuejuega) {
        super(id, nombre);
        this.edad = edad;
        this.edad = edad;
        this.posicionQueJuega = posicionQuejuega;
    }

    /**
     * Metodo que devuelve la edad del jugador.
     * 
     * @return La edad del jugador.
     */
    public int obtenerEdad() {

        return this.edad;
    }

    /**
     * Metodo que devuelve la fotografia del jugador.
     * 
     * @return La fotografia del jugador.
     */
    public ImageIcon obetenerFoto() {
        return this.fotografia;
    }

    /**
     * Metodo que devuelve la posicion en la que juega el jugador.
     * 
     * @return La posicion en la que juega el jugador.
     */
    public String posicion() {
        return this.posicionQueJuega;
    }

    /**
     * Metodo que asigna una nueva edad al jugador.
     * 
     * @param edad La nueva edad.
     */
    public void asignaEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo que asigna una nueva posicion al jugador.
     * 
     * @param posicion La nueva posicion.
     */
    public void asignaPosicion(String posicion) {
        this.posicionQueJuega = posicion;
    }

    /**
     * El jugador juega.
     */
    public void jugar() {
        System.out.println(this.nombre + " esta jugando.");
    }

    /**
     * El jugador entrena.
     */
    public void entrenar() {
        System.out.println(this.nombre + " esta entrenando.");

    }

    /**
     * Metodo toString.
     * 
     * @return El objeto en forma de cadena.
     */
    @Override
    public String toString() {
        return super.toString() + "\nEdad: " + this.edad + "\nPosicion: " + this.posicionQueJuega;
    }
}
