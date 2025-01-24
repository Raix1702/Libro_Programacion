/*Dadas 3 longitudes si forman un triangulo, devolver el tipo de triangulo segun sus lados
equilatero = sus tres lados son iguales
isoceles = tiene dos lados iguales
escaleno = sus tres lados son diferente*/
package Capitulo_03_Problemas_propuestos;
import java.util.Scanner;
public class Propuesto_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        String res;
        
        System.out.println("Ingrese el primer lado: ");
        a = sc.nextInt();
        System.out.println("Ingrese el segundo lado: ");
        b = sc.nextInt();
        System.out.println("Ingrese el tercer lado: ");
        c = sc.nextInt();
        
        //equilatero
        if (a == b & b== c) {
            res = "équilatero";
        }
        //isoceles
        else if (a == b & b == c || a == c){
        }   
        //escaleno
        else {
            res = "escaleno";
        }
    }    
}
