//Dados 2 numeros determinar si son iguales o diferentes
package Capitulo_03_Problemas_propuestos;
import java.util.Scanner;
public class Propuesto_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //variables
        int num1,num2;
        String res;
        
        //entrada de datos
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        
        //proceso
        if (num1 == num2) {
            res = "igual";
        }
        else{
            res = "diferente";
        }
        
        //salida
        System.out.println("El resultado es " + res);
    }
  
}
