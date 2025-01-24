/*Dada la edad de una persona , determinar esi es mayor o menor de edad.Considere que se considera a alguien como mayor de edad 
a si tiene 18 años o mas*/
package Capitulo_03_Problemas_propuestos;
import java.util.Scanner;
public class Propuesto_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variables
        int edad;
        String resultado;
        
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        if (edad<=17) {
            resultado = "menor de edad";
        }
        else{
            resultado = "mayor de edad";
        }
        System.out.println("Es"+resultado);
    }
}
