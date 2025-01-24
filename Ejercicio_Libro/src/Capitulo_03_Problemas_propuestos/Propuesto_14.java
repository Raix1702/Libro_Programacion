/*Dado un numero entero, devolver el doble del numero si el numero es positivo,
el triple del numero si es negativo; y cero si el numero es neutro*/
package Capitulo_03_Problemas_propuestos;
import java.util.Scanner;
public class Propuesto_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //variables
        int num, res;
        
        //entrada de datos
        System.out.println("Ingrese el numero: ");
        num = sc.nextInt();
        
        //proceso de calculo
        if (num>=1) {
            res = num*2;
        }
        else if (num<=-1){
            res = num*3;
        }
        else{
            res = 0;
        }
        
        //salida
        System.out.println("El resultado es: " + res);
    }
}
