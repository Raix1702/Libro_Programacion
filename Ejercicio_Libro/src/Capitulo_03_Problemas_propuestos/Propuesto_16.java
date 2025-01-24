/*Despues de ingresar 4 notas, obtener el promedio de las tres mejores.Mostrar el mensaje "Aprobado" 
si el promedio es mayor o igual a 11; caso contrario, monstar "Desaprobado"*/

package Capitulo_03_Problemas_propuestos;
import java.util.Scanner;
public class Propuesto_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //variables
        int n1,n2,n3,n4,res;
        
        //entrada de datos
        System.out.println("Ingrese la primera nota: ");
        n1 = sc.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        n2 = sc.nextInt();
        System.out.println("Ingrese la tercera nota: ");
        n3 = sc.nextInt();
        System.out.println("Ingrese la cuarta nota: ");
        n4 = sc.nextInt();
        
        //proceso
        if (n1>n2) {
            if (n1>n3) {
                if (n1>n4) {
                    res = n1;
                }
                
                else{
                    res = n4;
                }
                
            }
            
            
        }
      
        
        
    }
}
