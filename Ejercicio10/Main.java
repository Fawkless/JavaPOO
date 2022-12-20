package Ejercicio10;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int monto;
        monto = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese el valor de la compra"));

        if (monto > 0 && monto <= 500){
            JOptionPane.showMessageDialog(null, "El nuevo monto a pagar es: " + monto);
        }

        if (monto > 500 && monto <= 1000){
            monto = monto - ((monto /100) * 5);
            JOptionPane.showMessageDialog(null, "El nuevo monto a pagar es: " + monto);
        }

        if (monto > 1000 && monto <= 7000){
            monto = monto - ((monto /100) * 11);
            JOptionPane.showMessageDialog(null, "El nuevo monto a pagar es: " + monto);
        }
        if (monto > 7000 && monto <= 15000){
            monto = monto - ((monto /100) * 18);
            JOptionPane.showMessageDialog(null, "El nuevo monto a pagar es: " + monto);
        }

        if (monto > 15000){
            monto = monto - ((monto /100) * 25);
            JOptionPane.showMessageDialog(null, "El nuevo monto a pagar es: " + monto);
        }


    }
}
