//Dado un numero, determinar la cantidad de digitos pares que contiene
package Capitulo_05_Estructura_repetitiva_mientras;
import java.util.Scanner;
public class Problema_46{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i=1,c=0;
        System.out.println("Ingrese el numero: ");
        n=sc.nextInt();
        while (n>0) {
            if (n%2==0) {
                n=n/10;
                c++;
            }
            i++;
        }
        System.out.println("La cantidad de numeros pares es de: " + c);
        sc.close();
    }
}