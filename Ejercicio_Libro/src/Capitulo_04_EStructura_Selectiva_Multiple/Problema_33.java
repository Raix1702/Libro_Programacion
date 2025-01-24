/*En una universidad se ha establecido los siguientes puntajes de ingreso para sus respectivas facultades
facultad        puntaje minimo
sistemas        100
electronica     90
industrial      80
administracion  70
De acuerdo al puntaje obtenido por un postulante, determinar la facultad a la cual ingreso o dar unun mensaje
correspondiente para el caso que no ingrese

*/

package Capitulo_04_Estructura_Selectiva_Multiple;
import java.util.Scanner;

public class Problema_33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variables
        int ptj;
        String r=" ";
        System.out.println("Ingrese su puntaje:");
        ptj = sc.nextInt();
        
        if (ptj== 70) {
            r="Ingreso a administracion";}
            else if (ptj == 80){
            r="Ingreso a industrial";
            }
            else if(ptj ==90){
                r="Ingreso a Electronica";
                    }
            else if(ptj ==100){
                r="ingreso a Sistemas";
            }
            System.out.println(r);
    }

}