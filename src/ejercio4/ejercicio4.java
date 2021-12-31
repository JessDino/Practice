
package ejercio4;

import java.util.Scanner;

/**
 *
 * @author Jessica Aguirre
 */
//Calcule el perímetro de un triángulo rectángulo si se conocen sus catetos.
public class ejercicio4 {
    private int c1 ;
    private int c2 ;
    private int hipotenusa;
    private int perimetro;
    public int calculaPerimetro(){
        System.out.println("Por favor ingrese el valor del cateto1 de su triángulo");
        Scanner lectura = new Scanner (System.in);
        c1= lectura.nextInt();
        System.out.println("Por favor ingrese el valor del cateto2 de su triángulo");
        c2= lectura.nextInt();
        hipotenusa=c1*2+c2*2;
        perimetro= c1+c2+hipotenusa;
        return perimetro;
    }
   
}
