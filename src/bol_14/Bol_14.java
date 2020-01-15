/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol_14;

/**
 *
 * @author Josemolamazo
 */
public class Bol_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConversorTemperaturas Obj = new ConversorTemperaturas();
        try {
            Obj.CentigradosAFarenheit(Obj.darDatos());
            Obj.CentigradosAReamur(Obj.darDatos());
        } catch (TemperaturaErradaExcepcion error) {
            System.out.println("¡ERROR! " + error.getMessage());
        }

    }

}
