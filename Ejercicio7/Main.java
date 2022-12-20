package Ejercicio7;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int[] calificacion = new int[20];
        int total=0;
        int alumno=1;
        int promedio;


        for (int i = 0; i < 20; i++) {

            calificacion[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese la calificacion del alumno " + alumno));
            total= total+ calificacion[i];
            alumno++;
        }
        promedio=total/20;
        JOptionPane.showMessageDialog(null, "El promedio de las notas de la materia Fundamentos de programacion es: " + promedio);

        for (int i = 19; i > -1; i--) {
            System.out.println(calificacion[i] + " ");
        }
    }
}
