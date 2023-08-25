package src;

//Implemente una aplicación que permita calcular el pago que debe realizar una familia por el consumo de agua potable.
// Se sabe que existe un pago fijo de $10.00 y que los primeros 50 litros de agua no tienen costo.
// Entre 51 y 200 litros se cobra $0.5 por litro, y más de 200 litros a $1.5 por litro.
public class Ejercicio3 {
    public static void CalcularPagoAgua(int litros, int pagoFijo){
        double total =0 ;

        if (litros>50) {
            if (litros <= 200) {
                total = pagoFijo + litros * 0.5;
            } else {
               total= pagoFijo + 150*0.5 + (litros-200)*1.5;
            }
        }
        System.out.println("El pago total es de $" + total);
    }
}
