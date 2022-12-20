package Ejercicio4;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {


        int sue, nSue;

        sue = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese el sueldo del empleado"));

        if (sue < 1000) {
            nSue = sue + ((sue /100) * 15);
            JOptionPane.showMessageDialog(null, "El nuevo sueldo del empleado es: " + nSue);
        } else {
            nSue = sue + ((sue /100) * 12);
            JOptionPane.showMessageDialog(null, "El nuevo sueldo del empleado es: " + nSue);

        }


    }
}
