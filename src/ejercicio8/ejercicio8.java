package ejercicio8;

import static java.lang.Math.sqrt;

/**
 *
 * @author Jessica Aguirre Calcule a la raíz cuadrada de un numero entero.
 *
 */
public class ejercicio8 {

    private int numero;
    private double raiz;

    public double convierteRaiz() {
        if (numero != 0) {
            raiz = sqrt(numero);
            
        }else{
            System.out.println("Su valor no es válido");
        }
       return raiz;
    }
}