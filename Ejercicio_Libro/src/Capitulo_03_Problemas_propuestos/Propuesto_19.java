//Dadas 3 longitudes, diga si forma un triangulo
package Capitulo_03_Problemas_propuestos;
import java.util.Scanner;
public class Propuesto_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        String res;
        
        System.out.println("Ingrese la primera longitud: ");
        a = sc.nextDouble();
        System.out.println("Ingrese la segunda longitud: ");
        b = sc.nextDouble();
        System.out.println("Ingrese la tercera longitud: ");
        c = sc.nextDouble();
        
        if( a<(b+c) ^ a>(b-c) ){
            res = "Es triangulo: ";
        }
        else if( b<(a+c) ^ b>(a-c) ){
            res = "Es triangulo: ";
        }
        else if( c<(a+b) ^ c>(a-b) ){
            res = "Es triangulo: ";
        }
        else{
            res = "No es un triangulo: ";
        }
        System.out.println("El resultado es:  " + res);
    }
}
