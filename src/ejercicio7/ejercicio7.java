package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Jessica Aguirre
 * En un campeonato de fútbol participan n equipos.
 * ¿Cuántos partidos habrán en la primera rueda del campeonato?
 */
public class ejercicio7 {

    private int equipos;
    private int partidos;

    public void datos() {
        System.out.println("Por favor ingrese el numero de equipos ");
        Scanner lectura = new Scanner(System.in);
        equipos=lectura.nextInt();
    }

    public int calculaPartidos() {
        if (equipos % 2 == 0) {
          partidos = equipos/2;
        }
        else{
         System.out.println("La cantidad de equipos debe ser par, ingrese nuevamente el valor... ");   
        }
        return partidos;
    }
}
