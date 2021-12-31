
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Jessica Aguirre
 */
public class ejercicio1 {
   private double  total;
   private int radio;
    
    public  double calculalog(){
        
     System.out.println("Please enter the radius of the circumference of the circle");
     Scanner lectura = new Scanner (System.in);
      radio = lectura.nextInt();
      total = 3.14+radio*2;
     return total;  
    }
}
