package Ejercicio14;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int numero, potencia;


        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese el valor que desea utilizar"));
        potencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese la potencia a la que desea elevar su valor"));

        {
            int count = 1;
            while (count < potencia) {
                numero = numero * potencia;
                count++;

            }

        }
        JOptionPane.showMessageDialog(null, "La cantidad de boletos basicos vendidos es: " + numero);
    }
}


