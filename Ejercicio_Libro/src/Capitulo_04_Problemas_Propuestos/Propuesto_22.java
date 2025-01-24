//Lea un numero del 1 al 7 y devuelva el dia de la semana , considere que 1 es domingo

package Capitulo_04_Problemas_Propuestos;
import java.util.Scanner;
public class Propuesto_22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia;
        String r=" ";
        System.out.println("Ingrese el dia: ");
        dia = sc.nextInt();

        switch (dia) {
            case 1:r="El dia es domingo";
                break;
            case 2: r="El dia es lunes";
                break;
            case 3: r="El dia es Miercoles";
                break;
            case 4: r="El dia es Jueves";
                break;
            case 5: r="El dia es Viernes";
                break;
            case 6: r="El dia es martes";
                break;
            case 7: r="El dia es martes";
                break;
            
            default:
                break;
        }

    
        
    }

}