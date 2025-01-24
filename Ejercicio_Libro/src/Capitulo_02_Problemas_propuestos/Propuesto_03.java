//Dada una cantidad de milimetros , expresarlo en la maxima cantidad de metros, el resto en decimetros,centimetros y milimetros
package Capitulo_02_Problemas_propuestos;
import java.util.Scanner;
public class Propuesto_03 {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int entrada;
    //mi = milimetro/me = metro/d=decimetro/c=centimetro
    int mi=0,me=1000,d=100,c=10;
        System.out.println("Ingrese la medida en milimetros: ");
        entrada = sc.nextInt();
        me = entrada/me; 
        d = entrada/d;
        c= entrada/c;
        mi = entrada;
        System.out.println("-----COONVERCION-----");
        System.out.println("La medida en metros es de:"+me);
        System.out.println("La medida en decimentros es de: "+ d);
        System.out.println("La medida en centimetros es de: "+c);
        System.out.println("La medida en milimetros es de: " + mi);
        
    }
   
}
