/*Es una empresa se ha determinado la siguiente politica
    terjeta/sexo        hombre      mujeres
    obrero              15%         10%
    empleado            20%         15%
Determine mediante un programa, cual sera el monto del descuento al sueldo ingreado de un trabajador.*/

package Capitulo_04_Problemas_Propuestos;
import java.util.Scanner;
public class Propuesto_25{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String trj;
    String sex,r="";

    System.out.println("Ingrese su tarjera: ");
    trj= sc.nextLine();
    System.out.println("Ingrese su sexo:");
    sex=sc.nextLine();
    
    if (trj=="Obrero") {
            switch (sex)  {
                case "hombre":r="Tiene 15% de descuento";
                    break;
                case "mujer": r="Tiene 10 porciento de descuneto";
                    break;
                    default:
                    break;
            }
        }    
    else if(trj=="empleado"){
            switch (sex) {
                case "hombre": r="Tiene 20% de descuento";
                    break;
                case "mujer": r="Tiene 15% de decuento";
                    break;
                default:
                    break;
            }
            
    }

    System.out.println(r);
}
}