// Hallar la potencia de a,dibde a y n pertenecen a z(numeros enteros positivos)

package Capitulo_02_Estructura_Secuencial;
import java.util.Scanner;
public class Problema_04 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int base,exponente;
        System.out.println("Ingrese el numero'a': ");
        base=sc.nextInt();
        System.out.println("Ingrese la potencia 'b':");
        exponente = sc.nextInt();
        
        System.out.println("El resultado es: "+Math.pow(base,exponente));
        
    }
}
