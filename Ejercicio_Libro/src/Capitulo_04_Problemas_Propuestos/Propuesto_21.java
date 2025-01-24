/*Dado el nuero de un mes, devolver el mes en letras

*/

package Capitulo_04_Problemas_Propuestos;
import java.util.Scanner;

public class Propuesto_21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variables
        int num;
        String r=" ";
        System.out.println("Ingrese el numero: ");
        num = sc.nextInt();
        
        switch(num){
            case 1: r="Enero";
                break;
            case 2: r="febrero";
                break;
            case 3:r="marzo";
                break;
            case 4:r="abril";
                break;
            case 5: r="mayo";
                    break;
            case 6: r="junio";
                    break;
            case 7: r="julio";
                   break;
            case 8: r="agosto";
                    break;
            case 9: r="septiembre";
                    break;
            case 10: r="octubre";
                    break;
            case 11: r="nobiembre";
                    break;
            case 12: r= "Diciembre";
                break;
        }
        System.out.println("El mes es: " + r);
    }
}