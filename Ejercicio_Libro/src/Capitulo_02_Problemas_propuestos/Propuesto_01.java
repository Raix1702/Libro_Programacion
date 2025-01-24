//Dado dos numeros enteros (z) ayb,Hallar a + b y a - b
package Capitulo_02_Problemas_propuestos;
import java.util.Scanner;
public class Propuesto_01 {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int n1,n2;
    int r1,r2;
        System.out.println("Ingrese el primer numero");
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = sc.nextInt();
        r1 = n1 + n2;
        r2 = n1 - n2;
        System.out.println("La suma de los numeros"+ n1 + "+" + n2 + "es: " + r1);
         System.out.println("La resta de los numeros"+ n1 + "-" + n2 + "es: " + r2);
    }
}
