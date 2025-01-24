/*Al iungresar un numero entre 12 y 4 devolver la estacion del año acuerdo a la siguiente taba
numero  Estacion
1       verano
2       otoño
3       invierno
4       Primavera*/
package Capitulo_04_Estructura_Selectiva_Multiple;
import java.util.Scanner;
public class Problema_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables
        int numero;
        String estacion="";
        System.out.println("Ingrese un numero entre el 1-4");
        numero = sc.nextInt();
        //proceso   
        switch(numero){
            case 1:
                estacion ="Verano";
                break;
            case 2:
                estacion = "Otoño";
                break;
            case 3:
                estacion = "Invierno";
                break;
            case 4:
                estacion = "Primavera";
                break;
        }
            
        System.out.println("La estacion seleccionada es: "+ estacion);
            
            
            
    }
    
    
    
    
}
