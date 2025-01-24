/*ada una fecha valida, halle la fecha del siguiente dia*/

package Capitulo_04_Estructura_Selectiva_Multiple;
import java.util.Scanner;
public class Problema_39{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int dia,mes,año;
            System.out.println("Ingrese el dia: ");
            dia=sc.nextInt();
            System.out.println("ingrese el mes: ");
            mes=sc.nextInt();
            System.out.println("Ingrese el año: ");
            año=sc.nextInt();

            dia +=dia;
            System.out.println("La fecha es: "+dia+mes+año);

        





    }





}