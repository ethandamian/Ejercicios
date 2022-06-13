/**
 * Clase que representa un Integrante del equipo.
 * 
 * @author Ana Sofia Mecalco Rosas
 * @version 12/06/2022.
 */
public class IntegranteEquipo extends SeleccionFutbol {
    protected String apellidos;
    protected int idCertificacion;

    /**
     * Constructor con cuatro parametros.
     * 
     * @param id              El id del integrante.
     * @param nombre          El nombre del integrante.
     * @param apellidos       Los apellidos del integrante.
     * @param idCertificacion El id de certificacion del integrante.
     */
    public IntegranteEquipo(int id, String nombre, String apellidos, int idCertificacion) {
        super(id, nombre);
        this.apellidos = apellidos;
        this.idCertificacion = idCertificacion;
    }

    /**
     * Metodo que devuelve los apellidos del integrante.
     * 
     * @return Los apellidos del integrante.
     */
    public String obtenerApellidos() {
        return this.apellidos;
    }

    /**
     * Metodo que devuelve el ide de certificacion del integrante.
     * 
     * @return el id de certificacion del integrante.
     */
    public int obtenerIdCertificacion() {
        return this.idCertificacion;
    }

    /**
     * Metodo que asigna un nuevo id de certififacion del integrante.
     * 
     * @param idCertificacion El nuevo id de certificacion del integrante .
     */
    public void asignaIdCertificacion(int idCertificacion) {
        this.idCertificacion = idCertificacion;
    }

    /**
     * Metodo toString
     * 
     * @return El objeto en forma de cadena.
     */
    @Override
    public String toString() {
        return super.toString() + "\nApellidos: " + this.apellidos + "\nId Certificacion: "
                + this.idCertificacion;
}
