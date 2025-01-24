//Dado un numero entero de un digito(0 al 9), devolver el nmero en letras
package Capitulo_04_Estructura_Selectiva_Multiple;
import java.util.Scanner;

public class Problema_27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //variables
        int numero;
        String letra="";
        System.out.println("Ingrese el numero del 1 al 9: ");
        numero = sc.nextInt();
        
        //proceso
        switch(numero){
            case 1:letra = "a";
                break;
            case 2: letra = "b";
            break;
            case 3: letra = "C";
                    break;
            case 4: letra = "d";
                    break;
            case 5: letra = "e";
                    break;
            case 6: letra = "f";
                    break;        
            case 7: letra = "g";
                    break;        
            case 8: letra = "h";
                    break;        
            case 9: letra = "i";
                    break;
         }
        System.out.println("El numero elegido es:"+ numero + "y la estacion seria: " + letra);
        
        
        
    }
    
}