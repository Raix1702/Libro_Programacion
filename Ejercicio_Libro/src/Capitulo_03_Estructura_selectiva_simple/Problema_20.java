//Ejercicio 20
package Capitulo_03_Estructura_selectiva_simple;
import java.util.Scanner;
public class Problema_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variables
        double consumo,descuento,impuesto,pbase,total;
        //Entrada
        System.out.println("Ingrese el monto de su consumo: ");
        consumo = sc.nextDouble();
        //Proceso
        if(consumo >=1&& consumo<=100){
            descuento = consumo*0.10;
        }
        
        else if (consumo >=101&& consumo<=199){
            descuento = consumo*0.20;
        }
        
        else{
            descuento = consumo*0.30;
        } 
        impuesto = consumo*0.19;   
        pbase = consumo-descuento;
        total = pbase+impuesto;
        //salida
        System.out.println("El descuento es de: " + descuento);
        System.out.println("El impuesto es de: "+ impuesto);
        System.out.println("El monto total es de: "+ total);
        
    }
}
