import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Clase Main para el menu.
 * 
 * @author Ana Sofia Mecalco Rosas
 * @version 12/06/2022.
 */
public class Main {
    public static void main(String[] args) {
        // Scanner para las opciones del usuario.
        Scanner scanner = new Scanner(System.in);

        // opciones del usuario.
        int opcion = 0;

        // Scanner para limpiar la pantalla.
        Scanner limpia = new Scanner(System.in);

        // booleano para el menu
        boolean salir = false;
        while (!salir) {
            // Menu principal.
            System.out.println("Bienvenido a la tienda de instruemntos, ¿En que podemos ayudarlo?");
            System.out.println("1. Calcular el precio de vender n instrumentos");
            System.out.println("2. Obtener informacion de un instrumento");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opcion: ");
            try {
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        // El numero de instrumentos que el usuario ingresara.
                        int instrumentos = 0;
                        // La opcion para el tipo de instrumento.
                        int opcion2 = 0;
                        System.out.println("¿Cuantos instrumentos quiere vender?");
                        instrumentos = scanner.nextInt();
                        System.out.print("¿De que tipo de instrumento?");
                        System.out.println("\n1. Percusion");
                        System.out.println("2. Cuerdas");
                        System.out.println("3. Salir al menu principal");
                        System.out.print("Ingrese una opcion: ");
                        opcion2 = scanner.nextInt();
                        switch (opcion2) {
                            case 1:

                                // Se llena un arreglo con instruemntos aleatorios.
                                Percusion[] percusion = llenarInstrumentos(instrumentos, true);
                                // Se obtiene la suma de todos los precios.
                                System.out.println("El precio total de vender " + instrumentos
                                        + " instrumentos de percusion es de: " + obtenerPrecios(percusion));
                                break;
                            case 2:
                                // Se llena un arreglo con instruemntos aleatorios.

                                Percusion[] cuerda = llenarInstrumentos(instrumentos, false);

                                // Se obtiene la suma de todos los precios.
                                System.out.println("El precio total de vender " + instrumentos
                                        + " instrumentos de cuerda es de: " + obtenerPrecios(cuerda));

                                imprimirArreglo(cuerda);
                                break;
                        }
                        System.out.println("Presione enter para continuar...");
                        limpia.nextLine();

                        // codigo ANSI para limpiar la pantalla.
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        break;
                    case 2:
                        // instrumento que se inicializa en null
                        Percusion instrumento = null;
                        System.out.println("¿De que instrumento quiere informacion?");
                        System.out.println("1. Saxofon");
                        System.out.println("2. Flauta");
                        System.out.println("3. Clarinete");
                        System.out.println("4. Trompeta");
                        System.out.println("5. Guitarra");
                        System.out.println("6. Arpa");
                        System.out.println("7.Violin");
                        System.out.println("8. Piano");
                        System.out.println("9. Salir al menu principal");
                        System.out.print("Seleccione una opcion: ");
                        opcion = scanner.nextInt();

                        // Dependiendo la opcion del usuario, la variable instrumento cambiara al tipo
                        // de instruemnto seleccionado
                        switch (opcion) {
                            case 1:
                                instrumento = new Percusion("Yamaha", "Saxofon", 25000);
                                break;
                            case 2:
                                instrumento = new Percusion("Azumi", "Flauta", 4000);
                                break;
                            case 3:
                                instrumento = new Percusion("Selmer", "Clarinete", 10000);
                                break;
                            case 4:
                                instrumento = new Percusion("Bach", "Trompeta", 5500);
                                break;
                            case 5:
                                instrumento = new Cuerda("Gibson", "Guitarra", 10000);
                                break;
                            case 6:
                                instrumento = new Cuerda("Kinnor", "Arpa", 15000);
                                break;
                            case 7:
                                instrumento = new Cuerda("Stentor", "Violin", 5000);
                                break;
                            case 8:
                                instrumento = new Cuerda("Steinway", "Piano", 20000);
                                break;

                        }
                        // Si la opcion no fue 9, se imprime en pantalla el instrumento seleccionado.
                        if (opcion <= 8) {
                            System.out.println("================================================");
                            System.out.println("Su instrumento es:");
                            System.out.println(instrumento + "\n");
                        }

                        System.out.println("Presione enter para continuar...");
                        limpia.nextLine();
                        // codigo ANSI para limpiar la pantalla.
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    case 3:
                        salir = true;
                }
                // exception si el usuario ingresa una opcion invalida
            } catch (InputMismatchException e) {
                System.out.println("Ingresa una opcion valida");
                System.out.println("Presione enter para continuar...");
                limpia.nextLine();
                System.out.print("\033[H\033[2J");
                System.out.flush();

                scanner.next();
            }

        }

    }

    /**
     * Metodo que devuelve un instrumento de percusion aleatorio.
     * 
     * @return Un instrumento de percusion aleatorio.
     */
    public static Percusion percusionAleatorio() {
        Random random = new Random();
        int numero = random.nextInt(4);
        if (numero == 0) {
            return new Percusion("Yamaha", "Saxofon", 25000);
        } else if (numero == 1) {
            return new Percusion("Azumi", "Flauta", 4000);
        } else if (numero == 2) {
            return new Percusion("Selmer", "Clarinete", 10000);
        }
        return new Percusion("Bach", "Trompeta", 5500);

    }

    /**
     * Metodo que devuelve un instrumento de cuerda aleatorio.
     * 
     * @return Un instrumento de cuerda aleatorio.
     */
    public static Cuerda cuerdaAleatorio() {
        Random random = new Random();
        int numero = random.nextInt(4);
        if (numero == 0) {
            return new Cuerda("Gibson", "Guitarra", 10000);
        } else if (numero == 1) {
            return new Cuerda("Kinnor", "Arpa", 15000);
        } else if (numero == 2) {
            return new Cuerda("Stentor", "Violin", 5000);
        }
        return new Cuerda("Steinway", "Piano", 20000);
    }

    /**
     * Metodo que llena un arreglo de instrumentos.
     * 
     * @param n      El numero de elementos del arreglo.
     * @param opcion true si es un arreglo de instrumentos de percusion, false si es
     *               un arreglo de instrumentos de cuerda.
     * @return El arreglo de instrumentos.
     */
    public static Percusion[] llenarInstrumentos(int n, boolean opcion) {
        Percusion[] instrumentos = new Percusion[n];

        if (opcion == true) {
            for (int i = 0; i < instrumentos.length; i++) {
                instrumentos[i] = percusionAleatorio();
            }
        } else {
            for (int i = 0; i < instrumentos.length; i++) {
                instrumentos[i] = cuerdaAleatorio();
            }
        }

        return instrumentos;
    }

    /**
     * Metodo que obtiene la suma de los precios de un arreglo de instrumentos.
     * 
     * @param p El arreglo del que se quiere obtener la suma de los precios.
     * @return La suma de los precios del arreglo.
     */
    public static int obtenerPrecios(Percusion[] p) {
        int suma = 0;
        for (int i = 0; i < p.length; i++) {
            suma += p[i].obtenerPrecio();
        }
        return suma;
    }

    public static void imprimirArreglo(Percusion[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("\n" + arreglo[i]);
        }
    }
}
