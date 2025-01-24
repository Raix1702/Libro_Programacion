// Dado el valor de venta de un producto, hallar el IGV(19%) y el precio de venta

package Capitulo_02_Estructura_Secuencial;
import java.util.Scanner;
public class Problema_03 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        double prod,igv,ptotal;
        System.out.println("-----Calcular IGV-----");
        System.out.println("ingrese el valor del producto: ");
        prod = sc.nextInt();
        igv = prod * 0.19;
        ptotal= prod + igv;
        System.out.println("El IGV del producto es de: "+igv);
        System.out.println("El precio final del producto es de:"+ptotal);
        
}
}
