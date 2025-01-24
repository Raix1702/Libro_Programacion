/*Dados dos numeros enteros a y b , determinar cual es mayor con respecto al otro
a es mayor que b
b es mayor que a
a es iguakl a b*/
package Capitulo_03_Problemas_propuestos;
import java.util.Scanner;
public class Propuesto_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        String resp;
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        if (num1>num2) {
            resp = "El numero 1 es mayor:";
            
        }
        else if (num2>num1) {
            resp = "El numero 2 es mayor";
        }
        else{
            resp = "Los nuemros son iguales";
    }
        System.out.println(resp);
    }
}
