/*Crear un programa que al ingresar tres numeros enteros devuelva 
los numeros ordenados en forma ascentente y en forma descendente*/
package Capitulo_03_Problemas_propuestos;
import java.util.Scanner;
public class Propuesto_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //variables
        int n1,n2,n3,menor=0,medio=0,mayor=0;
        
        //entrada de datos
        System.out.println("Ingrese el primer numero: ");
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        n3 = sc.nextInt();
        
        //fORMA acendente
        
        //calcular menor
        if (n1<n2 & n1<n3) {
            menor = n1;
        }
        else if(n2<n1 & n2<n3){
            menor = n2;
        }
        else if (n3<n1 & n3<n2) {
            menor = n3;
        }
        
        //calcular medio
        if (n2<n1 & n1<n3) {
            medio = n1;
        }
        else if(n1<n2 & n2<n3){
            medio = n2;
        }
        else if(n1<n3 & n3<n2){
            medio = n3;
        }
        
        //calcular mayor
        if (n2<n1 & n3<n1) {
            mayor = n1;
            
        }
        else if(n1<n2 & n3<n2){
            mayor = n2;
        }
        else if(n1<n3 & n2<n3){
            mayor = n3;
        }
        
        //forma descendente
        
        //calcular mayor
        if(n3<n1 & n2<n1){
            mayor = n1;
        }
        else if (n1<n2 & n3<n2) {
            mayor = n2;
        }
        else if (n1<n3 & n2<n3) {
            mayor = n3;
        }
        
        //calcular medio
        if (n2<n1 & n1<n3) {
            medio = n1;
        }
        else if (n1<n2 & n2<n3) {
            medio = n2;
        }
        else if (n1<n3 & n3<n2) {
            medio = n3;
        }
        
        //calcular menor
        if (n1<n2 & n1<n3) {
            menor = n1;
        }
        else if (n2<n1 & n2<n3) {
            menor = n2;
        }
        else if (n3<n2 & n3<n1) {
            menor = n3;
        }
        
        System.out.println("Respuesta en forma ascendente: " + menor + medio + mayor);
        System.out.println("Respuesta en forma descendente: " + mayor + medio + menor);
    }    
        
}
