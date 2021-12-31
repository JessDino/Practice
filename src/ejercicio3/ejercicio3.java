
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Jessica Aguirre
 */
//Sabiendo que una milla equivale a 1609 Kilómetros, lea una cantidad en millas y
//conviértala a kilómetros.

public class ejercicio3 {
   public double convertir(){
     int milla=1609;
     int valor;
     System.out.println("Por favor ingrese cuantas millas desea convertir en km");
     Scanner lectura = new Scanner (System.in);
      valor = lectura.nextInt();
     int  total= milla*valor;
       System.out.println("Su conversión es:");
       return total;
   } 
}
