import java.util.Random;

/**
 * Clase que representa instrumentos de cuerda.
 * 
 * @author Ana Sofia Mecalco Rosas
 * @version 12/06/2022.
 */
public class Cuerda extends Percusion {
    private int antiguedad;

    /**
     * Constructor de tres parametros.
     * 
     * @param marca  La marca del instrumento.
     * @param nombre El nombre del instrumento.
     * @param precio el precio del instrumento.
     */
    public Cuerda(String marca, String nombre, int precio) {
        super(marca, nombre, precio);
        Random antiguedad = new Random();
        this.antiguedad = antiguedad.nextInt(13);
    }

    /**
     * Metodo que devuelve el precio del instruemnto de cuerda.
     * 
     * @return El precio del instrumento de cuerda.
     */
    @Override
    public int obtenerPrecio() {
        precio();

        return this.precio;

    }

    /**
     * Metodo auxiliar para calular el precio de un instrumento de cuerda.
     */
    public void precio() {
        int descuento = 0;
        if (antiguedad >= 1 && antiguedad < 3) {
            descuento = (this.precio * 5) / 100;
            this.precio = this.precio - descuento;
        } else if (antiguedad >= 3 && antiguedad < 7) {
            descuento = (this.precio * 10) / 100;
            this.precio = this.precio - descuento;
        } else if (antiguedad >= 7 && antiguedad < 12) {
            descuento = (this.precio * 25) / 100;
            this.precio = this.precio - descuento;
        } else if (antiguedad >= 12) {
            this.precio = this.precio / 2;
        }
    }

    /**
     * Metodo toString
     * 
     * @return El objeto en forma de cadena.
     */
    @Override
    public String toString() {
        return super.toString() + "\nAntiguedad: " + this.antiguedad + " meses";
    }

}
