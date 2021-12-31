package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Jessica Aguirre Calcule el área de un triángulo cuando se conocen 2
 * lados y el ángulo que forman. A = (b · h) / 2
 *
 */
public class ejercicio6 {

    private int area;
    private int L1;
    private int L2;
    private int altura;
    private int base = 4;

    public int calculaArea() {
        System.out.println("Por favor ingrese el valor del lado1 de su triángulo");
        Scanner lectura = new Scanner(System.in);
        L1 = lectura.nextInt();
        System.out.println("Por favor ingrese el valor del lado2 de su triángulo");
        L2 = lectura.nextInt();
        altura = L1 * 2 + L2 * 2;
        area = base * altura / 2;
        return area;
    }
}
