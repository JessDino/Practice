package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Jessica Aguirre Calcule el área y volumen de un paralelepípedo de
 * largo, ancho y altura conocidas. Para calcular el área de la superficie de un
 * paralelepípedo tenemos realizar los siguientes cálculos: a. Multiplicar el
 * ancho por el alto y por el largo b. Sumar la cantidad de las caras. En el
 * caso más general, el volumen de un paralelepípedo se calcula multiplicando el
 * área de cualquiera de sus caras por la altura respecto de dicha cara.
 *
 */
public class ejercicio5 {

    private int caras = 6;
    private int largo;
    private int ancho;
    private int altura;
    private int area;
    private int volumen;
    private int mCara = 3;

    public int calculaArea() {
        System.out.println("Por favor ingrese el valor de ancho de su paralelepípedo");
        Scanner lectura = new Scanner(System.in);
        ancho = lectura.nextInt();
        System.out.println("Por favor ingrese el valor de largo de su paralelepípedo");
        largo = lectura.nextInt();
        System.out.println("Por favor ingrese el valor de la altura  de su paralelepípedo");
        altura = lectura.nextInt();
        area = ancho * altura * largo + caras;
        return area;
    }

    public int calculaVolumen() {
        volumen = area * mCara * altura;
        return volumen;
    }
}
