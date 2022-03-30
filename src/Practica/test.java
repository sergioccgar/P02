/**
 * Pruebas unitarias para el segundo ejercicio de Laboratorio de Modelado y
 * Programación
 *
 * @author Sergio Medina Guzmán 3143232428
 */
public class test extends Main{

    public static void main (String args[]) {
        String[] contrasenas = {"holasoysergio","holaSoysergio","9","hola no soy sergio","ab9A","ab9 A123", "äa,AA.AA1", "holaSoysergio9aaaaaaaaaaaaaaaaaaa","ab9A123", "holaSoysergio9", "holaSoysergio9aaaaaaaaaaaaaaaaaa"};
        System.out.println("En los siguientes casos se revisa la validez de la longitud de la contraseña");
        for (String c: contrasenas){
            System.out.println(longitudValida(c));
        }
        System.out.println("-----------------------------");
        System.out.println("En los siguientes casos se revisa que no haya caracteres ilegales en la contraseña");
        for (String c: contrasenas){
            System.out.println(caracteresLegales(c));
        }
        System.out.println("-----------------------------");
        System.out.println("En los siguientes casos se revisa que haya al menos una letra minúscula en la contraseña");
        for (String c: contrasenas){
            System.out.println(hayMinusculas(c));
        }
        System.out.println("-----------------------------");
        System.out.println("En los siguientes casos se revisa que haya al menos una letra mayúscula en la contraseña");
        for (String c: contrasenas){
            System.out.println(hayMayusculas(c));
        }
        System.out.println("-----------------------------");
        System.out.println("En los siguientes casos se revisa que haya al menos un número en la contraseña");
        for (String c: contrasenas){
            System.out.println(hayNumeros(c));
        }
        System.out.println("-----------------------------");
        System.out.println("En los siguientes casos se revisa la validez total de la contraseña");
        for (String c: contrasenas){
            System.out.println(senhaValidator(c));
        }
    }
}
