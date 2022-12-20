package Ejercicio8;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> sueldos = new ArrayList<Integer>();
        int sue, nSue;
        int empleado = 1;
        int nomina = 0;

        //en este caso el grupo de empleado constara de 10 de ellos
            for (int i = 0; i < 10; i++) {

                sue = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese el sueldo del empleado " + empleado));
                sueldos.add(i,sue);
                empleado++;

           if (sue < 1000) {
                nSue = sue + ((sue /100) * 15);
                sueldos.remove(i);
                sueldos.add(i,nSue);
            }
            else {
                nSue = sue + ((sue /100) * 12);
                sueldos.remove(i);
                sueldos.add(i,nSue);
            }

            nomina = nomina + sueldos.get(i);
        }

          empleado=1;
        for (int i = 0; i < 10; i++) {
            System.out.println("El nuevo sueldo del empleado " + empleado + " es: " + sueldos.get(i));
            empleado++;
        }

        System.out.println(" \n La nueva nomina de la empresa es: "+ nomina);

        }
    }

