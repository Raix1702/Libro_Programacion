//Dado un caracter determinar si es una vocal
package Capitulo_03_Estructura_selectiva_simple;
import java.util.Scanner;
public class Problema_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        String r="";
        System.out.println("Ingrese el caracter: ");
        c = sc.next().charAt(0);
            if (c=='a'|| c == 'A') {
                r = "Es vocal";
            }
            else if (c=='b'|| c == 'B') {
                r = "es vocal";
            }
            else if (c == 'c'|| c == 'C'){
                r = "es vocal";
            }
            else if (c== 'd'|| c == 'D') {
                r = "es vocal";
            }
            else if (c == 'e'|| c == 'E'){
                r = "es vocal";
            }
            else
                r= "no es vocal";
            System.out.println("El caracter " + r + ":");
    }
}
