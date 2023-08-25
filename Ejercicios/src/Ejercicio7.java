package src;
// La operación factorial se define de la siguiente manera:
// $5!=5\times4\times3\times2\times1$. Cree una clase Factorial que tenga un método llamado `resolverFactorial`
// que reciba un valor `n`, donde `n` es el valor del factorial a calcular.
public class Ejercicio7 {
    public static int resolverFactorial(int n){
        if(n<=1){
            return 1;
        }else {
            return n * resolverFactorial(n-1);
        }
    }
}
