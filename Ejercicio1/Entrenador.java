
/**
 * Clase que representa un entrenador de la seleccion de futbol.
 * 
 * @author Ana Sofia Mecalco Rosas
 * @version 12/06/2022.
 */
public class Entrenador extends IntegranteFutbol {
    private String CURP;

    /**
     * Constructor con cinco parametros.
     * 
     * @param id              El id del entrenador.
     * @param nombre          El nombre del entrenador.
     * @param apellidos       Los apellidos del entrenador.
     * @param idCertificacion El id de certificacion del entrenador.
     * @param CURP            El CURP del entrenador.
     */
    public Entrenador(int id, String nombre, String apellidos, int idCertificacion, String CURP) {
        super(id, nombre, apellidos, idCertificacion);
        this.CURP = CURP;

    }

    /**
     * Metodo que devuelve el CURP del entrenador.
     * 
     * @return El CURP del entrenador.
     */
    public String obtenerCURP() {
        return this.CURP;
    }

    /**
     * Dirige el partido.
     * 
     */
    public void dirigirPartido() {
        System.out.println("Bien, hoy dirijo el partido...");
    }

    /**
     * Dirige el partido
     */
    public void dirigirEntrenamiento() {
        System.out.println("A entrenar chavxs");
    }

    /**
     * Metodo toString
     * 
     * @return El objeto en forma de cadena.
     */
    @Override
    public String toString() {
        return super.toString() + "\nCURP: " + this.CURP;
    }
}
