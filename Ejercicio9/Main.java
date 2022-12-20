package Ejercicio9;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int numero, cantNumeros;
        int menor= 0;
        int mayor = 0;

        cantNumeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese la cantidad de numeros con la que desea trabajar"));

        for (int i = 0; i < cantNumeros; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese un numero"));

            if (menor == 0){
                menor=numero;
            }

            if (numero < menor) {
                menor = numero;
            }
            if (numero > mayor)
                mayor = numero;
        }

        System.out.println("El menor numero es : " + menor);
        System.out.println("El mayor numero es : " +mayor);
    }
}




