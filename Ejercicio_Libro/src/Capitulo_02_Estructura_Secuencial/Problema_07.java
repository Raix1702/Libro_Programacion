// Determinar la suma de los N primeros numeros enteros positivos (z*).Use las siguiente formula.
package Capitulo_02_Estructura_Secuencial;
import java.util.Scanner;
public class Problema_07 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n,s;
            System.out.println("Ingrese el numero: ");
            n = sc.nextInt();
            s = n*(n+1)/2;
            System.out.println("EL resultado es:"+ s);
        
    } 
}
