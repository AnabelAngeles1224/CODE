package src;

import java.util.Random;

//Escriba un programa que reciba un número n, que será el tamaño de un array que se creará
// y llenará con números aleatorios. Puede usar la clase Random para generar los números aleatorios.
// Luego, imprima los elementos del array.
public class Ejercicio5 {
    public static int [] ImprimirArray(int tamaño){
    int[] array=new int[tamaño];

    Random random = new Random();

    for (int i=0;i<(tamaño); i++){
        array[i]= random.nextInt(100);
    }

    int n=0;
    for (int num:array){
        System.out.println("El elemento nro " + n + " es " + num);
        n++;
    }
        return array;
    }

}
