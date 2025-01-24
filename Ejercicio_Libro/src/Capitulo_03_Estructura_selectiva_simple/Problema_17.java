//Dado un numero,devolver el doble si el numero no es par , caso contrario el triple
package Capitulo_03_Estructura_selectiva_simple;
import java.util.Scanner;
public class Problema_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el numero: ");
        n= sc.nextInt();
        if(n%2==0){
            n= n*3;
        }
        else{
            n= n*2;
        }
        System.out.println("El resultado es: "+n);
    }
}
