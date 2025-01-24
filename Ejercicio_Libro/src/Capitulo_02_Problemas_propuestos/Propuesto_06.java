//Halla el area y el perimetro de un cuadrado
//Área del cuadrado = lado × lado
//Perimetro del cuadrado = 4xL;
package Capitulo_02_Problemas_propuestos;
import java.util.Scanner;
public class Propuesto_06 {
    public static void main(String[]agrs){
        Scanner sc = new Scanner(System.in);
        int l,a,p;
        System.out.println("Ingrese el lado del cuadrado: ");
        l = sc.nextInt();
        a = l*l;
        p = 4*l;
        System.out.println("El area del cuadrado es de: "+a);
        System.out.println("El perimetro del cuadrado es de: "+p);
                
    }
}
