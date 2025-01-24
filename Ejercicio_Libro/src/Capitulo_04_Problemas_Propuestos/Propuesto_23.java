//Dado los siguientes operadores aritmeticos(+,-,*y/), devuelva el nombre del operador

package Capitulo_04_Problemas_Propuestos;
import java.lang.classfile.instruction.SwitchCase;
import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;
public class Propuesto_23{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char oa=' ';
    String s = "";
    System.out.println("Ingrese el operador aritmetico: ");
    oa=sc.next().charAt(0);
        switch (oa) {
            case '+':System.out.println("Es una suma");
                break;
            case '-':System.out.println("Es una resta");
                break;
            case '*':System.out.println("Es una multiplicacion:");
                break;
            case'/':System.out.println("Es una division:");
                break;
            default:
                break;
        }
        System.out.println(oa);
        sc.close();
}
}