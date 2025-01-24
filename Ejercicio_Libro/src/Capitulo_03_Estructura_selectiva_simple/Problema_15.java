//Determinar si un numero entero es par o impar
package Capitulo_03_Estructura_selectiva_simple;
import java.util.Scanner;
public class Problema_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables 
        int n;
        String r;
        //Entrada de datos
        System.out.println("Ingrese el numero");
        n = sc.nextInt();
        //Proceso
        if(n%2==0)
            r= "PAR";
        else 
            r = "IMPAR";
        //Salida
        System.out.println("El resultado es: " +r );
    }
}
