//Hallar la radicacion de a, donde 'a' y 'n' pertenecen a z(numeros enteros positivos)
package Capitulo_02_Estructura_Secuencial;
import java.util.Scanner;

public class Problema_05 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Obtener Raiz");
        System.out.println("Ingrese el primer numero");
        n1= sc.nextInt();
        System.out.println("Ingrese la raiz");
        n2 = sc.nextInt();
        //utilizará la función Math.pow(n1, 1.0 / n2) para obtener la raíz n-ésima del número ingresado.
        System.out.println("El resultado es:"+ Math.pow(n1,1.0/ n2));
        
        
    }
    
}
