package Ejercicio3;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, cal1, cal2, cal3, cal4, cal5, promedio;
        String resultado;

        Scanner datos = new Scanner(System.in);


        //En este caso, la Matricula, sera la CI del alumno (CI: cedula de identidad)

        mat = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese la CI del alumno"));
        cal1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese la primer calificacion del alumno " + mat));
        cal2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese la segunda calificacion del alumno " + mat));
        cal3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese la tercera calificacion del alumno " + mat));
        cal4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese la cuarta calificacion del alumno " + mat));
        cal5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese la quinta calificacion del alumno " + mat));

        promedio = (cal1 + cal2 + cal3 + cal4 + cal5) / 5;

        if (promedio >= 6) {
            resultado = "aprobado";
        } else {
            resultado = "reprobado";
        }
            JOptionPane.showMessageDialog(null, "El alumno: " + mat + " tiene un promedio de " + promedio +"  \n" +
                    "Por lo tanto, el alumno ha " + resultado);

    }
}
