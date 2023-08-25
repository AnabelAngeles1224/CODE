package src;

public class Ejercicio6 {
    //Dado un valor n, genere la siguiente secuencia:
    public static void ImprimirAsteriscos(int num){

        for (int i=1; i<=num;i++) {
            for (int j=1;j <=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
