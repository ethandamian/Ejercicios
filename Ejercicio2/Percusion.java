/**
 * Clase que representa un Instrumento.
 * 
 * @author Ana Sofia Mecalco Rosas
 * @version 12/06/2022.
 */
public class Percusion {
    protected String marca;
    protected String nombre;
    protected int precio;

    /**
     * Constructor con tres parametros.
     * 
     * @param marca  La marca del instrumento.
     * @param nombre El nombre del instrumento.
     * @param precio El precio del instrumento.
     */
    public Percusion(String marca, String nombre, int precio) {
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Metodo que devuelve la marca del instrumento.
     * 
     * @return La marca del instrumento.
     */
    public String obtenerMarca() {
        return this.marca;
    }

    /**
     * Metodo que devuelve el nombre del instrumento.
     */
    public String obtenerNombre() {
        return this.nombre;
    }

    /**
     * Metodo que devuelve el precio del instrumento.
     * 
     * @return El precio del instruemnto.
     */
    public int obtenerPrecio() {
        return this.precio;
    }

    /**
     * Metodo que asigna un nuevo nombre al isntrumento.
     * 
     * @param nombre El nuevo nombre del instrumento.
     */
    public void asignaNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Asigna una nueva marca al instrumento.
     * 
     * @param marca La nueva marca del instrumento.
     */
    public void asignaMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Asigna un nuevo precio al instruemnto.
     * 
     * @param precio
     */
    public void asignaPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Metodo toString
     * 
     * @return El objeto en forma de cadena.
     */
    public String toString() {
        return "Nombre del instrumento: " + this.nombre + "\nMarca: " + this.marca + "\nPrecio: " + this.precio;
    }
}
