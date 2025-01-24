/*Dado la nota promedio de un alumno, obtener la categoria segun la siguiente tabla
promedio        Categoria
Entre 0 y 5     Pesimo
Entre 6 y 10    Malo
Entre 13 y 14  Regular
Entre 15 y 17   Bueno
Entre 18 y 20 Excelente*/

package Capitulo_04_Estructura_Selectiva_Multiple;
import java.util.Scanner;

public class Problema_31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variables
        int nota;
        String r;
        
        System.out.println("Ingrese su nota: ");
        nota = sc.nextInt();
        
        if(nota >=0 && nota <=5){
        r="pesima";}
        else if(nota >=6 && nota<=10){
                r="mala";
                }
        else if(nota>=13 && nota <=14){
                r="regular";}
        else if(nota<=15 && nota <=17){
                   r="buena";
        }
        else if(nota >= 18 && nota <=20){
                r= "excelente";}
        
           
            
        

    }   

    
}