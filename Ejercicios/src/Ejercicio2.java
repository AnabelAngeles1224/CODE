package src;
//Se le pide implementar un sistema de ingreso digital para una fiesta de quince años. Para ello,
// se han determinado una serie de reglas. Todas las personas con edades mayores o iguales a 15 años
// solo pueden entrar si traen regalos. Los jóvenes menores de 15 años entran gratis a la fiesta.
// Implemente una aplicación que permita ingresar la edad de la persona y determine si puede pasar o no.

public class Ejercicio2 {

    public static  void ValidarIngreso(String valor, int edad){

        if (valor.equals("-1") && edad>=15 ) {
            System.out.println("No puede ingresar a la fiesta, debe traer regalo");
        }else{
            System.out.println("Puede ingresar a la fiesta");
        }
    }
}
