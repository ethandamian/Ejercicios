/**
 * Clase que representa una seleccion de futbol.
 * 
 * @author Ana Sofia Mecalco Rosas
 * @version 12/06/2022.
 */
public class SeleccionFutbol {
    protected int id;
    protected String nombre;

    /**
     * Constructor con dos parametros.
     * 
     * @param id     El id del integrante de la seleccion.
     * @param nombre El nombre del integrante de la selección.
     */
    public SeleccionFutbol(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Metodo que devuelve el id del integrante.
     * 
     * @return EL id del integrante.
     */
    public int obtenerId() {
        return this.id;
    }

    /**
     * Metodo que devuelve el nombre del integrante de la seleccion.
     * 
     * @return El nombre del integrante de la seleccion.
     */
    public String obtenerNombre() {
        return this.nombre;
    }

    /**
     * Metodo que asigna un nuevo id al integrante de la seleccion.
     * 
     * @param id El nuevo id del integrante de la seleccion.
     */
    public void asignaId(int id) {
        this.id = id;
    }

    /**
     * Metodo que asigna un nuevo nombre al integrante de la seleccion.
     * 
     * @param nombre El nuevo nombre del integrante de la seleccion.s
     */
    public void asignaNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para que el integrante de la seleccion se concentre
     */
    public void concentrarse() {
        System.out.println(this.nombre + " se esta concentrando");
    }

    public void viajar() {
        System.out.println(this.nombre + " esta viajando");
    }

    /**
     * Metodo toString
     * 
     * @return El objeto en forma de cadena.
     */
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nId: " + this.id;
    }
}