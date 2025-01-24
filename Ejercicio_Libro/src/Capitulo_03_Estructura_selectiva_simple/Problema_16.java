//Dados tres numeros enteros,devolver el numero mayor
package Capitulo_03_Estructura_selectiva_simple;
import java.util.Scanner;
public class Problema_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables
        int n1,n2,n3,r;      
        //Entrada de datos
        System.out.println("Ingrese el primer numero:");
        n1=sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        n3 = sc.nextInt();
        //Procedimiento
        if(n1>n2){
            if(n1>n3){
                r=n1;
            }
            else {
                r=n3;
            }
        }
        
        else {
            if(n2>n3){
                r=n2;
            }
                else {
                r=n3;
                }
        }
        //salida
        System.out.println("El numero mayor es: " + r);
        
    }    
}
