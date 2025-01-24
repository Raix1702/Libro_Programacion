//Crea un programa para encontrar el area de un circulo, use la formula  a=π.r²
package Capitulo_02_Estructura_Secuencial;
import java.util.Scanner;
public class Problema_09 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float r,a;
        System.out.println("Ingrese el radio del circulo:");
        r = sc.nextFloat();
        //a = (float)3.14*(r*r);
        a = (float)(3.14*(Math.pow(r, 2.0)));
        System.out.println("El Area del circulo es: "+a);
        sc.close();
    }
}
