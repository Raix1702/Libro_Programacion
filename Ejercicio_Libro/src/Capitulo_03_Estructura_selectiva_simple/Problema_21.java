//Al ingresar el valor de una temperatura, obtener el tipo de clima segun la sguiente tabla
package Capitulo_03_Estructura_selectiva_simple;
import java.util.Scanner;
public class Problema_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variables
        int temperatura;
        String salida="";
        System.out.println("Ingrese la temperatura: ");
        temperatura = sc.nextInt();
        
        if (temperatura<10) {
           salida = "frio";           
        }
        else if (temperatura>=10 && temperatura <=20){
            salida = "nublado";
        }
        else if (temperatura>=21 && temperatura <=30){
            salida = "calor";
        }
        else if (temperatura >30){
            salida = "tropical";
        }
        System.out.println("El clima es: "+ salida  );
    }
}
