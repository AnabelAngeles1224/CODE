package src;

//Escriba un programa en el que el usuario debe adivinar un número aleatorio entre 1 y 100.
// El programa proporcionará pistas si el número es demasiado alto o demasiado bajo. El juego
// continuará hasta que el jugador adivine correctamente el número. Al final, imprima el número
// y la cantidad de intentos realizados.

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    public static void AdivinarNumero(){
        Random random= new Random();
        Scanner scanner= new Scanner(System.in);
        int numero_generado = random.nextInt(10);
        int nroIntentos=0;

        while(true) {
            System.out.println("Adivinar nro (rango del 0 al 10)");
            String numero = scanner.nextLine();
            int numeroInt=Integer.parseInt(numero);
            if (numeroInt == numero_generado) {
                System.out.println("Se adivinó el valor del número");
                break;
            } else {
                nroIntentos++;
            }
        }
        System.out.println("Se intento adivinar " + nroIntentos + "veces");
        System.out.println("El número generado al azar era " + numero_generado);
    }
}
