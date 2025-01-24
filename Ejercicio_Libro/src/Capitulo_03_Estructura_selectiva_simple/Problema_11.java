//Dado 2 numeros enteros diferentes, defvolver el numero mayor
package Capitulo_03_Estructura_selectiva_simple;
import java.util.Scanner;
public class Problema_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,total=0;
        
        System.out.println("Ingrese el 1* numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el 2* numero: ");
        num2 = sc.nextInt();
        if (num1>num2) {
            total = num1;            
        }
        else if (num2>num1){
            total = num2;
        }
        System.out.println("El numero mayor es: " + total);
    
    }
}
