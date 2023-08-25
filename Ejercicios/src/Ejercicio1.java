package src;

import java.util.Scanner;
//Determinar la cantidad de dinero que recibirá un trabajador por concepto de las horas extras trabajadas en una empresa.
// Sabiendo que cuando las horas de trabajo exceden de 40, el resto se considera como horas extra y estas se pagan al doble
// de una hora normal cuando no exceden las 8 horas; si las horas extras exceden de 8, se pagan las primeras 8 al doble de
// lo que se paga por una hora normal y el resto al triple. El trabajador cobra por hora $40.

public class Ejercicio1 {


    final int HORA_TRABAJADOR =40;

    public  Integer calcularHorasExtras (int horas_trabajadas) {
        if (horas_trabajadas>40 && horas_trabajadas<=48) {
            return HORA_TRABAJADOR*2*horas_trabajadas;
        } else if (horas_trabajadas>48) {
            return HORA_TRABAJADOR*3*horas_trabajadas;
        }
        else
        {
            return HORA_TRABAJADOR*horas_trabajadas;
        }

    }

}
