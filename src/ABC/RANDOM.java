package ABC;

import java.util.Random;

/**
 *
 * @author Jessica Aguirre
 */
public class RANDOM {

    public static void main(String[] args) {
        String ABC = "ABCDEFGHIJKLMNÑOPQRSUVWXYZ";
        Random aleatorio = new Random();
        int tam = 1;
        char[] letra = new char[tam];
        for (int i = 0; i < tam; i++) {
            letra[i] = ABC.charAt(aleatorio.nextInt(ABC.length()));

        }
        System.out.println(letra);
    }
}
