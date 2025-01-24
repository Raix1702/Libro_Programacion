/*Al ingresar el numero de un mes, devolver la estacion del año de acurdo a la siguiente tabla
mes         estacion
1,2,3       Verano  
4,5,6       Otoño
7,8,9       Invierno
10,11,12    Primavera
*/
package Capitulo_04_Estructura_Selectiva_Multiple;
import java.util.Scanner;

public class Problema_30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables
        int n;
        String r="";
        System.out.println("Ingrese el numero:");
        n = sc.nextInt();
        switch(n){
            case 1,2,3: r="verano";
                break;
            case 4,5,6: r="Otoño";
                break;
            case 7,8,9: r= "Invierno";
                break;
            case 10,11,12: r="Primavera";
                break;
        }
        System.out.println("La estacion es:" + r);
        
    }

}