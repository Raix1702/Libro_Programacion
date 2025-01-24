/*Dados los numeros enteros de un operadod (+,-*Y/9,}
devolver la operacion de los dos nmeros segn el operador regresando.CONSIDERE QUE SI EL SEUNDO NMERO ES CERO Y El operador no 
es divisible con el primer numero entonces devolver como resultado "0"*/
package Capitulo_04_Estructura_Selectiva_Multiple;
import java.util.Scanner;
public class Problema_28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables
        char operacion;
        int n1,n2,resultado = 0;
        
        System.out.println("Ingrese la operacion a realizar: ");
        operacion = sc.next().charAt(0);
        
        System.out.println("Ingrese el primer numero: ");
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = sc.nextInt();
        switch(operacion){
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                if (n2 != 0) {
                
        }
        System.out.println("El resultado es: " + resultado);
    }

    }
}