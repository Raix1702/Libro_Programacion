/*Dda una letra determinar si es vocal*/

package Capitulo_04_Estructura_Selectiva_Multiple;
import java.util.Scanner;

public class Problema_29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variables
        char vocal;
        String resultado="";
        System.out.println("Ingrese la vocal");
        vocal= sc.next().charAt(0);

        //proceso

        if(vocal == 'a' || vocal =='A'){
            resultado = "Es una vocal";}
            else if(vocal =='b'|| vocal =='B'){
                    resultado = "Es una vocal";
                    }
            else if(vocal =='c'|| vocal =='C'){
                    resultado = "Es una vocal";
                    }
            else if(vocal =='d'|| vocal =='D'){
                    resultado = "Es una vocal";
                    }
            else if(vocal =='e'|| vocal =='E'){
                    resultado = "Es una vocal";
                    }
        
        System.out.println(resultado);
}
}