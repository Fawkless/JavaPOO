package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);

        int numero, promedio = 0, impar= 0, par = 0;

        for ( int i=0; i<5;i++ ) {
            System.out.println("Ingrese un numero");
            numero = datos.nextInt();

            if (numero % 2 == 0) {

                promedio = promedio + numero;
                par=par +1;
            }
            else  {
                impar = impar + numero;
            }
        }
        promedio= promedio/par;
        System.out.println("El promedio de los numeros pares es: " + promedio);
        System.out.println("La suma de los impares es: "+ impar);
    }
}
