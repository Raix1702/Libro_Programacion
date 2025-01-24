/*Determine el importe a pagar para el examen de administracion de una universidad,
cuyo valor depende del nivel socioeconomico y el colegio de procedencia
            Nivel Social
colegio     a   b   c
Nacional    300 200 100
Particular  400 300 200
*/

package Capitulo_04_Estructura_Selectiva_Multiple;
import java.util.Scanner;
public class Problema_34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int cp;
        String ns;
        String total="|";

        System.out.println("Ingrese su colegio de pertenencia: ");
        System.out.println("Ingrese 1 si es nacional , 2 si es particular:");
        cp=sc.nextInt();
        System.out.println("Ingrese su nivel socioeconomico: (a,b,c)");
        ns = sc.nextLine();
        if(cp == 1){
            switch(ns){
                case "a": total = "El costo de su matricula es de 300 soles";
                    break;
                case "b": total = "El costo de su matricula es de 200 soles";
                    break;
                case "c":total = "El costo de su matricula es de 100 soles";
                    break;
            }


        }
        else if (cp == 2){
            switch(ns){
                case "a":total = "El costo de su matricula es de 400 soles";
                    break;
                case "b": total = "El costo de su matricula es de 300 soles";
                    break;
                case "c": total = "El costo de su matricula es de 200 soles";
                    break;

            }

        }

        System.out.println(total);
    
    
    }


}