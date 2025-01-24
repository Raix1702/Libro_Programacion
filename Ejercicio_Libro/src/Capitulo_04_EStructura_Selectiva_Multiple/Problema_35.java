/*Dado el numero del mes y el año(cuatro digitos) de una fecha,determinar en letras que mes
es y cuantos dias tien.Considerar que febrero tiene 28 o 29 dias si el año es bisiesto,un año 
es bisientoo si es multiplo de 4, pero no de 100,y i de 400*/

package Capitulo_04_Estructura_Selectiva_Multiple;
import java.util.Scanner;

public class Problema_35{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables
        int a,m;
        String rm;

        //entrada de datos
        System.out.println("Ingrese el mes del año: ");
        m = sc.nextInt();
        System.out.println("Ingrese el numero del año: ");
        a = sc.nextInt();

        
        switch (m) {
            case 1:rm="Es Enero y tiene 31 dias";
                break;
            case 2: rm="Es Febrero y tiene 28 dias";
                break;
            case 3: rm="Es Marzo y tiene 31 dias";
                break;
            case 4: rm="Es Abril y tiene 30 dias";
                break;
            case 5: rm="Es Mayo y tiene 31 dias";
                break;
            case 6: rm="Es Junio y tiene 30 dias";
                break;
            case 7: rm="Es Julio y tiene 31 dias";
                break;
            case 8: rm="Es Agosto y tiene 31 dias";
                break;
            case 9: rm="Es Septiembre y tiene 30 dias";
                break;
            case 10: rm="Es Octubre y tiene 31 dias";
                break;
            case 11: rm="Es nobiembre y tiene 30 dias";
                break;
            case 12:rm="Es Diciembre y tiene 31 dias";
                break;
        default:
                break;
        }

    }

}