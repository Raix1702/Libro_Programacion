//Dada la cantidad de horas obtener su equivalente en minutos y segundos
package Capitulo_02_Problemas_propuestos;
import java.util.Scanner;
public class Propuesto_07 {
    public static void main(String[] args) {
        int horas,min,seg,total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas: ");
        horas = sc.nextInt();
        min = horas*60;
        seg = horas*3600;
        System.out.println("La cantidad de horas ingresadas es de: " + horas);
        System.out.println("La cantidad de minutos es de: "+min);
        System.out.println("La cantidad de segunods es de: "+seg);
        
    }
}
