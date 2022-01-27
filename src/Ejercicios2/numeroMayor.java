package Ejercicios2;

import java.util.Scanner;

/**
 *
 * @author Jessica Aguirre
 */
public class numeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main_three() {
        int num1, num2, num3;
        boolean isasc = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite tres numeros");

        System.out.println("Digite el primer numero");
        num1 = leer.nextInt();
        System.out.println("Digite el segundo numero");
        num2 = leer.nextInt();
        System.out.println("Digite el tercer numero");
        num3 = leer.nextInt();

        if (num1 < num2 & num2 < num3) {
            isasc = true;
            System.out.println("Es ascendente");
        } else {
            isasc = false;
            System.out.println("Es descendente");
        }
    }

    public static void main_four() {
        //ejercicio 
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el primer numero");
        num1 = leer.nextInt();
        System.out.println("Digite el segundo numero");
        num2 = leer.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " es multiplo de " + num2);
        } else {
            System.out.println(num1 + " NO es multiplo de " + num2);
        }

    }

    public static void main_five() {
        /*En una universidad para aprobar un curso se tienen como política considerar 3
        notas la nota de trabajos T, la nota de medio ciclo M y la de 
        fin de ciclo F, cada una tiene un peso de 50%, 20% y 30%
        respectivamente, realice un algoritmo que permite determinar 
        el estado de un estudiante según sus notas.*/
        int T;
        int M;
        int F;
        int sumar;
        boolean estado = true;
        System.out.println("Por favor digite el porcentaje que obtuvo en la nota de trabajos");
        Scanner Lector = new Scanner(System.in);
        T = Lector.nextInt();
        System.out.println("Por favor digite el porcentaje que obtuvo en la nota de medio ciclo");
        M = Lector.nextInt();
        System.out.println("Por favor digite el porcentaje que obtuvo en la nota final");
        F = Lector.nextInt();
        if (T > 50) {

            System.out.println("Error la nota máxima es de 50%");
            System.out.println("Por favor digite el porcentaje que obtuvo en la nota de trabajos");
            T = Lector.nextInt();
            System.out.println("Por favor digite el porcentaje que obtuvo en la nota de medio ciclo");
            M = Lector.nextInt();
            System.out.println("Por favor digite el porcentaje que obtuvo en la nota final");
            F = Lector.nextInt();
        }
        if (M > 20) {
            System.out.println("Error la nota máxima es de 20%");

            System.out.println("Por favor digite el porcentaje que obtuvo en la nota de medio ciclo");
            M = Lector.nextInt();
            System.out.println("Por favor digite el porcentaje que obtuvo en la nota final");
            F = Lector.nextInt();
        }
        if (F > 30) {
            System.out.println("Error la nota máxima es de 30%");
            System.out.println("Por favor digite el porcentaje que obtuvo en la nota final");
            F = Lector.nextInt();
        }

        sumar = T + M + F;
        if (sumar >= 70) {
            System.out.println("El estado del estudiante es aprobado");
        } else {
            System.out.println("El estado del estudiante es Reprobado");
        }

    }

    public static void main_six() {
        /*Un alumno es calificado con a, b, c ó d. 
         Será bueno si obtuvo un a, regular si obtuvo un b, malo si obtuvo un c,
        y  pésimo si obtuvo un d, realice un algoritmo que muestre el calificativo 
       de un estudiante.*/
       
        String variable;
        System.out.println("Por favor digite la letra que ha obtenido como calificación");
        Scanner Lector = new Scanner(System.in);
        variable= Lector.nextLine();
        
        switch (variable){
        case "a" :
        System.out.println("La calificación del alunmo es buena");
        break;
        case "b" :
        System.out.println("La calificación del alunmo es regular");
        break;
        case "c" :
        System.out.println("La calificación del alunmo es mala");
        break;
        case "d" :
        System.out.println("La calificación del alunmo es pésimo");
        break;
        default :
        System.out.println("Error las calificaciones son a,b,c o d solamente");
    }
        
                
    }

    public static void main(String[] args) {
       main_six();
    }

}
