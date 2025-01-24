//Obtener el valor de "c" y "d" de acuerdo a la siguiente formula
//El usuario debe ingresar el valor de a y b
package Capitulo_02_Problemas_propuestos;
import java.util.Scanner;
public class Propuesto_04 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int a,b;
    int c,d;
        System.out.println("Ingrese el primer valor:");
        a= sc.nextInt();
        System.out.println("Ingrese el segundo valor:");
        b = sc.nextInt();
        c = (int) (((4*Math.pow(a, 2.))+(3*b*a)+Math.pow(b,2))/(Math.pow(a, 2)-Math.pow(b,2)));
        d = (int) (((3*Math.pow(c, 2))+a+b)/4);
        System.out.println("El valor de c es: "+c);
        System.out.println("El valor de d es: "+d);
    }
}
