import java.util.Scanner;
import java.io.IOException;
/**
 * Segundo ejercicio de Laboratorio de la clase Modelado y Programación
 *
 * @author Sergio Medina Guzmán 3143232428
 */
public class Main {

    /**
     * Método que verifica que una ~senha~ sea de longitud entre 6 y 32 caracteres.
     *
     * @param c Cadena a revisar
     */
    public static boolean longitudValida(String c){
        boolean b = false;
        if (c.length() <= 32 && c.length() >= 6) b = true;
        return b;
    }

    /**
     * Método que verifica que una ~senha~ no tenga caracteres ilegales
     *
     * @param c Cadena a revisar
     */
    public static boolean caracteresLegales(String c){
        String legales = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        boolean b = false;
        for (char origen: c.toCharArray()){
            b = false;
            for (char compara: legales.toCharArray()){
                if (origen == compara) b = true;
                if (b == true) break;
            }
            if (b == false) break;
        }
        return b;
    }

    /**
     * Método que verifica que una ~senha~ tenga al menos una minúscula
     *
     * @param c Cadena a revisar
     */
    public static boolean hayMinusculas(String c){
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        boolean b = false;
        for (char origen: c.toCharArray()){
            if (b == true) break; // Evita seguir comparando cuando ya se encontró una minúscula.
            for (char compara: minusculas.toCharArray()){
                if (b == true) break; // Evita seguir comparando la letra ya encontrada con el resto del alfabeto
                if (origen == compara) b = true;
                //System.out.println(origen);
            }
        }
        return b;
    }

    /**
     * Método que verifica que una ~senha~ tenga al menos una mayúscula
     *
     * @param c Cadena a revisar
     */
    public static boolean hayMayusculas(String c){
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        boolean b = false;
        for (char origen: c.toCharArray()){
            if (b == true) break; // Evita seguir comparando cuando ya se encontró una mayúscula.
            for (char compara: mayusculas.toCharArray()){
                if (b == true) break; // Evita seguir comparando la letra ya encontrada con el resto del alfabeto
                if (origen == compara) b = true;
                //System.out.println(origen);
            }
        }
        return b;
    }

    /**
     * Método que verifica que una ~senha~ tenga al menos un número
     *
     * @param c Cadena a revisar
     */
    public static boolean hayNumeros(String c){
        String numeros = "0123456789";
        boolean b = false;
        for (char origen: c.toCharArray()){
            if (b == true) break; // Evita seguir comparando cuando ya se encontró un número.
            for (char compara: numeros.toCharArray()){
                if (b == true) break; // Evita seguir comparando la letra ya encontrada con el resto de los dígitos.
                if (origen == compara) b = true;
                //System.out.println(origen);
            }
        }
        return b;
    }

    /**
     * Método que verifica que una ~senha~ cumpla los requerimientos del sistema
     *
     * @param c Cadena a revisar como ~senha~ válida
     */
    public static String senhaValidator(String c){
        if (longitudValida(c) && caracteresLegales(c) && hayMinusculas(c) && hayMayusculas(c) && hayNumeros(c)) {
            return "Senha valida.";
        } else return "Senha invalida.";
    }

    public static void main (String args[]) throws IOException {
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println(senhaValidator(scn.nextLine()));
        } while (scn.hasNextLine());
    }
}
