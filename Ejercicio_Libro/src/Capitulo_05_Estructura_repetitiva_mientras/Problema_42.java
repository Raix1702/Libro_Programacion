//Dado un rango de números enteros, obtener la cantidad de números enteros que contiene

package Capitulo_05_Estructura_repetitiva_mientras;
import java.util.Scanner;
public class Problema_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ni,nf;
        int i,c=0;
        System.out.println("Ingrese el primer numero: ");
        ni = sc.nextInt();
        System.out.println("Ingrese el ultimo numero: ");
        nf=sc.nextInt(); 
        i=ni+1;
        while (i<nf)  {
            c++;
            i++;
        }
        System.out.println("El valor de numeros que contiene es de: " + c);
        sc.close();
    }
}
