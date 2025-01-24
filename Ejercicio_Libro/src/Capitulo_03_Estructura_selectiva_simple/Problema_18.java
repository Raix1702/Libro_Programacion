//Dados 3 numeros, devolver los numeros en orden ascendente
package Capitulo_03_Estructura_selectiva_simple;
import java.util.Scanner;
public class Problema_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variables
        int n1,n2,n3;
        int mayor,medio,menor;
        //Ingresar datos
        System.out.println("Ingrese el primer numero: ");
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        n3 = sc.nextInt();
        
        //Proceso para el mayor
        
        if(n1>n2 && n1>n3){
            mayor = n1;
        }
        else if  (n2>n1 && n2>n3){
            mayor = n2;
        }
        else {
            mayor = n3;
        }
        
        //Proceso para el medio
        
        if(n1>n2 && n1<n3){
            medio = n1;
        }
        else if(n2>n1 && n2<n3){
            medio = n2;
        }
        else {
            medio = n3;
        }
        
        //Proceso para el menor
         
        if(n1<n2 && n1<n3){
            menor = n1;
        }
        else if (n2<n1 && n2<n3){
            menor = n2;
        }
        else{
            menor = n3;
        }
        System.out.println("El numero mayor es: "+ mayor);
        System.out.println("El numero del medio es: "+ medio);
        System.out.println("El numero menor es: "+menor);
        
    }
}
