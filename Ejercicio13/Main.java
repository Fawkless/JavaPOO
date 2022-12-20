package Ejercicio13;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int numero, potencia;

        numero= Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese el valor que desea utilizar"));
        potencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese la potencia a la que desea elevar su valor"));

        for (int i=1; i<potencia;i++) {
            numero= numero*potencia;
        }
        JOptionPane.showMessageDialog(null, "El resultado es: " + numero);
    }
}
