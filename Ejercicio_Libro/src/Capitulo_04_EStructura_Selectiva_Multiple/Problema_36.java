/*Una empresa ha establecido diferentes precios para sus producgos , segun la calidad
        producto/calidad     1       2       3
        1                   5000    4500    4000
        2                   4500    4000    3500
        3                   4000    3500    3000

*/

package Capitulo_04_Estructura_Selectiva_Multiple;
import java.util.Scanner;
public class Problema_36{
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int prod,cali;
                String res=" ";
                System.out.println("Que producto desea:");
                        prod = sc.nextInt();
                System.out.println("Con que calidad lo desea: ");
                        cali = sc.nextInt();

                        switch (prod) {
                                case 1:
                                        switch (cali) {
                                                case 1: res = "El precio es de 5000 soles";
                                                        break;
                                                case 2: res = "El precio es de 4500 soles";
                                                        break;
                                                case 3: res = "El precio es de 4000 soles";
                                                        break;
                                                default:
                                                        break;
                                                
                                        
                                        }
                                case 2:
                                        switch (cali) {
                                                case 1: res = "El precio es de 4500 soles";
                                                        break;
                                                case 2: res = "El precio es de 4000 soles";
                                                        break;
                                                case 3: res = "El precio es de 3500 soles";
                                                        break;
                                                default:
                                                        break;
                                                
                                        
                                        }
                                case 3:
                                        switch (cali) {
                                                case 1: res = "El precio es de 4000 soles";
                                                        break;
                                                case 2: res = "El precio es de 3500 soles";
                                                        break;
                                                case 3: res = "El precio es de 3000 soles";
                                                        break;
                                                default:
                                                        break;
                                        
                                
                                        }
                        
                        }

                        System.out.println(res);

                        
                        

                        
                
        }

}