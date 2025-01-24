/*Un restaurante ofrece un descuento del 10% para consumos de hasta 100 soles y un
descuento de 20% para consumos mayores. Para ambos caos se aplica un impuesto del 19%.
Determinar el monto del descuento, el impuesto y el importe a pagar*/

package Capitulo_03_Estructura_selectiva_simple;
import java.util.Scanner;
public class Problema_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variables
        double prod,descuento,impuesto,pbase,total;
        //Entrada de datos
        System.out.println("Ingrese el valor del producto: ");
        prod = sc.nextInt();
        //Proceso
        if (prod<=100) {
            descuento = prod * 0.10;
        }
        else{
            descuento = prod * 0.20;
        }
        impuesto = prod*0.19;
        pbase= prod - descuento;
        total = pbase + impuesto;
        System.out.println("Tiene un descuento de: "+ descuento);
        System.out.println("El impuesto (19%) a pagar es de: " + impuesto);
        System.out.println("El monto total a pagar es de: " + total);
    }
}
