// Crea un programa que permita convertir una cantidad de segundos,en horas,minutos y segundos.
package Capitulo_02_Estructura_Secuencial;

import java.util.Scanner;
public class Problema_10 {
    public static void main (String[]args){
        int hora = 3600,minuto = 60;
        int ti,h,m,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en segundos: ");
        ti = sc.nextInt();
        //hora
        h = ti/3600;
        //minutos
        m = ti/60;
        //segundos
        s = ti;
        System.out.println("El tiempo en horas es:"+h);
        System.out.println("El tiempo en minutos es:"+m);
        System.out.println("El tiempo en segundos es: "+s);
      
        
    }
}
