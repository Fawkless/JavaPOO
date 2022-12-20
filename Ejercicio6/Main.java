package Ejercicio6;


import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese el numero deseado"));

        for ( int i=1; i<11;i++) {
            System.out.println( num + "x" + i + "=" + num*i);
        }


    }
}
