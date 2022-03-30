/**
 * Pruebas unitarias para el segundo ejercicio de Laboratorio de Modelado y
 * Programación
 *
 * @author Sergio Medina Guzmán 3143232428
 */
public class test extends Main{

    public static void main (String args[]) {
        String[] contrasenas = {"holasoysergio","holaSoysergio","9","hola no soy sergio","ab9A","ab9 A123", "äa,AA.AA1", "holaSoysergio9aaaaaaaaaaaaaaaaaaa", "holaSoysergio9?", "holaSoysergio9A", "ab9A123", "holaSoysergio9", "holaSoysergio9aaaaaaaaaaaaaaaaaa"};
        System.out.println("Contraseña - Cumple longitud - Cumple caracteres legales - Cumple al menos una minuscula - Cumple al menos una mayuscula - Cumple al menos un numero");
        System.out.println("holasoysergio                     - true - true - true - false - false");
        System.out.println("holasoySergio                     - true - true - true - true - false");
        System.out.println("9                                 - false - true - false - false - true");
        System.out.println("hola no soy sergio                - true - false - true - false - false");
        System.out.println("ab9A                              - false - true - true - true - true");
        System.out.println("ab9 A123                          - true - false - true - false - false");
        System.out.println("äa,AA.AA1                         - true - false - true - true - true");
        System.out.println("holaSoysergio9aaaaaaaaaaaaaaaaaaa - false - true - true - true - true");
        System.out.println("holaSoysergio9?                   - true - false - true - true - true");
        System.out.println("holaSoysergio9A                   - true - true - true - true - true");
        System.out.println("ab9A123                           - true - true - true - true - true");
        System.out.println("holaSoysergio9                    - true - true - true - true - true");
        System.out.println("holaSoysergio9aaaaaaaaaaaaaaaaaa  - true - true - true - true - true");
        System.out.println("En los siguientes casos se revisa la validez de la longitud de la contraseña");
        for (String c: contrasenas){
            System.out.println(longitudValida(c));
        }
        System.out.println("-----------------------------");
        System.out.println("En los siguientes casos se revisa que sólo haya caracteres legales en la contraseña");
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
