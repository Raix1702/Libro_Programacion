//Dado un rango de números enteros, obtener la cantidad de números pares que contiene

package Capitulo_05_Estructura_repetitiva_mientras;
import java.util.Scanner;
public class Problema_43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ni,nf;
        int i,np=0;
        System.out.println("Ingrese el primer numero: ");
        ni=sc.nextInt();
        System.out.println("Ingrese el numero final: ");
        nf=sc.nextInt();
        i=ni+1;
        while (i<nf) {
            if (i % 2 == 0) {
                np++;
            }
        }
        System.out.println("El numero de valores pares es de: " + np);
        sc.close();
    }
}
