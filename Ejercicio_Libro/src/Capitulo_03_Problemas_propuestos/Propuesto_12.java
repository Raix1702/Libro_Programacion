//Dados dos numeros enteros,devolver el numero menor

package Capitulo_03_Problemas_propuestos;
import java.util.Scanner;
public class Propuesto_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variables
        int num1,num2,menor;
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        
        //Proceso
        if (num1<num2) {
            menor = num1;
            }
        else{
             menor = num2;
            }
        System.out.println("El numero menor es: "+menor);
    }
}
