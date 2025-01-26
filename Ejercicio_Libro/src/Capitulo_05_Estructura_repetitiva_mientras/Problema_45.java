//Dado un número,determinar cuantos digitos tiene
package Capitulo_05_Estructura_repetitiva_mientras;
import java.util.Scanner;
public class Problema_45{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,c=0;
        System.out.println("Ingrese el numero: ");
        n=sc.nextInt();
         
        while (n>0) {
            n=n/10;
            c++;
        }
        System.out.println("La cantidad de digitos es de: " + c);
        sc.close();
    }

}