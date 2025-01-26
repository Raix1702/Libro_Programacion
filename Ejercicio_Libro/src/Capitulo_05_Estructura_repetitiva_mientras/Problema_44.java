//Obtener la cantidad de los primeros N números múltiplos de 5

package Capitulo_05_Estructura_repetitiva_mientras;
import java.util.Scanner;
public class Problema_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        int n,m=0;
        System.out.println("Ingrese el numero: ");
        n=sc.nextInt();

        while (i<n) {
            if (n%5==0) {
                m++;
            }
            i++;
        }
        System.out.println("Los numeros multiplos de 5 son: "+m);
        sc.close();
    }
}
