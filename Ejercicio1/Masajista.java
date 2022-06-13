/**
 * Clase que representa una masajista de la seleccion de futbol.
 * 
 * @author Ana Sofia Mecalco Rosas
 * @version 12/06/2022.
 */
public class Masajista extends SeleccionFutbol {
    private String apellidos;
    private int edad;
    private int idCertificacion;
    private int aniosDeExperencia;

    /**
     * Constructor con 6 parametros.
     * 
     * @param id                El id de el/la masajista.
     * @param nombre            El nombre de el/la masajista.
     * @param apellidos         Apellidos de el/la masajista.
     * @param edad              La edad de el/la masajista.
     * @param idCertificacion   El id de certificacion de el/la masajista.
     * @param aniosDeExperencia Los años de experencia de el/la masajista.
     */
    public Masajista(int id, String nombre, String apellidos, int edad, int idCertificacion, int aniosDeExperencia) {
        super(id, nombre);
        this.apellidos = apellidos;
        this.edad = edad;
        this.idCertificacion = idCertificacion;
        this.aniosDeExperencia = aniosDeExperencia;
    }

    /**
     * Metodo que devuelve los apellidos del entrenador.
     * 
     * @return Los apellidos del entrenador.
     */
    public String obtenerApellidos() {
        return this.apellidos;
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
     * Metodo que devuelve el ide de certificacion de el/la masajista..
     * 
     * @return el id de certificacion de el/la masajista.
     */
    public int obtenerIdCertificacion() {
        return this.idCertificacion;
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
     * Metodo que asigna un nuevo id de certififacion del entrenador.
     * 
     * @param idCertificacion El nuevo id de certificacion.
     */
    public void asignaIdCertificacion(int idCertificacion) {
        this.idCertificacion = idCertificacion;
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
        return super.toString() + "\nApellidos: " + this.apellidos + "\nEdad: " + this.edad
                + "\nId de Certificacion: " + this.idCertificacion + "\nAnios de experencia: " + this.aniosDeExperencia;
    }
}
