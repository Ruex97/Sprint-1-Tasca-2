package nivell3;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Clase para manejar la entrada de datos de teclado*/
public class Tools {

    private static final Scanner lectura = new Scanner(System.in);

    public static Scanner getLectura() {
		return lectura;
	}

	/** 
     * Este método se encarga de leer un String de teclado
     * @param mensaje
     * @return String
     */
    public static String readString(String mensaje) {
        String cadena = "";
        boolean correcto = false;

        do {
            System.out.println(mensaje);
            try {
                cadena = lectura.nextLine();
                correcto = true;
            } catch (Exception ex) {
                System.out.println("Error en la introducción de la string.");
            }
        } while (!correcto);
        return cadena;
    }

     /** 
      * Este método se encarga de leer un float de teclado
      * @param mensaje
      * @return float
      */
    public static float readFloat(String mensaje) {
        float numero = 0.0f;
        boolean correcto = false;

        do {
            System.out.print(mensaje);
            try {
                numero = lectura.nextFloat();
                correcto = true;
            } catch (InputMismatchException ex) {
                System.out.println("Error de formato.");
            }
            lectura.nextLine();
        } while (!correcto);
        return numero;
    }

     /** 
      * Este método se encarga de leer un double de teclado 
      * @param mensaje
      * @return double
      */
    public static double readDouble(String mensaje) {
        double numero = 0.0;
        boolean correcto = false;

        do {
            System.out.print(mensaje);
            try {
                numero = lectura.nextDouble();
                correcto = true;
            } catch (InputMismatchException ex) {
                System.out.println("Error de formato.");
            }
            lectura.nextLine();
        } while (!correcto);
        return numero;
    }

     /** 
      * Este método se encarga de leer un entero de teclado
      * @param mensaje
      * @return int
      */
    public static int readInt(String mensaje) {
        int numero = 0;
        boolean correcto = false;

        do {
            System.out.println(mensaje);
            try {
                numero = lectura.nextInt();
                correcto = true;
            } catch (InputMismatchException ex) {
                System.out.println("Error de formato.");
            }
            lectura.nextLine();
        } while (!correcto);
        return numero;
    }
    
    /** 
     * Este método se encarga de leer un byte de teclado
     * @param mensaje
     * @return byte
     */
    public static byte readByte(String mensaje) {
        byte numero = 0;
        boolean correcto = false;

        do {
            System.out.print(mensaje);
            try {
                numero = lectura.nextByte();
                correcto = true;
            } catch (InputMismatchException ex) {
                System.out.println("Error de formato.");
            }
            lectura.nextLine();
        } while (!correcto);
        return numero;
    }

     /** 
      * Este método se encarga de leer un char de teclado
      * @param mensaje 
      * @return char
      */
    public static char readChar(String mensaje) {
        char caracter = 0;
        boolean correcto = false;

        do {
            System.out.print(mensaje);
            try {
                caracter = lectura.next().charAt(0);// Cogemos el primer carácter en una lectura de cadena
                correcto = true;
            } catch (InputMismatchException ex) {
                System.out.println("Error de formato.");
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
            lectura.nextLine();
        } while (!correcto);
        return caracter;
    }
    
    /** 
     * Este método se encarga de leer un boleano de teclado
     * @param mensaje
     * @return boolean
     */
    public static boolean readSiNo(String mensaje) {
        boolean retorno = false;
        boolean correcto = false;
        String cadena = "";

        do {
            System.out.print(mensaje);
            try {
                cadena = lectura.nextLine().toUpperCase();
                correcto = true;
                if (cadena.charAt(0) == 'S') {
                    retorno = true;
                } else if (cadena.charAt(0) == 'N') {
                    retorno = false;
                } else {
                    System.out.println("Introducción no válida.");
                    correcto = false;
                }
            } catch (Exception ex) {
                System.out.println("Error en la introducción de la string.");
            }
        } while (!correcto);
        return retorno;
    }
}

