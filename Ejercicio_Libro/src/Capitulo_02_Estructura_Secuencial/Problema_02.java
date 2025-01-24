/*
 Hallar el cociente y el residuo de dos numeros enteros
 */
package Capitulo_02_Estructura_Secuencial;
import java.util.Scanner;
public class Problema_02 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n1,n2,dv,r;
    
        System.out.println("------Division------");
        System.out.println("Ingrese el primer numero");
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = sc.nextInt();
        dv = n1/n2;
        r = n1%n2;
        System.out.println("El cociente es: "+dv);
        System.out.println("El residuo es: "+r);
    }
    
}
