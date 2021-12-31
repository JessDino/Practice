
package ejercio2;

import java.util.Scanner;

/**
 *
 * @author Jessica Aguirre
 */
//Calcule el área de un trapecio cuyas base menor, base mayor y altura son conocidas.

public class ejercicio2 {
   private double area;
   private int bMenor;
   private int bMayor;
   private int altura;
   
   public double calculaArea(){
   System.out.println("Por favor ingrese el valor de la base menor de su trapecio");
   Scanner lectura = new Scanner (System.in);
   bMenor= lectura.nextInt();
   System.out.println("Por favor ingrese el valor de la base mayor de su trapecio");
   bMayor = lectura.nextInt();
   System.out.println("Por favor ingrese el valor de la altura de su trapecio");
   altura = lectura.nextInt();
  
   area= bMenor+ bMayor* altura/2;
    return area;
   }
}
