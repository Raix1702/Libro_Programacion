//Obtener la suma de los primeros n numeros naturales positivos


package Capitulo_05_Estructura_repetitiva_mientras;
import java.util.Scanner;
public class Problema_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,s=0;
        System.out.println("Ingrese el numero: ");
        n=sc.nextInt();

        i=1;
        while (i<=n) {
            s=n+1;
            i++;
        }
        System.out.println("EL resultado es de: " + s);
        sc.close();
    }
}
