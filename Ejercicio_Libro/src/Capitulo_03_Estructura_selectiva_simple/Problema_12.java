//determinar si un numero es positivo,negativo o neutro
package Capitulo_03_Estructura_selectiva_simple;
import java.util.Scanner;

public class Problema_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String r="";
        System.out.println("Ingrese el numero: ");
        num = sc.nextInt();
        if (num > 0){
            r = "positivo";
        }
        else if (num < 0){
            r = "Negativo";
        }
        else if (num == 0){
            r = "Neutro";
            
        }
        System.out.println("El numero es: "+ r);
    }
}
