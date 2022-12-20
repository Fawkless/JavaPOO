package Ejercicio11;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int sueldo, cantSueldos;
        int menorSueldo= 0;
        int mayorSueldo = 0;

        cantSueldos = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese la cantidad de sueldos con la que desea trabajar"));

        for (int i = 0; i < cantSueldos; i++) {
            sueldo = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese un sueldo"));

            if (menorSueldo == 0){
                menorSueldo=sueldo;
            }

            if (sueldo < menorSueldo) {
                menorSueldo = sueldo;
            }
            if (sueldo > mayorSueldo)
                mayorSueldo = sueldo;
        }

        System.out.println("El menor sueldo es : " + menorSueldo);
        System.out.println("El mayor sueldo es : " +mayorSueldo);
    }
}
