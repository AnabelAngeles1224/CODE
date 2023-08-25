package src;

//Escriba un programa que reciba un número n e imprima los números impares menores a n.
public class Ejercicio4 {

    public static void ImprimirImpares(int num) {
        while (num>0) {
            if (num%2!=0){
                System.out.println("El número es: " + num);
            }
            num -=2;
        }
    }
}
