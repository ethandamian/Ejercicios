/**
 * Clase que representa una masajista de la seleccion de futbol.
 * 
 * @author Ana Sofia Mecalco Rosas
 * @version 12/06/2022.
 */
public class Masajista extends IntegranteFutbol {
    private int edad;
    private int aniosDeExperencia;

    /**
     * Constructor con 6 parametros.
     * 
     * @param id                El id de el/la masajista.
     * @param nombre            El nombre de el/la masajista.
     * @param apellidos         Apellidos de el/la masajista.
     * @param idCertificacion   El id de certificacion de el/la masajista.
     * @param edad              La edad de el/la masajista.
     * @param aniosDeExperencia Los años de experencia de el/la masajista.
     */
    public Masajista(int id, String nombre, String apellidos, int idCertificacion, int edad, int aniosDeExperencia) {
        super(id, nombre, apellidos, idCertificacion);
        this.edad = edad;
        this.aniosDeExperencia = aniosDeExperencia;
    }

    /**
     * Metodo que devuelve la edad de el/la masajista.
     * 
     * @return La edad de el/la masajista.
     */
    public int obtenerEdad() {

        return this.edad;
    }

    /**
     * Metodo que devuelven los anños de experencia de el/la masajista.
     * 
     * @return Los años de experencia de el/la masajista.
     */
    public int obtenerAniosDeExperencia() {
        return this.aniosDeExperencia;
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
     * Metodo que asigna nuevos años de experencia.
     * 
     * @param aniosDeExperencia Los nuevos años de experencia.
     */
    public void asignaAniosDeExperencia(int aniosDeExperencia) {
        this.aniosDeExperencia = aniosDeExperencia;
    }

    /**
     * Da masaje.
     */
    public void darMasajes() {
        System.out.println(this.nombre + " esta dando un masaje.");
    }

    /**
     * Metodo toString
     * 
     * @return El objeto en forma de cadena.
     */
    @Override
    public String toString() {
        return super.toString() + "\nEdad: " + this.edad
                + "\nAnios de experencia: " + this.aniosDeExperencia;
    }
}
