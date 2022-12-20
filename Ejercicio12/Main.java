package Ejercicio12;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int bol1,bol2,bol3,bol4,bol5;
        int cant1,cant2,cant3,cant4,cant5;
        int totalVenta;

        bol1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese el valor del boleto basico"));
        cant1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese la cantidad de boletos basicos vendidos"));

        bol2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese el valor del boleto SemiPro "));
        cant2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese la cantidad de boletos SemiPro vendidos"));

        bol3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese el valor del boleto Pro"));
        cant3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese la cantidad de boletos Pro vendidos"));

        bol4= Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese el valor del boleto VIP"));
        cant4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese la cantidad de boletos VIP vendidos"));

        bol5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese el valor del boleto Ultimate"));
        cant5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese la cantidad de boletos Ultimate vendidos"));

        JOptionPane.showMessageDialog(null, "La cantidad de boletos basicos vendidos es: " + cant1 + ". Por un total de: " + bol1*cant1);
        JOptionPane.showMessageDialog(null, "La cantidad de boletos semiPro vendidos es: " + cant2+ ". Por un total de: " + bol2*cant2);
        JOptionPane.showMessageDialog(null, "La cantidad de boletos Pro vendidos es: " + cant3+ ". Por un total de: " + bol3*cant3);
        JOptionPane.showMessageDialog(null, "La cantidad de boletos VIP vendidos es: " + cant4+ ". Por un total de: " + bol4*cant4);
        JOptionPane.showMessageDialog(null, "La cantidad de boletos Ultimate vendidos es: " + cant5+ ". Por un total de: " + bol5*cant5);
        JOptionPane.showMessageDialog(null, "El total recaudado es: " +((bol1*cant1)+(bol2*cant2)+(bol3*cant3)+(bol4*cant4)+(bol5*cant5)));


    }
}
