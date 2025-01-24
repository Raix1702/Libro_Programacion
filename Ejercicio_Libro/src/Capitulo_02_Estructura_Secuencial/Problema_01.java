/* Para la solución de este problema, se requiere que el usuario ingrese dos números enteros:
luego, que el sistema realice el cálculo respectivo para hallar la suma. Para ello usará la siguiente expresión.
Expresión matemática*/

package Capitulo_02_Estructura_Secuencial;
import java.util.Scanner;
public class Problema_01 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //entrada
        //declarar variables
        int n1,n2;
        int suma;
        //proceso
        System.out.println("Ingrese el primer numero:");
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero:");
        n2 = sc.nextInt();
        suma = n1 + n2;
        //salida
        System.out.println("El resultado de la suma es: "+suma);
    }
}
