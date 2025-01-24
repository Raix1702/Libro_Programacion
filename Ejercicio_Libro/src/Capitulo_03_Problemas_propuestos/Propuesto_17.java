    /*Dado los siguientes datos de entrada: saldo anterior,tipo de movimiento"R" 
retiro o "D"(deposito) y monto de la transaccion, obtener como dato de salida el saldo actual*/
package Capitulo_03_Problemas_propuestos;
import java.util.Scanner;
public class Propuesto_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //variables
        double sa,mt,total=0;
        String tm;
        
        //entrada de datos
        System.out.println("SALDO ANTERIOR:");
        sa = sc.nextDouble();
        System.out.println("TIPO DE MOVIMIENTO(D)/(R): ");
        tm = sc.nextLine();
        System.out.println("MONTO DE LA TRANSACCION: ");
        mt = sc.nextDouble();
        
        //proceso
        //deposito
        if (tm == "D" & tm == "d") {
            total = sa+mt;
        }
        
        //retiro
        else if(tm=="R" & tm=="r"){
            total = sa-mt;
        }
        
        //salida
        System.out.println("Su saldo es de: " + total);
    }
}
