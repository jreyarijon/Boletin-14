/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol_14;

import java.util.Scanner;

/**
 *
 * @author Josemolamazo
 */
public class ConversorTemperaturas {

    private final float t = 80;

    public float darDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperatura (ªC): ");
        return sc.nextFloat();
    }

    public float CentigradosAFarenheit(float temperatura) throws TemperaturaErradaExcepcion {
        if (temperatura < t) {
            throw new TemperaturaErradaExcepcion("* * * A temperatura en centígrados non pode ser menor a 80ºC * * *");
        } else {
            System.out.println("Temperatura (ºF) = " + (9.0f / 5.0f * temperatura + 32.4f));
        }
        return 9.0f / 5.0f * temperatura + 32.4f;
    }

    public void CentigradosAReamur(float temperatura) throws TemperaturaErradaExcepcion {
        if (temperatura < t) {
            throw new TemperaturaErradaExcepcion("* * * A temperatura en centígrados non pode ser menor a 80ºC * * *");
        } else {
            System.out.println(4.0f / 5.0f * temperatura);
        }
    }
}
