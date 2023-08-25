package src;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Tu código aquí

        System.out.print("Ingrese nro de ejercicio a ejecutar: ");

        String nro = scanner.nextLine();

        switch(nro) {
            case "1":
                ejecutarEjercicio1();
                break;
            case "2":
                ejecutarEjercicio2();
                break;
            case "3":
                ejecutarEjercicio3();
                break;
            case "4":
                ejecutarEjercicio4();
                break;
            case "5":
                ejecutarEjercicio5();
                break;
            case "6":
                ejecutarEjercicio6();
                break;
            case "7":
                ejecutarEjercicio7();
                break;
            case "8":
                ejecutarEjercicio8();
                break;
            case "9":
                ejecutarEjercicio9();
                break;
            case "10":
                ejecutarEjercicio10();
                break;
            default:
                System.out.println("Ejercicio no válido");
        }
    }

    private static void ejecutarEjercicio10() {
        Ejercicio10.AdivinarNumero();
    }

    private static void ejecutarEjercicio9() {
        System.out.print("Indicar el tamaño del array: ");
        String tamaño = scanner.nextLine();
        int[] array = Ejercicio5.ImprimirArray(Integer.parseInt(tamaño));
        for (int i=(Integer.parseInt(tamaño)-1); i>=0; i--){
           System.out.println(array[i]);
        }
    }

    private static void ejecutarEjercicio8() {
        System.out.print("Indicar el tamaño del array: ");
        String tamaño = scanner.nextLine();
        int[] array = Ejercicio5.ImprimirArray(Integer.parseInt(tamaño));
        int valorMayor=0;
        for (int i=0; i< (array.length-1); i++) {
            if (array[i]>valorMayor){
                valorMayor= array[i];
            }
        }
        System.out.println("El valor mayor del arreglo es " + valorMayor);

    }

    private static void ejecutarEjercicio7() {
        System.out.print("Indicar tamaño factorial: ");
        String tamaño = scanner.nextLine();
        int resultado = Ejercicio7.resolverFactorial(Integer.parseInt(tamaño));
        System.out.println("El resultado es " + resultado);
    }

    private static void ejecutarEjercicio6() {
        System.out.print("Indicar el tamaño de asteriscos: ");
        String tamaño = scanner.nextLine();
        Ejercicio6.ImprimirAsteriscos(Integer.parseInt(tamaño));
    }

    private static void ejecutarEjercicio5() {
        System.out.print("Indicar el tamaño del array: ");
        String tamaño = scanner.nextLine();
        Ejercicio5.ImprimirArray(Integer.parseInt(tamaño));
    }

    private static void ejecutarEjercicio4() {
        System.out.print("Ingresar número: ");
        String num = scanner.nextLine();
        Ejercicio4.ImprimirImpares(Integer.parseInt(num)-1);
    }
    private static void ejecutarEjercicio3() {
        System.out.print("Ingresar litros consumidos: ");
        String litros = scanner.nextLine();
        int pagoFijo=10;
        Ejercicio3.CalcularPagoAgua(Integer.parseInt(litros),pagoFijo);
    }

    private static void ejecutarEjercicio2() {
        System.out.print("Ingresar edad: ");
        String edad = scanner.nextLine();
        System.out.print("Ingrese (1) si trajo regalo y (-1) si no trajo regalo:");
        String rpta = scanner.nextLine();
        Ejercicio2.ValidarIngreso(rpta, Integer.parseInt(edad));

    }

    public static void ejecutarEjercicio1 (){
        System.out.print("Ingrese las horas trabajadas: ");
        String horas_trabajadas = scanner.nextLine();
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int cantidad_recibida= ejercicio1.calcularHorasExtras(Integer.parseInt(horas_trabajadas));
        System.out.println("La cantidad recibida por el trabajador es de S/." + cantidad_recibida);
    }
}